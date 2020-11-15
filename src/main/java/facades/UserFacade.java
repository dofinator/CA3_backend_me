package facades;

import dto.UserDTO;
import entities.User;
import entities.Wife;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import security.errorhandling.AuthenticationException;

/**
 * @author lam@cphbusiness.dk
 */
public class UserFacade {

    private static EntityManagerFactory emf;
    private static UserFacade instance;

    private UserFacade() {
    }

    /**
     *
     * @param _emf
     * @return the instance of this facade.
     */
    public static UserFacade getUserFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new UserFacade();
        }
        return instance;
    }

    public User getVeryfiedUser(String username, String password) throws AuthenticationException {
        EntityManager em = emf.createEntityManager();
        User user;
        try {
            user = em.find(User.class, username);
            if (user == null || !user.verifyPassword(password)) {
                throw new AuthenticationException("Invalid user name or password");
            }
        } finally {
            em.close();
        }
        return user;
    }
    
    public UserDTO editUserWife(UserDTO userDTO){
        EntityManager em = emf.createEntityManager();
        User user = em.find(User.class, userDTO.getuName());
        Wife wife = new Wife(userDTO.getWname());
        wife.addUser(user);
        
        try {
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
            
            return new UserDTO(user);
        } finally {
            em.close();
        }
    }
    
    

}

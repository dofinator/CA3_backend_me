package dto;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import entities.User;
import entities.Wife;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private String uName;
    private List<WifeDTO> wifes;
    private String role;

    public UserDTO(String uName, List<WifeDTO> wifes, String role) {
        this.uName = uName;
        this.role = role;
        this.wifes = new ArrayList();
        for (Wife wife : User.)
    }
    
    // Jeg er nået her til

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public List<WifeDTO> getWifes() {
        return wifes;
    }

    public void setWifes(List<WifeDTO> wifes) {
        this.wifes = wifes;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}

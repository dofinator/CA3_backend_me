package dto;

import entities.Wife;
import entities.Role;
import entities.User;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private String uName;
    private String wife;

    public UserDTO(User user) {
        this.uName = user.getUserName();
        this.wife = user.getWifes().get(0).getName();

    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wifes) {
        this.wife = wifes;
    }

}

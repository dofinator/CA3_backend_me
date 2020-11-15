package dto;

import entities.Role;

public class RoleDTO {

    String roleName;

    public RoleDTO(Role role) {
        this.roleName = role.getRoleName();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}

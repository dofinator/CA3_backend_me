/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Wife;
//nu skal det virke
public class WifeDTO {

    private String name;

    public WifeDTO() {
    }

    public WifeDTO(Wife wife) {
        this.name = wife.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

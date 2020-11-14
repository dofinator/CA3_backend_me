/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author chris
 */
public class FilmDTO {

    private String title;
    private String director;
    private String release_date;

    public FilmDTO(String title, String director, String release_date) {
        this.title = title;
        this.director = director;
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

  
    
    
}

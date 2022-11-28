/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.DTO;

import tutoring.BusinessObjects.Experience;

/**
 *
 * @author jaddu
 */
public class ExperienceDTO {
    private static Experience exp;
    private int experienceID;
    private String description;
    
     /**
     * Getter method for experience.
     * @return The experience.
     */
    public Experience getExp() {
        return exp;
    }
    
    /**
     * Setter method for experience.
     * @param exp The experience.
     */
    public void setExp(Experience exp) {
        this.exp = exp;
    }
    /**
     * Getter method for experience id.
     * @return The experience id.
     */
    public int getExperienceID(){
    	return experienceID;
    }
    /**
     * Setter method for experience id.
     * @param experienceID The experience id.
     */
    public void setExperienceID(int experienceID){
    	this.experienceID = experienceID;
    }
    /**
     * Getter method for description.
     * @return The description.
     */
    public String getDescription(){
    	return description;
    }
    /**
     * Setter method for  description.
     * @param description The description.
     */
    public void setDescription(String description){
    	this.description = description;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.BusinessObjects;

/**
 * Class for Experience singleton
 * @author Jaddua Jones 040898457
 */
public class Experience {
    
    
    private static Experience exp;
    private int experienceID;
    private String description;

 
    /**
     * Private constructor so getInstance method must be used
     */
    private Experience() {}
 
    /**
     * Method to get an instance of the singleton experience.
     * @return The instance of the Experience singleton
     */
    public static Experience getInstance()
    {
        if (exp==null)
            exp = new Experience();
        return exp;
    }
    
    
     /**
     * Setter method for the experience id
     * @param experienceID The experience id
     */
    public void setExperienceID(int experienceID) {
        this.experienceID = experienceID;
    }
    
     /**
     * Getter method for the experience id
     * @return The experience id
     */
    public int getExperienceID() {
        return this.experienceID;
    }
    
     /**
     * Setter method for the description
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
     /**
     * Getter method for the description
     * @return The description
     */
    public String getDescription() {
        return this.description;
    }
}

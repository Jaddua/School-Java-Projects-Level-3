/* File: RecipientDTO.java
 * Author: Jaddua Jones    040898457    
 * There is code in this lab adapted from Stanley Pieda's example.
 */
package transferobjects;

public class RecipientDTO {
    private int awardID;
    private String name;
    private String year;
    private String city;
    private String category;
    
    
    /**
     * Getter method for Award ID.
     * @return The award ID.
     */
    public Integer getAwardID() {
        return awardID;
    }
    
    /**
     * Setter method for Award ID.
     * @param awardID The award ID.
     */
    public void setAwardID(Integer awardID) {
        this.awardID = awardID;
    }
    /**
     * Getter method for name.
     * @return The name.
     */
    public String getName(){
    	return name;
    }
    /**
     * Setter method for name.
     * @param name The name.
     */
    public void setName(String name){
    	this.name = name;
    }
    /**
     * Getter method for year.
     * @return The year.
     */
    public String getYear(){
    	return year;
    }
    /**
     * Setter method for year.
     * @param year The eyar.
     */
    public void setYear(String year){
    	this.year = year;
    }
    /**
     * Getter method for city.
     * @return The city.
     */
    public String getCity(){
    	return city;
    }
    /**
     * Setter method for city.
     * @param city The city..
     */
    public void setCity(String city){
    	this.city = city;
    }
    /**
     * Getter method for category.
     * @return The category.
     */
     public String getCategory(){
    	return category;
    }
     /**
     * Setter method for category.
     * @param category The category..
     */
    public void setCategory(String category){
    	this.category = category;
    }
    
}

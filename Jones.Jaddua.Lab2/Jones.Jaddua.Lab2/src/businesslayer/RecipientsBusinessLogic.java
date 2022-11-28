/* File: AuthorsBusinessLogic.java
 * Author: Jaddua Jones    040898457    
 * There is code in this lab adapted from Stanley Pieda's example.
 */
package businesslayer;

import java.util.List;
import dataaccesslayer.RecipientsDaoImpl;
import transferobjects.RecipientDTO;
import dataaccesslayer.RecipientsDao;

/**
 * This class provides the business logic for the Recipient Data Access Object.
 * @author Jaddua Jones
 */
public class RecipientsBusinessLogic {
	
        private static final int NAME_MAX_LENGTH = 60;
	
	private RecipientsDao recipientsDao = null;
	
        /**
         * This is the default no argument constructor for the class.
         */
	public RecipientsBusinessLogic(){
		recipientsDao = new RecipientsDaoImpl();
	}
        
        /**
         * This method will print all of the recipients in the DAO.
         */
         public void printAllRecipients() {
            recipientsDao.printAllRecipients();
        }
        
         /**
          * This method will create a list of all the recipients in the DAO.
          * @return A list containing all the recipients in the DAO.
          */
	public List<RecipientDTO> getAllRecipients(){
		return recipientsDao.getAllRecipients();
	}
	
        /**
         * This method will retrieve a recipient whose Award ID matches the argument.
         * @param awardID The ID of the recipient to fetch.
         * @return A recipient whose Award ID matches the argument.
         */
	public RecipientDTO getRecipient(Integer awardID){
		return recipientsDao.getRecipientByAwardId(awardID);
	}
	
        /**
         * This method will add a recipient to the database.
         * @param recipient The recipient to add.
         * @throws ValidationException Can throw a ValidationException.
         */
	public void addRecipient(RecipientDTO recipient) throws ValidationException{
		cleanRecipient(recipient);
		validateRecipient(recipient);
		recipientsDao.addRecipient(recipient);
	}
	
        /**
         * This method will update a recipient in the database.
         * @param recipient The recipient to update.
         * @throws ValidationException Can throw a ValidationException.
         */
	public void updateRecipient(RecipientDTO recipient) throws ValidationException{
		cleanRecipient(recipient);
		validateRecipient(recipient);
		recipientsDao.updateRecipient(recipient);
	}
	
        /**
         * This method will delete a recipient from the database.
         * @param recipient The recipient to delete.
         */
	public void deleteRecipient(RecipientDTO recipient){
		recipientsDao.deleteRecipient(recipient);
	}
	
        /**
         * This method will clean a recipient for the database.
         * @param recipient The recipient to clean.
         */
	private void cleanRecipient(RecipientDTO recipient){
		if(recipient.getName() != null){ 
			recipient.setName(recipient.getName().trim());
		}
	}
	
        /**
         * This method will validate a recipient for the database.
         * @param recipient The recipient to validate.
         * @throws ValidationException Can throw a ValidationException.
         */
	private void validateRecipient(RecipientDTO recipient) throws ValidationException{
		validateString(recipient.getName(), "Name", NAME_MAX_LENGTH, true);
	}
	
        /**
         * This method will validate a string.
         * @param value The string to validate.
         * @param fieldName A value for validating.
         * @param maxLength The maximum length of the string.
         * @param isNullAllowed Whether a null string is allowed.
         * @throws ValidationException Can throw a ValidationException.
         */
	private void validateString(String value, String fieldName, int maxLength, boolean isNullAllowed)
	    throws ValidationException{
		if(value == null && isNullAllowed){
			// return; // null permitted, nothing to validate
		}
		else if(value == null && ! isNullAllowed){
		    throw new ValidationException(String.format("%s cannot be null", 
		    		fieldName));
		}
		else if(value.length() == 0){
			throw new ValidationException(String.format("%s cannot be empty or only whitespace", 
					fieldName));
		}
		else if(value.length() > maxLength){
			throw new ValidationException(String.format("%s cannot exceed %d characters", 
					fieldName, maxLength));
		}
	}
	
}

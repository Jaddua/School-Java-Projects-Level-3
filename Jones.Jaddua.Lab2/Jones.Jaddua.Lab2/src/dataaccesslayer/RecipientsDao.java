/* File: RecipientDataAccessObject.java
 * Author: Jaddua Jones    040898457    
 * There is code in this lab adapted from Stanley Pieda's example.
 */
package dataaccesslayer;

import java.util.List;

import transferobjects.RecipientDTO;

public interface RecipientsDao {
	List<RecipientDTO> getAllRecipients();
	RecipientDTO getRecipientByAwardId(Integer AwardID);
	void printAllRecipients();
	void addRecipient(RecipientDTO recipient);
	void updateRecipient(RecipientDTO recipient);
	void deleteRecipient(RecipientDTO recipient);
}

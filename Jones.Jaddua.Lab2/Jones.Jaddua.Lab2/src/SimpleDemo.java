/* File: SimpleDemo.java
 * Author: Jaddua Jones    040898457    
 * There is code in this lab adapted from Stanley Pieda's example.
 */
import businesslayer.RecipientsBusinessLogic;
import businesslayer.ValidationException;
import transferobjects.RecipientDTO;

import java.util.List;
public class SimpleDemo {

	public void demo(){
		try{
			RecipientsBusinessLogic logic = new RecipientsBusinessLogic();
			List<RecipientDTO> list = null;
			RecipientDTO recipient = null;
			
			System.out.println("Printing Recipients");
			list = logic.getAllRecipients();
                        printRecipients(logic);
			
			System.out.println("Printing One Recipient");
			recipient = logic.getRecipient(1);
			printRecipient(recipient);
			System.out.println();
			
			System.out.println("Inserting One Recipient");
			recipient = new RecipientDTO();
			recipient.setName("Billy Bob");
                        recipient.setYear("2000");
			recipient.setCity("Ottawa");
                        recipient.setCategory("Peace");
			logic.addRecipient(recipient);
			list = logic.getAllRecipients();
                        printRecipients(logic);
			
			
			System.out.println("Updating last recipient");
			int updatePrimaryKey = list.get(list.size() - 1).getAwardID();
                        recipient = new RecipientDTO();
                        recipient.setAwardID(updatePrimaryKey);
			recipient.setName("Billy Bob");
			recipient.setYear("2010");
			recipient.setCity("Ottawa");
                        recipient.setCategory("Testing");
			logic.updateRecipient(recipient);
			list = logic.getAllRecipients();
                        printRecipients(logic);
			
			
			System.out.println("Deleting last recipient");
			recipient = list.get(list.size() - 1);
			logic.deleteRecipient(recipient);
                        list = logic.getAllRecipients();
                        printRecipients(logic);
			
			
		}
		catch(ValidationException e){
			System.err.println(e.getMessage());
		}

	}
	
	private static void printRecipient(RecipientDTO recipient){
	    	
            String output = String.format("%d, %s, %s, %s, %s",
	    			recipient.getAwardID(),
                                recipient.getName(),
	    			recipient.getYear(),
	    			recipient.getCity(),
                                recipient.getCategory());
	    	System.out.println(output);
	}
        
        private static void printRecipients(RecipientsBusinessLogic logic){
	    logic.printAllRecipients();
        }

}

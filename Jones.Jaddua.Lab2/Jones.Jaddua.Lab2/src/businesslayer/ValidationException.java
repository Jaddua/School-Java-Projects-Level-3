/* File: ValidationException.java
 * Author: Jaddua Jones    040898457    
 * There is code in this lab adapted from Stanley Pieda's example.
 */
package businesslayer;

/**
 * This class provides an exception class for use in other classes in this project.
 * @author Jaddua Jones
 */
public class ValidationException extends Exception {
	
    /**
     * This is the no argument constructor for the class.
     */
	public ValidationException(){
		super("Data not in valid format");
	}
	
        /**
         * This is a single argument constructor for the class.
         * @param message The message to display when the exception is thrown.
         */
	public ValidationException(String message){
		super(message);
	}
	
        /**
         * This is a two argument constructor for the class.
         * @param message The message to display when the exception is thrown.
         * @param throwable An instance of Throwable.
         */
	public ValidationException(String message, Throwable throwable){
		super(message, throwable);
	}
	
        /**
         * This is a single argument constructor for the class.
         * @param throwable An instance of Throwable.
         */
	public ValidationException(Throwable throwable){
		super(throwable);
	}
}

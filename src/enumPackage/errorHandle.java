package enumPackage;

import interfaces.displayMessage;

/**
 *
 * @author Robert
 */
public enum errorHandle implements displayMessage{
    MENU_INPUT ("Invalid Input."), 
    ONE_LETTER ("Invalid Input."), 
    ENTER_LETTER ("Invalid Input."), 
    MISSING_FILE ("Error. The file, puzzles.txt, is missing."),
    INCORRECT_FILE ("Error. The file, puzz;es.txt, is not formatted properly."),
    FATAL_ERROR ("Fatal Error."),
    NAME_ERROR ("Error.  Please enter your name without any spaces.");
    String message;
    
    errorHandle(String message) {
        this.message = message;   
    }
    
    @Override
    public String getMessage() { 
        return message;
    }
}

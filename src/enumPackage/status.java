package enumPackage;

import interfaces.displayMessageCorrect;

/**
 *
 * @author Robert
 */
public enum status implements displayMessageCorrect{
    
    INSTRUCTIONS ("INSTRUCTIONS"),
    PLAYING ("PLAYING"), 
    WIN_GAME ("WIN_GAME"), 
    LOSE_GAME ("LOSE_GAME"), 
    EXIT ("EXIT");
    
    String message;
    
    status(String message) {
        this.message = message;   
    }
    
    @Override
    public String displayMessageCorrect() {
        return message;
    }
}
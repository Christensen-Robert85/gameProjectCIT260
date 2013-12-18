package enumPackage;

import interfaces.displayMessage;

/**
 *
 * @author Robert
 */
public enum help implements displayMessage{
    
    WELCOME ("Welcome to the game of Hangman!\n" +
             "\n" +
             "Correctly guess all the letters of the mystery word before you are hung.\n" +
             "\n" +
             "Good Luck!"), 
    
    INSTRUCTIONS ("Correctly guess all the letters of the mystery word before you are hung. Parts of the body will be placed on the gallows for an incorrect guess.\n" +
                  "\n" +
                  "To play, enter a letter. \n" +
                  "\n" +
                  "Good Luck!");
    
        String message;
    
    help(String message) {
        this.message = message;   
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}

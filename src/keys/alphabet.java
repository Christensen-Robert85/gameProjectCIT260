package keys;

import java.io.Serializable;
import interfaces.displayArray;

/**
 *
 * @author Robert
 */

public class alphabet implements Serializable {

    private String alphabetString = "";
    
    public alphabet() {
    }

    
    private char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private char letter = '_';
    
    public String displayArray () {
        
        //System.out.println("Remaining Letters:");
        alphabetString = "";
        
        for(int i = 0; i < alphabetArray.length; i++) {
        
            if (alphabetArray[i] == letter) {
                alphabetArray[i] = '_';
            }
        
            //System.out.print(alphabetArray[i] + " ");
            alphabetString += alphabetArray[i] + " ";
        }
    
        //System.out.print("\n\n");
        return alphabetString;
        
    }

    public char[] getAlphabetArray() {
        return alphabetArray;
    }

    public void setAlphabetArray(char[] alphabetArray) {
        this.alphabetArray = alphabetArray;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

}

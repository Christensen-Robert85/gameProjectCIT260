/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject1;

/**
 *
 * @author Robert
 */
public class letterBank {
   // The array to contain the alphabet
    char[] alphabetArray = new char[26];
    
    public letterBank() {
    }

public void makeLetterBank (){
    alphabetArray= "abcdefghijklmnopqrstuvwxyz".toCharArray(); //type conversion
}
    
public void displayLetterBank (char letter) {
    
    System.out.println("Remaining Letters:");
    
    for(int i = 0; i < alphabetArray.length; i++) {
        
        if (alphabetArray[i] == letter) {
            alphabetArray[i] = '_';
        }
        
        System.out.print(alphabetArray[i] + " ");
    } 
}

    void displayLetterBank() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
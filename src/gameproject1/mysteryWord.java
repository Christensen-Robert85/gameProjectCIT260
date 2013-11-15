/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject1;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Robert
 */
public class mysteryWord {
    String mysteryWord = getWord();
    char[] mysteryArray = new char[mysteryWord.length()];
    char[] wordArray = new char[mysteryWord.length()];
    int numberOfGuesses = 6; // we could have a difficulty setting that changes this value
    
    public mysteryWord() {
        for(int i = 0; i < mysteryArray.length; i++) {
            mysteryArray[i] = '_';
        }
    }

    
    public char getLetter() {
        Scanner letterScanner = new Scanner(System.in);
        ErrorHandling errorHandling = new ErrorHandling();
    
        String letter = "0";
        
        boolean valid = false;
        while (!valid) {  
            System.out.println("Please enter a letter or enter 1 for the menu: ");
        
            letter = letterScanner.next();
            
            if (letter.length() != 1) {
                System.out.println("\nInvalid input.");
                continue;
            }
            
            if (letter.charAt(0) >= '1' && letter.charAt(0) <= '6') { //menu
                return letter.charAt(0);
            }
            
            if (!errorHandling.isChar(letter)) {
                System.out.println("\nInvalid input.");
                continue;
            }
            
            valid = true;
        }
    
        return Character.toLowerCase(letter.charAt(0));
    }
    
    public String getWord() {
        String hangmanWord = "baseball"; // we will need to modify this so it uploads a random word from a file or array
        return hangmanWord;
}    

    public String displayMysteryWord (char letter) {
    
        wordArray = mysteryWord.toCharArray(); //type conversion
        String mysteryWordOutput = "";
        boolean correctLetter = false;
    
        if (letter == '_' || letter == '1'){
    
            correctLetter = true;
        }

        for(int i = 0; i < wordArray.length; i++) {
        
            if (wordArray[i] == letter) {
                mysteryArray[i] = letter;
                correctLetter = true;
            }

            mysteryWordOutput = mysteryWordOutput + mysteryArray[i] + " ";
        }
    
        if (correctLetter == false) {
            numberOfGuesses--;
        }
    
        mysteryWordOutput = mysteryWordOutput + "(" +mysteryWord.length() +" letters)";
        return mysteryWordOutput;
    }

    public int guessesLeft(){
        return numberOfGuesses;
    }

    public boolean winGame () {
    
        if (Arrays.equals(wordArray, mysteryArray)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean loseGame () {
    
        if (numberOfGuesses < 1){
            return true;
        }
        else {
            return false;
        }
    }

    void chooseLetter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayChoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}





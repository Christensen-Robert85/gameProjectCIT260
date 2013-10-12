/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject1;
   
import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class GameProject1 {
    //instance variables
    String name;
    String instructions = "Welcome to Hangman! A game of survival.\n" 
               + "To survive, spell out the mystery word by choosing\n"
               + " the letters from the list at the bottom of the screen. Be\n" 
               + " warned though. For every incorrect choice, one more part\n"
               + " of you will be placed on the gallows.";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameProject1 myGame = new GameProject1();
        myGame.getName();
        myGame.displayHelp();  
        wordBank myWordBank = new wordBank();
        myWordBank.pickone();
        mysteryWord myMysteryWord = new mysteryWord();
        myMysteryWord.chooseLetter();
        myMysteryWord.displayChoice();
        letterBank myLetterBank = new letterBank();
        myLetterBank.makeLetterBank();
        myLetterBank.displayLetterBank();
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nHello " + this.name + "\n");
        System.out.println(this.instructions);
    }
    
    
    
}

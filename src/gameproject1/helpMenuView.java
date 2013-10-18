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
public class helpMenuView {
    public char displayHelpMenu() {
        Scanner inputScanner = new Scanner(System.in);
        ErrorHandling errorHandling = new ErrorHandling();
        
        String menuSelection = "0";
    
        do {
            System.out.println("\nPlease enter one of the following commands:"
                + "\n\t1. Continue game"
                + "\n\t2. Help"
                + "\n\t3. Change number of players"
                + "\n\t4. Start new game"
                + "\n\t5. Exit program");
            
            menuSelection = inputScanner.next();
            
        } while (errorHandling.isInteger(menuSelection) == false || menuSelection.charAt(0) < '1' || menuSelection.charAt(0) > '5');
    
        return menuSelection.charAt(0);
    }
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject1;

/**
 *
 * @author Robert
 */
public class helpMenuControl {
    boolean exitProgram = false;
    boolean startNewGame = false;
    
    /**
     *
     * @param menuSelection
     */
    public void activateHelpControl(char menuSelection) {
    
        
        
        switch(menuSelection){
            case '1':
                instructions.Instructions();
            break;
            
            case '2':
                startNewGame = true;
                //System.out.println("\n***This will start a new game.***\n");
            break;
                
            case '3':
                exitProgram = true;
            break;
            
            default:
                System.out.println();
            }
    }
    
    /**
     *
     */
    public void helpMe () {
        startNewGame = false;
    }

    private static class instructions {

        private static void Instructions() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public instructions() {
        }
    }
}

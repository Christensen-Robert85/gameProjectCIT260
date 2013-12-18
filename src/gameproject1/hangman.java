/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject1;

import java.io.IOException;
import java.io.Serializable;
import enumPackage.errorHandle;
import frames.gameFrame;

/**
 *
 * @author Robert
 */
public class hangman implements Serializable {
    public static gameFrame gameFrame = null;

    public hangman() {
    }

    public static void main(String[] args) throws IOException {
        hangman hangman = null;
        try {
            hangman = new hangman();
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    gameFrame = new gameFrame();
                    gameFrame.setVisible(true);
                }
            });
        }
        catch(Throwable e) {
            System.out.println(errorHandle.FATAL_ERROR.getMessage()
                + "\n" + e.getStackTrace().toString());
        }
        finally {
            if (hangman.gameFrame != null) {
                hangman.gameFrame.dispose();
            }
        }
    }
    
}

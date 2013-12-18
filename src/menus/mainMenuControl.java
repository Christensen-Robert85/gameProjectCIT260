package menus;

import enumPackage.status;
import java.io.Serializable;
import frames.nameFrame;
import frames.instructionsFrame;


/**
 *
 * @author Robert
 */
public class mainMenuControl implements Serializable {
    private int status;

    public mainMenuControl() {
    }
    
    public void activateControl(status status) { 

        switch(status){
            
            case PLAYING:
                nameFrame nameFrame = new nameFrame();
                nameFrame.setVisible(true);
                break;

            case INSTRUCTIONS:
                instructionsFrame instructionsFrame = new instructionsFrame();
                instructionsFrame.setVisible(true);
                break;
            
            case EXIT:
                break;
                
            /*default:
                //System.out.println();
                //return Status.MENU;*/
            }
        } 
}

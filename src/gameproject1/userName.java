package gameproject1;

import java.io.Serializable;
import enumPackage.errorHandle;
import exception.gameException;

/**
 *
 * @author Robert
 */
public class userName implements Serializable {

    private static String name = null;
    
    public userName() {
    }
   
    public void promptName(String inputName) {
        try {
             Boolean valid = false;
        
           while(!valid) {
               
               name = inputName;
               
               if (name != null) {
                    valid = true;
                }
                else {
                    throw new gameException();
                }
                 //   throw new gameException();  //
            }

        } catch(gameException exc){
            System.out.println("\n" + errorHandle.NAME_ERROR.getMessage() + "\n");
        }
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

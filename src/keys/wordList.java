package keys;

import java.io.IOException;
import interfaces.displayArray;

/**
 *
 * @author Robert
 */

public class wordList extends fileArray implements displayArray {
    
    private static final String filename = "src/keys/puzzles.txt";
    
    public wordList() throws IOException {
        
        this.randomizeList();
       // this.displayArray(); //for testing only
    }
    
    
    @Override
    public void displayArray() {
        System.out.println("\n\t======================================");
        System.out.println("\there is the randomized list of words:");

        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i] == null) {
                break;
            }
                
            System.out.println("\t    " + wordList[i]);
        }
        System.out.println("\t=======================\n");
    }

    public String[] getWordList() {
        return wordList;
    }

}

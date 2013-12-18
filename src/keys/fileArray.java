package keys;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import enumPackage.errorHandle;

/**
 *
 * @author Robert
 */

public class fileArray implements Serializable {

    public String[] wordList = null;
    public String fileName = null;
    
    public fileArray() {
    }
    
    public fileArray(String fileName) {
        this();
        this.fileName = fileName;
    }

    public void readLines() throws FileNotFoundException, IOException {
        FileReader fileReader;
        try {
            fileReader = new FileReader(fileName);
            List<String> lines;
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            lines = new ArrayList<>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        
            wordList = lines.toArray(new String[lines.size()]);
        }
        catch (FileNotFoundException e) {
            System.out.println(errorHandle.MISSING_FILE.getMessage());
            //Logger.getLogger(FileArrayProvider.class.getName()).log(Level.SEVERE, null, e);   
        }
        catch (IOException e) { 
            System.out.println(errorHandle.INCORRECT_FILE.getMessage());
            //Logger.getLogger(FileArrayProvider.class.getName()).log(Level.SEVERE, null, e);   
        }
    }
    
    public void randomizeList() throws IOException {
        
        this.readLines();
        Random rnd = new Random();
        for (int i = 0; i < wordList.length-1; i++) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = wordList[index];
            wordList[index] = wordList[i];
            wordList[i] = a;
        }
    }
}
// -------------------------------------------------------------------------------------------------------------------------

// 111) Creating File (File Handling) :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.io.File;
import java.io.IOException;

public class Lec_111_CreatingFile {
    public static void main(String[] args) {

        // Creating a File
        File myFile = new File("src/Program/Lec_111_FileHandling1.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // File created successfully.

    }
}

// -------------------------------------------------------------------------------------------------------------------------

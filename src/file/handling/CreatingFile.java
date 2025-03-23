// ------------------------------------------------------------------------------------------------------------------------------------

package file.handling;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {

        // Creating a File
        File myFile = new File("src/FileHandling/CWH_file1.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // File created successfully.

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------

package file.handling;

import java.io.File;
import java.io.IOException;

public class DeletingFile {
    public static void main(String[] args) {

        // Creating a File
        File myFile1 = new File("src/FileHandling/CWH_file3.txt");
        try {
            myFile1.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // File created successfully.

        // Deleting a File
        File myFile2 = new File("src/FileHandling/CWH_file3.txt");
        if (myFile2.delete()) {
            System.out.println("I have deleted: " + myFile2.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }
        // I have deleted: CWH_file3.txt

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
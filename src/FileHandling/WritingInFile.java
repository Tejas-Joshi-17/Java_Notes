// ------------------------------------------------------------------------------------------------------------------------------------

package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
    public static void main(String[] args) {

        // Creating a File
        File myFile1 = new File("src/FileHandling/CWH_file2.txt");
        try {
            myFile1.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // File created successfully.

        // Writing a File
        try {
            FileWriter fileWriter = new FileWriter("src/FileHandling/CWH_file2.txt");
            fileWriter.write("CodeWithHarry is one step solution for your all programming problems.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
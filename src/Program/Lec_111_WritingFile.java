// -------------------------------------------------------------------------------------------------------------------------

// 111) Writing File (File Handling) :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lec_111_WritingFile {
    public static void main(String[] args) {

        // Creating a File
        File myFile1 = new File("src/Program/Lec_111_FileHandling2.txt");
        try {
            myFile1.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // File created successfully.

        // Writing a File
        try {
            FileWriter fileWriter = new FileWriter("src/Program/Lec_111_FileHandling2.txt");
            fileWriter.write("CodeWithHarry is one step solution for your all programming problems.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

// -------------------------------------------------------------------------------------------------------------------------
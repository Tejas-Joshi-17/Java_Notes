// -------------------------------------------------------------------------------------------------------------------------

// 111) Reading File (File Handling) :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lec_111_ReadingFile {
    public static void main(String[] args) {

        // Reading a File
        File myFile = new File("src/Program/Lec_111_FileHandling2.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // CodeWithHarry is one step solution for your all programming problems.
        // Keep learning, Keep coding!

    }
}

// -------------------------------------------------------------------------------------------------------------------------
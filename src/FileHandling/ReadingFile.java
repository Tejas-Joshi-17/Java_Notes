// ------------------------------------------------------------------------------------------------------------------------------------

package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {

        // Reading a File
        File myFile = new File("src/FileHandling/CWH_file2.txt");
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

// ------------------------------------------------------------------------------------------------------------------------------------
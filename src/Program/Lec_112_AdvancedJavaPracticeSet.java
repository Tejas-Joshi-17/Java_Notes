// -------------------------------------------------------------------------------------------------------------------------

// 112) Practice Set - Advanced Java :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 1) Create a class and a method with deprecated annotation
// Q :- What is its effect on program execution
// Answer :- There is no such special effect on the program of deprecated annotation.
//           The only thing is that compiler generated a warning if we use deprecated method or class in our program
class myDeprecated {
    @Deprecated
    void meth() {
        System.out.println("I am Meth-1");
    }
}

// 2) Create an interface and Generate an instance from it
interface myInt {
    void display();
}


public class Lec_112_AdvancedJavaPracticeSet {

    @SuppressWarnings("deprecation")        // Now no warning shows while using deprecated methods
    public static void main(String[] args) {

        myDeprecated myDeprecated1 = new myDeprecated();
        myDeprecated1.meth();        // Shows Warning if @SuppressWarnings used

        myInt myInt = new myInt() {
            @Override
            public void display() {
                System.out.println("I am Display");
            }
        };


        // 3) Write a Java Program to generate a multiplication table of a given number & write into a file
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int number = scanner.nextInt();

        // Creating a File
        File myFile1 = new File("src/Program/Lec_112_AdvancedJavaPracticeSet.txt");
        try {
            myFile1.createNewFile();
            System.out.println(myFile1.getName() + "File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // File created successfully.

        String data = "Multiplication Table of " + number + " :- \n";
        for (int i = 0; i < 10; i++) {
            data += number + " * " + (i+1) + " = " + number*(i+1) + "\n";
        }

        // Writing a File
        try {
            FileWriter fileWriter = new FileWriter("src/Program/Lec_112_AdvancedJavaPracticeSet.txt");
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

// -------------------------------------------------------------------------------------------------------------------------
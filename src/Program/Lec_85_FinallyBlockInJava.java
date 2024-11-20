// -------------------------------------------------------------------------------------------------------------------------

// 85) Reality of 'finally' in Java :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

class Division_Exception extends Exception {
    @Override
    public String toString() {
        return "Input gives Infinitely Output";
    }

    @Override
    public String getMessage() {
        return "Input gives Infinitely Output";
    }
}

public class Lec_85_FinallyBlockInJava {

    public static double Division2(int a, int b) throws Division_Exception {
        try {
            int Result = a / b;
            System.out.println("Division Calculated Successfully ......");
            return Result;
        } catch (Exception e) {
            System.out.println("Error Occurred :- " + e);
        } finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println("Start of the Program");
        int Result1 = 10 / 0;
        System.out.println("End of the Program");
        // Start of the Program
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //         at Lec_85.main(Lec_85_FinallyBlockInJava.java:7)


        System.out.println("Start of the Program");
        try {
            int Result2 = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error Occurred :- " + e);
        } finally {
            System.out.println("End of the Program");
        }
        // Start of the Program
        // Error Occurred :- java.lang.ArithmeticException: / by zero
        // End of the Program


        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter the Value of a :- ");
        a = sc.nextInt();
        System.out.print("Enter the Value of b :- ");
        b = sc.nextInt();

        try {
            double division = Division2(a, b);
            System.out.println(a + "/" + b + " = " + division);
            // System.out.println("Division Calculated Successfully ......");
        } catch (Exception e) {
            System.out.println("Division NOT Possible !!!!!");
        }

        System.out.println("Program Ended Successfully !!!!");
        sc.close();             // Free the Resources
        // Enter the Value of a :- 10
        // Enter the Value of b :- 3
        // Division Calculated Successfully ......
        // Cleaning up resources...This is the end of this function
        // 10/3 = 3.0
        // Program Ended Successfully !!!!

        // Enter the Value of a :- 10
        // Enter the Value of b :- 0
        // Error Occurred :- java.lang.ArithmeticException: / by zero
        // Cleaning up resources...This is the end of this function
        // 10/0 = -1.0
        // Program Ended Successfully !!!!

    }
}


// -------------------------------------------------------------------------------------------------------------------------
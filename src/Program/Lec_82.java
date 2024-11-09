// -------------------------------------------------------------------------------------------------------------------------

// 82) Nested Try-Catch in Java :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_82 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] Marks = new int[3];
        Marks[0] = 10;
        Marks[1] = 20;
        Marks[2] = 30;

        int Index;
        int b;
        System.out.print("Enter the Value of Index :- ");
        Index = sc.nextInt();
        System.out.print("Enter the Value of b :- ");
        b = sc.nextInt();

        try {
            System.out.println("Element ar index-" + Index + " is :- " + Marks[Index]);
            try {
                int c = Marks[Index] / b;
                System.out.println("The value of " + Marks[Index] + "/" + b + " is :- " + c);
            } catch (ArithmeticException e) {
                System.out.println("Exception Occured :- ArithmeticException !!!");
                System.out.println("Reasons :- value of b is 0");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occured :- ArrayIndexOutOfBoundsException !!!");
            System.out.println("Reasons :- Index 100 out of bounds for length 3");
        }

        System.out.print("Program Ended Successfully !!!!");

        sc.close();         // Free the Resources
        // Enter the Value of Index :- 2
        // Enter the Value of b :- 3
        // Element ar index-2 is :- 30
        // The value of 30/3 is :- 10
        // Program Ended Successfully !!!!

        // Enter the Value of Index :- 10
        // Enter the Value of b :- 2
        // Exception Occured :- ArrayIndexOutOfBoundsException !!!
        // Reasons :- Index 100 out of bounds for length 3
        // Program Ended Successfully !!!!

        // Enter the Value of Index :- 2
        // Enter the Value of b :- 0
        // Element ar index-2 is :- 30
        // Exception Occured :- ArithmeticException !!!
        // Reasons :- value of b is 0
        // Program Ended Successfully !!!!

    }
}


// -------------------------------------------------------------------------------------------------------------------------
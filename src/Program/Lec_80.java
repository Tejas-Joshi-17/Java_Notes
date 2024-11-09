// -------------------------------------------------------------------------------------------------------------------------

// 80) Try-catch Block :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_80 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int a = sc.nextInt();

        int b = 100;

        int c = b / a;
        System.out.println(b + "/" + a + " is :- " + c);

        System.out.println("Program Ended Successfully !!!!");

        sc.close();         // Free the Resources
        // Enter the Number :- 20
        // 100/20 is :- 5
        // Program Ended Successfully !!!!

        // Enter the Number :- 15
        // 100/15 is :- 6
        // Program Ended Successfully !!!!

        // Enter the Number :- Tejas
        // Enter the Number :- 0            <---- java.util.InputMismatchException


        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the Age :- ");
        try {
            int Age = obj.nextInt();
            System.out.println("Age is :- " + Age);
        } catch (Exception e) {
            System.out.println("Error Ocuured :- " + e);
        }

        System.out.println("Program Ended Successfully !!!!");

        obj.close();             // Free the Resources
        // Enter the Age :- 20
        // Age is :- 20
        // Program Ended Successfully !!!!

        // Enter the Age :- Tejas
        // Error Ocuured :- InputMismatchException
        // Program Ended Successfully !!!!              <-------

    }
}


// -------------------------------------------------------------------------------------------------------------------------
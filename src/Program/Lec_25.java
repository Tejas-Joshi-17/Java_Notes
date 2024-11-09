// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 25) Chapter-5 Pratice Set

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_25 {
    public static void main(String[] args) {


        //  Q.1. Write a program to print the following pattern
        //       * * * *
        //       * * *
        //       * *
        //       *
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int n = sc1.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc1.close();        // free the Resources
        // Enter the Number :- 4
        // * * * *
        // * * *
        // * *
        // *


        // Q.2. Write a program to sum first n even numbers using while loop
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int n2 = sc2.nextInt();
        int sum = 0;
        for (int i = 0; i <= 2 * n; i += 2) {
            sum += i;
        }
        System.out.print("Sum of First " + n2 + " Natural Numbers is :- " + sum);

        sc2.close();         // Free the Resources


        // Q.3. Write a program to print multiplication table of a given number n.
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int num = sc3.nextInt();
        if (num > 0) {
            System.out.println("Multiplication Table of " + num + " is :- ");
            for (int i = 1; i < 11; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
        } else {
            System.out.println("Please Enter Positive Number");
        }

        sc3.close();          // Free the Resources
        // Enter the Number :- 8
        // Multiplication Table of 8 is :-
        // 8 * 1 = 8
        // 8 * 2 = 16
        // 8 * 3 = 24
        // 8 * 4 = 32
        // 8 * 5 = 40
        // 8 * 6 = 48
        // 8 * 7 = 56
        // 8 * 8 = 64
        // 8 * 9 = 72
        // 8 * 10 = 80


        // Q.4. Write a program to print multiplication table of given number n in reverse order.
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n4 = sc4.nextInt();
        if (n4 > 0) {
            System.out.println("*** Multiplication table of " + n4 + " in reverse order****");
            for (int i = 10; i > 0; i--) {
                System.out.println(n4 + " * " + i + " = " + n4 * i);
            }
        } else {
            System.out.println("Please Enter Positive Number ...!");
        }

        sc4.close();          // Free the Resources
        // Enter number :- 8
        // *** Multiplication table of 8 in reverse order****
        // 8 * 10 = 80
        // 8 * 9 = 72
        // 8 * 8 = 64
        // 8 * 7 = 56
        // 8 * 6 = 48
        // 8 * 5 = 40
        // 8 * 4 = 32
        // 8 * 3 = 24
        // 8 * 2 = 16
        // 8 * 1 = 8


        // Q.5. Write a program to find factorial of given number using for-loop
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n5 = sc5.nextInt();
        if (n5 < 0) {
            System.out.print("Factorial of " + n5 + " is NOT Possible");
        } else {
            if (n5 == 0 || n5 == 1) {
                System.out.print("Factorial of " + n5 + " is :- 1");
            } else {
                int Factorial = 1;
                for (int i = 1; i <= n5; i++) {
                    Factorial *= i;
                }
                System.out.print("Factorial of " + n5 + " is :- " + Factorial);
            }
        }

        sc5.close();          // free the Resources
        // Enter number :- -10
        // Factorial of -10 is NOT Possible
        // Enter number :- 0
        // Factorial of 0 is :- 1
        // Enter number :- 1
        // Factorial of 1 is :- 1
        // Enter number :- 5


        // Q.9. Write a program to calculate the sum of number occurring in table of n
        Scanner sc9 = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n9 = sc9.nextInt();
        int sum9 = 0;
        System.out.println("Multiplication Table of " + n9);
        for (int i = 1; i < 11; i++) {
            System.out.println(n9 + " * " + i + " = " + n9 * i);
            sum9 += n9 * i;
        }
        System.out.print("Sum of Number in Table-" + n9 + " is :- " + sum9);

        sc9.close();          // Free the Resources
        // Enter number :- 8
        // Multiplication Table of 8
        // 8 * 1 = 8
        // 8 * 2 = 16
        // 8 * 3 = 24
        // 8 * 4 = 32
        // 8 * 5 = 40
        // 8 * 6 = 48
        // 8 * 7 = 56
        // 8 * 8 = 64
        // 8 * 9 = 72
        // 8 * 10 = 80
        // Sum of Number in Table-8 is :- 440

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 35) Chapter-7 Practice Set

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_35_Chapter7PracticeSet {

    public static void Table(int num) {
        System.out.println("******* Multiplication Table-" + num + " *******");
        for (int i = 1; i < 11; i++) {
            System.out.println(num + "*" + i + " = " + num * i);
        }
    }

    public static int Sum(int n) {
        int u = 0;
        for (int i = 1; i < n + 1; i++) {
            u += i;
        }
        return u;
    }

    public static int Recursive3(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + Recursive3(n - 1);
        }
    }

    public static void Iterative4(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Recursive4(int num) {
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.print("* ");
            }
            System.out.println();
            Recursive4(num - 1);
        }
    }

    static int Recursive5(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2 || n == 3) {
            return 1;
        } else {
            return Recursive5(n - 1) + Recursive5(n - 2);
        }
    }

    public static double Average6(int[] Numbers) {
        double Average6, sum6 = 0;
        for (int i = 0; i < Numbers.length; i++) {
            sum6 += Numbers[i];
        }
        Average6 = sum6 / Numbers.length;

        return Average6;
    }

    public static void main(String[] args) {

        // 1) Write a method to print the multiplication table of number n.
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int Number1 = sc1.nextInt();

        Table(Number1);

        sc1.close();         // Free the Resources
        // Enter the Number :- 8
        // ******* Multiplication Table-8 *******
        // 8*1 = 8
        // 8*2 = 16
        // 8*3 = 24
        // 8*4 = 32
        // 8*5 = 40
        // 8*6 = 48
        // 8*7 = 56
        // 8*8 = 64
        // 8*9 = 72
        // 8*10 = 80


        // 2) Write a program to print following pattern
        //    *
        //   * *
        //  * * *
        // * * * *
        for (int i = 1; i <= 4; i++) {
            for (int j = 7; j > 0; j = j--) {
                int f = (j % 2) + 1;
                char t = '*';
                System.out.println(f);
                int p = i - 1;
                int y = j - ((j % 2) + 1);
                if (j == f || (j == f + 2 && (j != y + 1))) {
                    System.out.print(t);
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }


        // 3) Write a function to calculate sum of 'n' number
        System.out.println("Sum of First-5 Numbers is :- " + Sum(5));
        // Sum of First-5 Numbers is :- 15
        System.out.println("Sum of First-5 Numbers is :- " + Recursive3(5));
        // Sum of First-5 Numbers is :- 15


        // 4) Write a function to print
        // * * * *
        // * * *
        // * *
        // *
        Iterative4(4);
        // * * * *
        // * * *
        // * *
        // *

        Recursive4(4);
        // * * * *
        // * * *
        // * *
        // *


        // 5) Fibonacci Series
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int num5 = sc5.nextInt();

        for (int i = 1; i <= num5; i++) {
            System.out.print(Recursive5(i) + " ");
        }

        sc5.close();         // Free the Resources
        // Enter the Number :- 5
        // 0 1 1 2 3


        // 6) write a function to find average of a set of number passed as a argument
        Scanner sc6 = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int num6 = sc6.nextInt();

        int[] Numbers = new int[num6];

        for (int i = 0; i < num6; i++) {
            System.out.print("Enter the " + i + "th Element :- ");
            Numbers[i] = sc6.nextInt();
        }

        System.out.println("Average is :- " + Average6(Numbers));

        sc6.close();         // Free the Resources

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
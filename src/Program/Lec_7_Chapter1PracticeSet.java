// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 7) Chapter-1 Practice Set

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_7_Chapter1PracticeSet {
    public static void main(String[] args) {

        // 1) Write a program to sum three numbers in Java
        Scanner x1 = new Scanner(System.in);
        System.out.print("Enter the 1st number :- ");
        float a1 = x1.nextFloat();
        System.out.print("Enter the 2nd number :- ");
        float b1 = x1.nextFloat();
        System.out.print("Enter the 3rd number :- ");
        float c1 = x1.nextFloat();
        float sum1 = a1 + b1 + c1;
        System.out.println("The sum is:- " + sum1 + " Thank You ....!");

        x1.close();          // Free the Resources
        // Enter the 1st number :- 12.3
        // Enter the 2nd number :- 12.4
        // Enter the 3rd number :- 23.9
        // The sum is:- 48.6 Thank You ....!


        // 1) Write a program to sum three numbers in Java
        Scanner x2 = new Scanner(System.in);
        System.out.print("Enter the 1st number :- ");
        float a2 = x2.nextFloat();
        System.out.print("Enter the 2nd number :- ");
        float b2 = x2.nextFloat();
        System.out.print("Enter the 3rd number :- ");
        float c2 = x2.nextFloat();
        int sum2 = (int) (a2 + b2 + c2);
        System.out.println("The sum is:- " + sum2 + " Thank You ....!");

        x2.close();      // Free the Resources
        // Enter the 1st number :- 12.3
        // Enter the 2nd number :- 12.4
        // Enter the 3rd number :- 23.9
        // The sum is:- 48 Thank You ....!


        // 2) Write a Program to Calculate cgpa Using Marks of Three Subject
        Scanner a3 = new Scanner(System.in);
        System.out.print("Maximum Marks in each Subject is :- ");
        int w3 = a3.nextInt();
        System.out.print("Marks obtained in 1st Subject is :- ");
        int x3 = a3.nextInt();
        System.out.print("Marks obtained in 2nd Subject is :- ");
        int y3 = a3.nextInt();
        System.out.print("Marks obtained in 3rd Subject is :- ");
        int z3 = a3.nextInt();
        float b3 = (x3 + y3 + z3) / (w3 * 0.3f);        // 0.3f is float int / float = float
        System.out.println("The CGPA is :- " + b3 + " Congratulations ...!");

        a3.close();          // Free the Resources
        // Maximum Marks in each Subject is :- 100
        // Marks obtained in 1st Subject is :- 55
        // Marks obtained in 2nd Subject is :- 65
        // Marks obtained in 3rd Subject is :- 89
        // The CGPA is :- 6.966666 Congratulations ...!


        // 3) Write a java program that asks user to enter his name and greets the with "Hello <name> have a good day" text.
        Scanner a4 = new Scanner(System.in);
        System.out.print("Enter Your Name:- ");
        String name4 = a4.nextLine();
        System.out.println("Hello " + name4 + " have a good day");

        a4.close();      // Free the Resources
        // Enter Your Name:- Tejas Dattartay Joshi
        // Hello Tejas Dattartay Joshi have a good day


        // 4) Write a program to convert Kilometers into miles
        Scanner d = new Scanner(System.in);
        System.out.print("Enter the value in Km :- ");
        float c = d.nextFloat();
        float miles = c * 0.621371f;
        System.out.println("Km to miles is " + miles + " Congratulations ...!");

        d.close();          // Free the Resources
        // Enter the value in Km :- 10
        // Km to miles is 6.21371 Congratulations ...!


        // 5) Write a program to detect whether a number entered by user is an integer/float or not
        System.out.println("Enter The value in Km:- ");
        Scanner ab = new Scanner(System.in);
        boolean y = ab.hasNextInt();
        System.out.print("Result is:- " + y);

        ab.close();         // Free the Resources
        // Enter The value in Km:-
        // 45.534534
        // Result is:- false

        // Enter The value in Km:-
        // 45
        // Result is:- true
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
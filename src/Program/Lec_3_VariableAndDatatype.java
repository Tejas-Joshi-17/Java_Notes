// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 3) Variables & Datatypes in Java

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_3_VariableAndDatatype {
    public static void main(String[] args) {


        /* *********  Write a Java Program to add Three Number  ********* */
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        System.out.println("The sum of " + num1 + " " + num2 + " & " + num3 + " is:- ");
        int sum1 = num1 + num2 + num3;
        System.out.println(sum1);
        // The Sum of 1 2 & 3 is :-
        // 6


        int num12 = 65;
        int num22 = 75;
        int num32 = 85;
        int sum2 = num12 + num22 + num32;
        System.out.print("The sum of 3 no. is :- ");
        System.out.println(sum2);
        System.out.println("Hi Tejas Here");
        System.out.println(sum2);
        // The sum of 3 no. is :- 225
        // Hi Tejas Here
        // 225


        int num13 = 65;
        int num23 = 75;
        int num33 = 85;
        int sum3 = num13 + num23 + num33;
        System.out.print("The sum of first 3 no. is :- ");
        System.out.println(sum3);
        System.out.println("Tejas");
        // The sum of first 3 no. is :- 225
        // Tejas


        int num14 = 65;
        int num24 = 75;
        int num34 = 85;
        int sum4 = num14 + num24 + num34;
        System.out.println("Sum is :- " + sum4 + " Tejas");
        System.out.println("Japan Here");
        // Sum is :- 225 Tejas
        // Japan Here



        /* *********  Taking Input from User's in Java  ********* */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. 1 :- ");
        int a1 = sc.nextInt();
        System.out.print("Enter no. 2 :- ");
        int b1 = sc.nextInt();
        float y1 = (float) (a1 + b1);
        System.out.println("The sum is :- " + y1);

        sc.close();          // Free the Resources
        // Enter no. 1 :- 12
        // Enter no. 2 :- 23
        // The sum is :- 35.0


        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the no. 1 :- ");
        float a2 = obj.nextFloat();
        System.out.print("Enter the no. 2 :- ");
        float b2 = obj.nextFloat();
        int w2 = (int) (a2 + b2);          // 12.5 + 11.1 = 23
        float x2 = (int) (a2 + b2);        // 12.5 + 11.1 = 23.0
        float z2 = (a2 + b2);             // 12.5 + 11.1 = 23.6
        System.out.println(w2);
        System.out.println(x2);
        System.out.println(z2);

        obj.close();        // Free the Resources



        /* *********  String in Java  ********* */
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Enter what you want to dispaly :- ");
        String dispaly1 = obj2.next();
        System.out.println(dispaly1);

        obj2.close();        // Free the Resources
        // Input :- Harry is a Good Boy
        // Output :- Harry


        Scanner obj3 = new Scanner(System.in);
        System.out.print("Enter what you want to dispaly :- ");
        String dispaly2 = obj.nextLine();
        System.out.println(dispaly2);

        obj3.close();            // Free the Resource


        Scanner boy = new Scanner(System.in);
        System.out.print("Enter no :- ");
        System.out.println(boy.hasNextFloat());

        boy.close();            // Free the Resource
        // Input :- 15.6       Output :- true
        // Input :- 15         Output :- true
        // Input :- "Tejas"    Output :- false
        // Input :- 'p'        Output :- false
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
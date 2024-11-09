// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 19) Chapter-4 Practice Set

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_19 {
    public static void main(String[] args) {

        // Q.1. What will be output of following program
        int a1 = 10;
        // if (a1 = 11)       // cannot convert from int to boolean
        //    System.out.println("I am equal to 11");
        // }else{
        //    System.out.println("I am not equal 11");
        // }


        // Q.2. Write a program to find out whether a student is pass or fail it require total 40% and atleast 33% in each subject to pass
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Maximum Marks in each subject:- ");
        int max = sc2.nextInt();
        System.out.print("Enter Makrs obtained in Physics :- ");
        int p = sc2.nextInt();
        System.out.print("Enter Makrs obtained in Chemistry :- ");
        int c = sc2.nextInt();
        System.out.print("Enter Makrs obtained in Mathematics :- ");
        int m = sc2.nextInt();
        int total = p + c + m;
        float percentage = (total) / (0.03f * max);
        if (total >= 1.2 * max && p >= 0.40 * max && c >= 0.40 * max && m >= 0.40 * max) {
            System.out.println("Congratulations ...! You got " + percentage);
        } else {
            System.out.println("Bad Luck ...! You got " + percentage);
        }

        sc2.close();         // Free the Resources


        // Q.3. Calculate income rax paid by employee to goverment
        // income tax tax
        // 2.5 - 5.0 5%
        // 5.0 - 10.0 20%
        // above 10L 30%
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter your Annual Income :- ");
        float I = sc4.nextFloat();
        float tax = 0.0f;
        if (I < 2.5) {
            System.out.print("As per your annual income ");
            System.out.println("You don't pay tax to goverment...!");
        } else if (I >= 2.5 && I < 5.0) {
            tax = 0.05f * (I - 2.5f);
            System.out.print("As per your annual income ");
            System.out.println("Pay " + tax + " to Goverment");
        } else if (I >= 5.0 && I < 10.0) {
            tax = 0.2f * (I - 5.0f);
            tax = 0.05f * 2.5f;
            System.out.print("As per your annual income ");
            System.out.println("Pay " + tax + " to Goverment");
        } else if (I >= 10.0) {
            tax = 0.3f * (I - 10.0f);
            tax = 0.2f * 5.0f;
            tax = 0.05f * 2.5f;
            System.out.print("As per your annual income ");
            System.out.println("Pay " + tax + " to Goverment");
        }

        sc4.close();         // Free the Resources


        // Q.4. Write a program to find out day of the week 1 for monday 2 for tuesday
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int day = sc5.nextInt();
        switch (day) {
            case 1:
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
            case 4:
                System.out.println("Today is Tuesday");
                break;
            case 5:
            case 6:
                System.out.println("Today is Wednesday");
                break;
            case 7:
            case 8:
                System.out.println("Today is Thursday");
                break;
            case 9:
            case 10:
                System.out.println("Today is Friday");
                break;
            case 11:
            case 12:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is Sunday");
                break;
        }

        sc5.close();         // Free the Resources


        // Q.5. Write a program whether it is a leap year or not
        Scanner name = new Scanner(System.in);
        System.out.print("Enter year :- ");
        int year = name.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        name.close();           // free the Resources


        // 6) Write a program to find out the type of website from the URL
        // -----  .com  =  commercial website
        // -----  .org  =  organization website
        // -----  .in   =  indian website
        Scanner sc6 = new Scanner(System.in);
        System.out.print("Enter the Website :- ");
        String Website = sc6.nextLine();

        if (Website.endsWith(".com"))
            System.out.print(Website + " => Commercial Website");
        else if (Website.endsWith(".org"))
            System.out.print(Website + " => Organization Website");
        else if (Website.endsWith(".in"))
            System.out.print(Website + " => Indian Website");

        sc6.close(); // free the Resources
        // Enter the Website :- joshitejas188@gmail.com
        // joshitejas188@gmail.com => Commercial Website
        // Enter the Website :- joshitejas188@gmail.com
        // joshitejas188@gmail.com => Commercial Website
        // Enter the Website :- Apple12.in
        // Apple12.in => Indian Website

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 12) Chapter-2 ---> Solution

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_12_Chapter2PracticeSet {
    public static void main(String[] args) {

        // 1) What will be the result of the following Expression
        // float a = 7/4*9/2
        float ans = 7 / 4 * 9 / 2;
        System.out.println(ans);        // 4.0


        // 2) Write a program to encrypt a grade by adding 8 to it, Decrypt it to show correct grade
        System.out.print("Enter the Grade :- ");
        Scanner sc = new Scanner(System.in);
        float Grade = sc.nextFloat();
        System.out.println("Encrypted Grade :- " + (Grade + 8));
        System.out.println("Decrypted Grade :- " + (Grade));

        sc.close();     // Free the Resources
        // Enter the Grade :- 12.3
        // Encrypted Grade :- 20.3
        // Decrypted Grade :- 12.3


        // 3) Use Comparison Operators to find out whether a given number is greater than the user's entered number or not
        int num = 20;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the User-Number :- ");
        int User_Number = obj.nextInt();
        if (num > User_Number) {
            System.out.print("Given Number is Greater than User's Number");
        } else {
            System.out.print("Users Number is Greater than Given Number");
        }

        obj.close();         // Free the Resources
        // Enter the User-Number :- 10
        // Given Number is Greater than User's Number
        // Enter the User-Number :- 30
        // Users Number is Greater than Given Number

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
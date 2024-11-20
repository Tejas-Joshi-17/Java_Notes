// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 11) Exercise - 1) ---> Solution

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_11_Exercise1Solution {
    public static void main(String[] args) {

        // 1) Write a program to calculate percentage of a given students in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum Marks in Subject :- ");
        int Marks = sc.nextInt();
        int Total_Marks = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Marks in Subject-" + (i + 1) + " is :- ");
            int Subject_Marks = sc.nextInt();
            Total_Marks += Subject_Marks;
        }
        float Percentage = (Total_Marks / (Marks * 0.05f));
        System.out.print("Total Percentage Obtained :- " + Percentage);

        sc.close();         // Free the Resources
        // Enter Maximum Marks in Subject :- 100
        // Enter Marks in Subject-1 is :- 34
        // Enter Marks in Subject-2 is :- 56
        // Enter Marks in Subject-3 is :- 23
        // Enter Marks in Subject-4 is :- 87
        // Enter Marks in Subject-5 is :- 99
        // Total Percentage Obtained :- 59.8
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
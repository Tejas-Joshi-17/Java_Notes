// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 26) Array

// 1) array.length ---> given length of array
// 2) Overwriting is possible in array means if marks[2] = 20
//         then after if we write marks[2]= 30 then marks[2] becomes 30


// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_26_IntroductionToArrays {
    public static void main(String[] args) {

        int[] Marks = new int[3];
        Marks[0] = 10;
        Marks[2] = 30;
        // Marks[3] = 40;          <------ Index 3 out of bounds for length 3

        for (int i = 0; i < Marks.length; i++) {
            System.out.println((i + 1) + "th Index Marks is :- " + Marks[i]);
        }

        Marks[1] = 100;

        for (int i = 0; i < Marks.length; i++) {
            System.out.println((i + 1) + "th Index Marks is :- " + Marks[i]);
        }
        // 1th Index Marks is :- 10
        // 2th Index Marks is :- 0      <----- By-deafult value is :- 0
        // 3th Index Marks is :- 30
        // 1th Index Marks is :- 10
        // 2th Index Marks is :- 100
        // 3th Index Marks is :- 30


        // int [] marks = new int [] ;  // must give dimesnsion
        int[] marks1;
        marks1 = new int[4];  // must give dimesnsion
        marks1[0] = 56;
        marks1[1] = 66;
        marks1[2] = 76;
        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[2]);
        System.out.println(marks1[3]);  // default value is 0;
        System.out.println(marks1[4]);  // Index 4 out of bounds for length 4 i.e. throw error


        int[] marks2 = {10, 20, 30, 40, 50};  // dimensions are automatically understood not mandatory to give
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println(marks2[2]);
        System.out.println(marks2[3]);
        System.out.println(marks2[4]);
        System.out.println(marks2[5]);      // Index 5 out of bounds for length 5 i.e. throw error


        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n1 = sc1.nextInt();
        int[] marks3 = new int[n1];
        for (int i = 0; i < marks3.length; i++) {
            System.out.print("Enter the " + (i + 1) + " Element of array :- ");
            marks3[i] = sc1.nextInt();
        }
        System.out.println();

        for (int i = 0; i < marks3.length; i++)
            System.out.print(i + 1 + "st Element of array :- " + marks3[i] + "\n");

        sc1.close();         // free the Resources
        // Enter the value of n1 :- 3
        // Enter the 1 Element of array :- 12
        // Enter the 2 Element of array :- 23
        // Enter the 3 Element of array :- 34
        // 1st Element of array :- 12
        // 2st Element of array :- 23
        // 3st Element of array :- 34


        // Q. Take an array as input from the user. Search for a given number x and print the index at which it occurs
        boolean ans = true;

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc2.nextInt();

        int[] marks4 = new int[n];

        for (int i = 0; i < marks4.length; i++) {
            System.out.print("Enter the " + (i + 1) + " Element of array :- ");
            marks4[i] = sc2.nextInt();
        }
        System.out.println();

        int m;
        System.out.print("Enter the value which you want to search in an array:-  ");
        m = sc2.nextInt();

        for (int i = 0; i < marks4.length; i++) {
            if (m == marks4[i]) {
                System.out.print("Element if found at " + i);
                ans = false;
            }
        }

        if (ans == true) {
            System.out.print("Element is not found !!!!!!!!!");
        }

        sc2.close();         // Free the Resources

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
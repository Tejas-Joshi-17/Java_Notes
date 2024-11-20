// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 29) Chapter-6 Practice Set

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_29_Chapter6PracticeSet {
    public static void main(String[] args) {


        // Q.1. Create an array of 5 floats and caluculate sum
        float[] marks1 = {23.1f, 56.23f, 99.9f, 54.f, 54.87f};

        float sum1 = 0;
        for (int i = 0; i < marks1.length; i++)
            sum1 += marks1[i];

        System.out.print("The sum1 is :- " + sum1);
        // The sum is :- 288.1


        // Q.2. Write a program to find out whether a given interger is present in an array or not
        int[] marks2 = {23, 333, 43, 53, 63, 73, 83, 93};
        boolean y = false;

        Scanner sc2 = new Scanner(System.in);   // Class obj = new class();
        System.out.print("Enter the number you want to find :- ");
        int num2 = sc2.nextInt(); // = obj.method

        for (int i = 0; i < marks2.length; i++) {
            if (num2 == marks2[i]) {
                y = true;
                break;
            }
        }

        if (y == true) {
            System.out.println(num2 + " is present in the array ...!");
        } else {
            System.out.println(num2 + " is not-present in the array ...!");
        }


        // Q.3. Calculate a Average Marks for an array containing Marks
        int[] marks3 = {20, 30, 40, 50, 60, 70, 80, 90};

        int avg3 = 0;
        for (int i = 0; i < marks3.length; i++) {
            avg3 += marks3[i];
        }

        System.out.println("Average is :- " + avg3 / marks3.length);
        // // Average is :- 55


        // Q.4. Write a program to add 2 2*3 matrics
        int[][] mark41 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mark42 = {{7, 8, 9}, {10, 11, 12}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < mark41.length; i++) {
            for (int j = 0; j < mark41[i].length; j++) {
                result[i][j] = mark41[i][j] + mark42[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }
        // 8 10 12
        // 14 16 18


        // Q.5. Write a program to reverse the array
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Enter Size of an Array :- ");
        int num5 = sc5.nextInt();

        int[] Marks = new int[num5];

        // Entering Elements of an Array
        System.out.print("Enter Elements of an Array :- ");
        for (int i = 0; i < num5; i++) {
            System.out.print("Enter Marks[" + i + "] :- ");
            Marks[i] = sc5.nextInt();
        }

        // Displaying Original Array
        System.out.print("Original Array :- ");
        for (int i = 0; i < Marks.length; i++)
            System.out.print(Marks[i] + " ");
        System.out.println();


        // Reversing the Array
        for (int i = 0; i < Marks.length / 2; i++) {
            int temp = Marks[i];
            Marks[i] = Marks[Marks.length - 1 - i];
            Marks[Marks.length - 1 - i] = temp;
        }

        // Displaying Reversed Array
        System.out.print("Reversed Array :- ");
        for (int i = 0; i < Marks.length; i++)
            System.out.print(Marks[i] + " ");

        sc5.close();         // Free the Resources
        // Enter Size of an Array :- 4
        // Enter Elements of an Array :-
        // Enter Marks[0] :- 10
        // Enter Marks[1] :- 20
        // Enter Marks[2] :- 30
        // Enter Marks[3] :- 40
        // Original Array :- 10 20 30 40
        // Reversed Array :- 40 30 20 10

        // Enter Size of an Array :- 5
        // Enter Elements of an Array :-
        // Enter Marks[0] :- 10
        // Enter Marks[1] :- 20
        // Enter Marks[2] :- 30
        // Enter Marks[3] :- 40
        // Enter Marks[4] :- 50
        // Original Array :- 10 20 30 40 50
        // Reversed Array :- 50 40 30 20 10


        // Q.6. Write a program to find maxmum in the array
        int[] marks6 = {10, 20, 30, 40, 50, 60, 89, -4152, -89, 0};
        int max6 = marks6[0];

        for (int i = 0; i < marks6.length; i++) {
            if (max6 <= marks6[i]) {
                max6 = marks6[i];
            }
        }
        System.out.println("Maximum no. in the array is :- " + max6);
        // Maximum no. in the array is :- 89


        // Q.7. Write a program to find mimimum in the array
        int[] marks8 = {10, 20, 30, 40, 50, 60, 89, -4152, -89, 0};
        int min8 = marks8[0];

        for (int i = 0; i < marks8.length; i++) {
            if (min8 >= marks8[i]) {
                min8 = marks8[i];
            }
        }
        System.out.println("Minimum no. in the array is :- " + min8);
        // Minimum no. in the array is :- -4152


        // Q.8. Write a program to find whether the array is sorted or not
        Scanner sc8 = new Scanner(System.in);
        System.out.print("Enter Size of an Array :- ");
        int Size = sc8.nextInt();

        int[] arr = new int[Size];

        // Entering Elements of an Array
        for (int i = 0; i < Size; i++) {
            System.out.print("Enter Array[" + i + "] :- ");
            arr[i] = sc8.nextInt();
        }

        // Displaying Array
        System.out.println("Original Array :- ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        int Increasing_Sorted = 1;
        int Decreasing_Sorted = 2;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] <= arr[i + 1])
                continue;
            else {
                Increasing_Sorted = 0;
                break;
            }
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] >= arr[i + 1])
                continue;
            else {
                Decreasing_Sorted = 0;
                break;
            }
        }

        if (Increasing_Sorted == 1)
            System.out.println("Array is Increasing Sorted !!!");
        else if (Decreasing_Sorted == 2)
            System.out.println("Array is Decreasing Sorted !!!");
        else
            System.out.println("Array is NOT Increasing as well as Decreasing!!!");

        sc8.close();         // Free the Resources
        // Enter Size of an Array :- 5
        // Enter Array[0] :- 10
        // Enter Array[1] :- 20
        // Enter Array[2] :- 30
        // Enter Array[3] :- 40
        // Enter Array[4] :- 50
        // Original Array :-
        // 10 20 30 40 50
        // Array is Increasing Sorted !!!

        // Enter Size of an Array :- 5
        // Enter Array[0] :- 50
        // Enter Array[1] :- 40
        // Enter Array[2] :- 30
        // Enter Array[3] :- 20
        // Enter Array[4] :- 10
        // Original Array :-
        // 50 40 30 20 10
        // Array is Decreasing Sorted !!!

        // Enter Size of an Array :- 5
        // Enter Array[0] :- 10
        // Enter Array[1] :- 50
        // Enter Array[2] :- 20
        // Enter Array[3] :- 40
        // Enter Array[4] :- 30
        // Original Array :-
        // 10 50 20 40 30
        // Array is NOT Increasing as well as Decreasing!!!

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
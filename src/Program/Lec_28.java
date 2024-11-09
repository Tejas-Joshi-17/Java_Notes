// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 28) Multi-Dimensional Array

// 2-D Array
// Syntax :- type[][] array_name = new type[rows][coulmns];
//            int[][] numbers = new int[3][5];

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_28 {
    public static void main(String[] args) {


        int[][] marks1 = new int[2][3];

        marks1[0][0] = 1;
        marks1[0][1] = 2;
        marks1[0][2] = 3;
        marks1[1][0] = 4;
        marks1[1][1] = 5;
        marks1[1][2] = 6;

        for (int i = 0; i < marks1.length; i++) {
            for (int j = 0; j < marks1[i].length; j++) {
                System.out.print(marks1[i][j] + " ");
            }
            System.out.println("");
        }
        //  1 2 3
        //  4 5 6


        int[][] marks = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println("");
        }
        //  1 2 3
        //  4 5 6


        Scanner sc3 = new Scanner(System.in);
        int rows, columns;

        System.out.print("Enter the value of Rows :- ");
        rows = sc3.nextInt();
        System.out.print("Enter the value of Columns :- ");
        columns = sc3.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the [" + i + "][" + j + "] element of array :- ");
                matrix[i][j] = sc3.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc3.close();         // Free the Resources
        // Enter the value of Rows :- 2
        // Enter the value of Columns :- 3
        // Enter the [0][0] element of array :- 1
        // Enter the [0][1] element of array :- 2
        // Enter the [0][2] element of array :- 3
        // Enter the [1][0] element of array :- 4
        // Enter the [1][1] element of array :- 5
        // Enter the [1][2] element of array :- 6
        // 1 2 3
        // 4 5 6


        // Q. Take a number as input from the user. Search for a given number x and print the indices at which it occurs
        boolean ans1 = true;
        Scanner sc = new Scanner(System.in);

        int rows1, coulmns;
        System.out.print("Enter the Value of Rows :- ");
        rows1 = sc.nextInt();
        System.out.print("Enter the Value of Coulmne :- ");
        coulmns = sc.nextInt();

        int[][] matrix1 = new int[rows1][coulmns];

        System.out.println("Enter the Elements of an Array :- ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
                System.out.print(" ");
            }
            System.out.println();
        }

        int num;
        System.out.print("Enter the number you want to search :- ");
        num = sc.nextInt();

        System.out.println("Searching in Whole Array :- ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] == num) {
                    ans1 = false;
                    System.out.print(num + " is found at  :- " + "[" + i + "][" + j + "]");
                    break;
                }
            }
            System.out.println();
        }
        if (ans1) {
            System.out.print("Element is not found");
        }

        sc.close();         // Free the Resources

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
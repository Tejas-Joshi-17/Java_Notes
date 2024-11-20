// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 34) Recursion in Java

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_34_RecursionInJava {

    public static int Factorial_Iterative(int num) {
        int Fact = 1;
        if (num == 0 || num == 1) {
            return Fact;
        } else {
            for (int i = 1; i <= num; i++)
                Fact *= i;
        }
        return Fact;
    }

    public static int Factorial_Recurssive(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * Factorial_Recurssive(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int Number = sc.nextInt();

        System.out.println("Answer Iterative :- " + Factorial_Iterative(Number));
        System.out.println("Answer Recursive :- " + Factorial_Recurssive(Number));

        sc.close();             // Free the Resources
        // Enter the Number :- 3
        // Answer Iterative :- 6
        // Answer Recursive :- 6

        // Enter the Number :- 5
        // Answer Iterative :- 120
        // Answer Recursive :- 120
    }

}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
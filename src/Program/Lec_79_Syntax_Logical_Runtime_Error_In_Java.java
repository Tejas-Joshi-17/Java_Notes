// -------------------------------------------------------------------------------------------------------------------------

// 79) Syntax, Logical & Runtime Errors in Java :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_79_Syntax_Logical_Runtime_Error_In_Java {
    public static void main(String[] args) {

        // 1) Syntax Error
        // int a = 5        <----- ';' missing
        int b = 20;

        int x = 100;
        // y = 300;         <------ Datatype not mentioned


        // 2) Logical Errors        <----- Errors occured to incorrect logic
        // Displaying First 5 odd numbers
        for (int i = 0; i <= 9; i += 2) {
            System.out.print(i);
        }


        // 3) Runtime Error
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int a = sc.nextInt();

        int x2 = 100;

        int c = x2 / a;
        System.out.println(x2 + "/" + a + " is :- " + c);

        System.out.println("Program Ended Successfully !!!!");

        sc.close();         // Free the Resources
        // Enter the Number :- 20
        // 100/20 is :- 5
        // Program Ended Successfully !!!!

        // Enter the Number :- 15
        // 100/15 is :- 6
        // Program Ended Successfully !!!!

        // Enter the Number :- Tejas
        // Enter the Number :- 0            <---- java.util.InputMismatchException

    }
}

// -------------------------------------------------------------------------------------------------------------------------
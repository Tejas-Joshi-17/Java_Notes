// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 21) While Loop

// while (Boolean Expression)   while(true)   for infinite loop
//                              while(1)      not working

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_21_WhileLoop {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a Number  :- ");
        int a = num.nextInt();
        while (a <= 5) {
            System.out.println(a);
            a++;
        }

        num.close();        // Free the Resources
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
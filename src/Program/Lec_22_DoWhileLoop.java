// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 22) do-while Loop

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_22_DoWhileLoop {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int x = number.nextInt();
        do {
            System.out.println(x);
            x++;
        } while (x <= 5);        // while(true) for infinite loop

        number.close();         // Free the Resources
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
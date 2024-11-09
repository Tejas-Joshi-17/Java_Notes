// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 50) Exercise-3 Solution

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Random;
import java.util.Scanner;

public class Lec_50 {
    public static void main(String[] args) {

        // Guess the Number
        Random r = new Random();
        int c = r.nextInt(100);
        c += 1;
        int ok = 0;
        Scanner num = new Scanner(System.in);
        for (int i = 0; i <= 100; i++) {
            System.out.print("Enter the number :- ");
            int n = num.nextInt();
            if (n > c) {
                ok = 5;
                System.out.println("Less than that");
            } else if (n < c) {
                ok = -5;
                System.out.println("Greater than that");
            } else if (n == c) {
                System.out.println("Yes this is correct");
                System.out.println("You take " + i + " steps to find out");
                break;
            }

        }

        num.close();        // Free the Resources

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
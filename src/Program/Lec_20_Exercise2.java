// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 20) Exercise-2

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Random;
import java.util.Scanner;

public class Lec_20_Exercise2 {
    public static void main(String[] args) {


        // Rock Paper Seriour Game

        // 1 - Rock    2 - Papar    3 - Seriour
        System.out.println("1-Rock || 2-Paper || 3-Seriour");
        System.out.print("Enter Rock / Paper / Seriour : -  ");

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        Random a = new Random();
        int c = a.nextInt(3);   // choose either 0 / 1 / 2
        c += 1;

        if ((b == 1 && c == 3) || (b == 2 && c == 1) || (b == 3 && c == 2)) {
            System.out.println("Congratulations you win the game ...!");
            System.out.println("Because you choos:- " + b + " & Computer choose " + c);
        } else {
            System.out.println("Bad Luck , You Loose the game");
            System.out.println("Because you choos:- " + b + " & Computer choose " + c);
        }

        sc.close();         // Free the Resources

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 13) String

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_13_IntroductionToString {
    public static void main(String[] args) {

        // 1)
        String Name1 = new String("Tejas Joshi");
        System.out.print("String is :- " + Name1);
        // String is :- Tejas Joshi


        // 2)
        String Name2 = "Tejas Joshi";
        System.out.print("String is :- " + Name2);
        // String is :- Tejas Joshi


        // 3)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String Name3 = sc.next();
        System.out.print("Enter String is :- " + Name3);

        sc.close();         // free the Resource
        // Enter the String :- Tejas Dattatray Joshi
        // Enter String is :- Tejas


        // 4)
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String Name4 = obj.nextLine();
        System.out.print("Enter String is :- " + Name4);

        obj.close();             // Free the Resource
        // Enter the String :- Tejas Dattatray Joshi
        // Enter String is :- Tejas Dattatray Joshi

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
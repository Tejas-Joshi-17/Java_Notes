// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 5) Getting User input in java

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_5_GettingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :- ");
        String Name = sc.next();
        System.out.print(Name);
        // Enter the String :- Tejas Dattatray Joshi
        // Output String :- Tejas


        System.out.print("Enter the String :- ");
        String name = sc.nextLine();
        System.out.println(name);
        // Enter the String :- Tejas Dattatray Joshi
        // Output String :- Tejas Dattatray Joshi

        sc.close();         // Free the Resources
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
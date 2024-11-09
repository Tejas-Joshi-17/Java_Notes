// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 15) Chapter 3 - Pratice Set

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_15 {
    public static void main(String[] args) {

        // 1) Write a java program to convert string to lowercase
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String Name1 = sc1.nextLine();
        System.out.println("Orginal String :- " + Name1);
        System.out.println("Capitalized String :- " + Name1.toUpperCase());

        sc1.close();          // Free the Resources
        // Enter the String :- Tejas Dattatray Joshi
        // Orginal String :- Tejas Dattatray Joshi
        // Capitalized String :- TEJAS DATTATRAY JOSHI


        // 2) write a java program to replace blank space with '_'
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String Name2 = sc2.nextLine();
        System.out.println("Orginal String :- " + Name2);
        System.out.println("Modified String :- " + Name2.replace(" ", "_"));

        sc2.close();          // Free the Resources
        // Enter the String :- Tejas Dattatray Joshi
        // Orginal String :- Tejas Dattatray Joshi
        // Modified String :- Tejas_Dattatray_Joshi


        // 3) Write a java program to fill the blank space
        // Letter = "Dear <|name|>, Thanks a lot!!"
        String Letter1 = "Dear <|name|>, Thanks a lot!!";
        System.out.println("Original Letter1 :- " + Letter1);
        Letter1 = Letter1.replace("<|name|>", "Tejas Joshi");
        System.out.println("Modified Letter1 :- " + Letter1);
        // Original Letter :- Dear <|name|>, Thanks a lot!!
        // Modified Letter :- Dear Tejas Joshi, Thanks a lot!!


        // 4) Write a java program to detect double and triple spaces in a string
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String Name = sc3.nextLine();
        if (Name.indexOf("  ") != -1 && Name.indexOf("   ") != -1)
            System.out.print(Name + " Contains Both Duple & Triple Spaces");
        else if (Name.indexOf("  ") != -1 && Name.indexOf("   ") == -1)
            System.out.print(Name + " contains only Double Spaces");
        else if (Name.indexOf("  ") == -1 && Name.indexOf("   ") != -1)
            System.out.print(Name + " contains only Triple Spaces");
        else
            System.out.print(Name + " doesn't conatins Double & Triple Spaces");

        sc3.close();          // Free the Resources
        // Enter the String :- Tejas  Dattatray   Joshi
        // Tejas  Dattatray   Joshi Contains Both Duple & Triple Spaces
        // Enter the String :- Tejas  Dattatray Joshi
        // Tejas  Dattatray Joshi contains only Double Spaces
        // Enter the String :- Tejas   Dattatray   Joshi
        // Tejas Dattatray   Joshi Contains on;y Triple Spaces
        // Enter the String :- Tejas Dattatray Joshi
        // Tejas Dattatray Joshi doesn't conatins Double & Triple Spaces


        // 5) Write a program to format the following letter using escape sequence characters
        String Letter2 = "Dear Harry, This is Java Course is Nice, Thanks";
        System.out.println("Original Letter2 :- " + Letter2);

        Letter2 = "Dear Harry,\n\tThis is Java Course is Nice,\n\tThanks";
        System.out.println(Letter2);
        // Original Letter :- Dear Harry, This is Java Course is Nice, Thanks
        // Dear Harry,
        //         This is Java Course is Nice,
        //         Thanks

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
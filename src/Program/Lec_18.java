// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 18) Swith Conditionals

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = 20;
        float bat = 16.0f;      // constant label of type float is not compatible with switch selector type float
        char ball = 't';
        String name = "Tejas";

        switch (name) {
            case "Tejas":
                System.out.println("The value is :-  15");
                break;
            case "tejas":
                System.out.println("The value is :-  16");
                break;
            case "Omkar":
                System.out.println("The value is :-  17");
                break;
            default:
                System.out.println("Other than that");
                break;
        }

        sc.close();         // Free the Resources
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
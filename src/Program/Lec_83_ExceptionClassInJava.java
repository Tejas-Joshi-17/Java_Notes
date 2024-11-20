// -------------------------------------------------------------------------------------------------------------------------

// 83) Exception class in Java :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

class Arithmetic_Exception extends Exception {
    @Override
    public String toString() {
        return super.toString() + " - I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " - I am getting Message";
    }
}

class Age_Exception extends Exception {
    @Override
    public String toString() {
        return "Age is above Limit";
    }

    @Override
    public String getMessage() {
        return "Age is NOT Possible";
    }
}

public class Lec_83_ExceptionClassInJava {
    public static void main(String[] args) {

        try {
            throw new Arithmetic_Exception();
        } catch (Exception e) {
            System.out.println("Message :- " + e.getMessage());
            System.out.println("String :- " + e.toString());
            System.out.println("String :- " + e);
            e.printStackTrace();            // <---- Show Error Line

            System.out.println("Describe Error Successfully .....");
        }

        System.out.println("Program Ended Successfully !!!!");
        // Message :- null - I am getting Message
        // String :- Arithmetic_Exception: null - I am getting Message - I am toString()
        // String :- Arithmetic_Exception: null - I am getting Message - I am toString()
        // Arithmetic_Exception: null - I am getting Message - I am toString()
        //         at Lec_83.main(Lec_83_ExceptionClassInJava.java:20)
        // Describe Error Successfully .....
        // Program Ended Successfully !!!!


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age :- ");
        int Age = sc.nextInt();

        if (Age > 125) {
            try {
                throw new Age_Exception();
            } catch (Exception e) {
                System.out.println("Message :- " + e.getMessage());
                System.out.println("String :- " + e.toString());
                System.out.println("String :- " + e);
                e.printStackTrace();            // <---- Show Error Line

                System.out.println("Describe Error Successfully .....");
            }
        }

        System.out.println("Program Ended Successfully !!!!");
        // Enter Your Age :- 100
        // Program Ended Successfully !!!!

        // Enter Your Age :- 126
        // Message :- Age is NOT Possible
        // String :- Age is above Limit
        // String :- Age is above Limit
        // Age is above Limit
        //         at Lec_83.main(Lec_83_ExceptionClassInJava.java:75)
        // Describe Error Successfully .....
        // Program Ended Successfully !!!!

    }
}


// -------------------------------------------------------------------------------------------------------------------------
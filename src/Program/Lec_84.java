// -------------------------------------------------------------------------------------------------------------------------

// 84) Throw vs Throws :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

//public static int Division1(int a, int b) throws Exception{
//    // Sends Exception if Division NOT Possible
//    int Result = a/b;
//    return Result;
//}

//class Age_Exception extends Exception{
//    @Override
//    public String toString(){
//        return "Age above Limit";
//    }
//
//    @Override
//    public String getMessage(){
//        return "Age above Limit";
//    }
//}

class Radius_Negative_Exception extends Exception {
    @Override
    public String toString() {
        return "Negative Radius NOT Possible";
    }

    @Override
    public String getMessage() {
        return "Nagetive Radius NOY Possible";
    }
}

public class Lec_84 {

    public void Age(int age) throws Age_Exception {
        // Throws Exception if Age>125
        if (age > 125) {
            throw new Age_Exception();
        }
        System.out.println("Age is in Limit");
    }

    public double Area(int Radius) throws Radius_Negative_Exception {   // Throws Error in Radius in -ve
        if (Radius < 0) {
            throw new Radius_Negative_Exception();
        }

        double Result = Math.PI * Radius * Radius;
        return Result;
    }

    public void main(String[] args) {

        int x, y;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter the Value of X :- ");
        x = sc1.nextInt();
        System.out.print("Enter the Value of Y :- ");
        y = sc1.nextInt();

        try {
//            int Division_Result = Division1(x, y);
//            System.out.println(x + "/" + y + " is :- " + Division_Result);
        } catch (Exception e) {
            System.out.print("Exception Occured :- ");
            System.out.println(e);
        }

        System.out.println("Program Ended Successfully !!!");
        sc1.close();             // Free the Resources
        // Enter the Value of X :- 10
        // Enter the Value of Y :- 3
        // 10/3 is :- 3
        // Program Ended Successfully !!!

        // Enter the Value of X :- 10
        // Enter the Value of Y :- 0
        // Exception Occured :- java.lang.ArithmeticException: / by zero
        // Program Ended Successfully !!!


        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the Age :- ");
        int age = sc2.nextInt();
        Lec_84 a = new Lec_84();

        try {
            a.Age(age);
        } catch (Exception e) {
            System.out.println("Exception Occured :- " + e);
        }

        System.out.println("Program Ended Successfully !!!");
        sc2.close();            // Free the Resources
        // Enter the Age :- 100
        // Age is in Limit
        // Program Ended Successfully !!!

        // Enter the Age :- 126
        // Exception Occurred :- Age above Limit
        // Program Ended Successfully !!!


        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle :- ");
        int radius = sc3.nextInt();
        Lec_84 b = new Lec_84();

        try {
            double Area = b.Area(radius);
            System.out.println("Area of Circle having Radius-" + radius + " is :- " + Area);
            System.out.println("Area Calculated Successfully .....");
        } catch (Exception e) {
            System.out.println("Error Occured :- " + e);
        }

        System.out.println("Program Ended Successfully !!!");
        sc3.close();            // Free the Resources
        // Enter the Radius of Circle :- 12
        // Area of Circle having Radius-12 is :- 452.3893421169302
        // Area Calculated Successfully .....
        // Program Ended Successfully !!!

        // Enter the Radius of Circle :- -30
        // Error Occurred :- Negative Radius NOT Possible
        // Program Ended Successfully !!!

    }
}


// -------------------------------------------------------------------------------------------------------------------------
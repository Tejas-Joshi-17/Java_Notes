// -------------------------------------------------------------------------------------------------------------------------

// 81) Handling Specific Exceptions :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.Scanner;

public class Lec_81_HandlingSpecificException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] Marks1 = new int[3];
        Marks1[0] = 10;
        Marks1[1] = 20;
        Marks1[2] = 30;

        int index1;
        System.out.print("Enter the Index :- ");
        index1 = sc.nextInt();

        int a;
        System.out.print("Enter the Value of a :- ");
        a = sc.nextInt();

        try {
            System.out.println("You Enter the index1 :- " + index1);
            int answer = Marks1[index1] / a;
            System.out.println(Marks1[index1] + "/" + a + " = " + answer);
        } catch (Exception e) {
            System.out.println("Exception Occurred !!!");
            System.out.println(e);
        }

        System.out.println("Program Ended Successfully!!!");
        // Enter the Index :- 1
        // Enter the Value of b :- 7
        // You Enter the index :- 1
        // 20/7 = 2
        // Program Ended Successfully!!!

        // Enter the Index :- 4
        // Enter the Value of b :- 2
        // You Enter the index :- 4
        // Exception Occurred !!!
        // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        // Program Ended Successfully!!!

        // Enter the Index :- 2
        // Enter the Value of b :- 0
        // You Enter the index :- 2
        // Exception Occurred !!!
        // java.lang.ArithmeticException: / by zero
        // Program Ended Successfully!!!

        // Enter the Index :- 100
        // Enter the Value of b :- 0
        // You Enter the index :- 100
        // Exception Occurred !!!
        // java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3
        // Program Ended Successfully!!!


        Scanner obj = new Scanner(System.in);

        int[] Marks = new int[3];
        Marks[0] = 10;
        Marks[1] = 20;
        Marks[2] = 30;

        int index2;
        System.out.print("Enter the Index :- ");
        index2 = obj.nextInt();

        int b;
        System.out.print("Enter the Value of b :- ");
        b = obj.nextInt();

        try {
            System.out.println("You Enter the index2 :- " + index2);
            int answer = Marks[index2] / b;
            System.out.println(Marks[index2] + "/" + b + " = " + answer);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occurred :- ArrayIndexOutOfBoundsException !!!");
            System.out.println("Reasons :- Index 100 out of bounds for length 3");
        } catch (ArithmeticException e) {
            System.out.println("Exception Occurred :- ArithmeticException !!!");
            System.out.println("Reasons :- value of b is 0");
        } catch (Exception e) {
            System.out.println("Some Another Exception Occurred !!!");
            System.out.println("Reasons :- " + e);
        }

        System.out.println("Program Ended Successfully!!!");

        obj.close();         // Free the Resources
        // Enter the Index :- 1
        // Enter the Value of b :- 7
        // You Enter the index :- 1
        // 20/7 = 2
        // Program Ended Successfully!!!

        // Enter the Index :- 4
        // Enter the Value of b :- 2
        // You Enter the index :- 4
        // Exception Occurred :- ArrayIndexOutOfBoundsException !!!
        // Reasons :- Index 100 out of bounds for length 3
        // Program Ended Successfully!!!

        // Enter the Index :- 2
        // Enter the Value of b :- 0
        // You Enter the index :- 2
        // Exception Occurred :- ArithmeticException !!!
        // Reasons :- value of b is 0
        // Program Ended Successfully!!!

        // Enter the Index :- 100
        // Enter the Value of b :- 0
        // You Enter the index :- 100
        // Exception Occurred :- ArrayIndexOutOfBoundsException !!!
        // Reasons :- Index 100 out of bounds for length 3
        // Program Ended Successfully!!!

    }
}


// -------------------------------------------------------------------------------------------------------------------------
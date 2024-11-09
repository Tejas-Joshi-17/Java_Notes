// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 16) Confitionals in Java

//    if (Boolean){    boolean expression = true or age<10 but not 1

//    }

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

public class Lec_16 {
    public static void main(String[] args) {

        int age1 = 6;
        // if (true) {         output = You can drive ...!
        // if (1) {            output = int cannot be converted to boolean
        if (age1 > 18) {    // output = if true then able to drive
            // output = if false then unable to drive
            System.out.println("You can drive ...!");
        } else {
            System.out.println("You cannot drive ..!");
        }
        // You cannot drive ..!


        int age2 = 6;
        boolean cond = (age2 == 6);
        // if (true) {          output = You can drive ...!
        // if (1) {             output = int cannot be converted to boolean
        if (cond) {          // output = if true then able to drive
            // output = if false then unable to drive
            System.out.println("You can drive ...!");
        } else {
            System.out.println("You cannot drive ..!");
        }
        // You can drive ...!

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
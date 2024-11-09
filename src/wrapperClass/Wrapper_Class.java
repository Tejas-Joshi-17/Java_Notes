// ------------------------------------------------------------------------------------------------------------------------------------

// Wrapper Class in Java

// ------------------------------------------------------------------------------------------------------------------------------------


package wrapperClass;

public class Wrapper_Class {
    public static void main(String[] args) {

        // How to use Wrapper Classes
        Integer a = Integer.valueOf("12");    // a = 12

        // Auto-Boxing :-  primitive data-type -> Wrapper Class
        Integer b = 23;
        System.out.println("The Value of b is :- " + (int) b);
        // The Valiue of b is :- 23

        // Un-Boxing :-  Wrapper Class -> primitive data-type
        int c = b;
        System.out.println("The Value of c is :- " + c);
        // The Value of c is :- 23;

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
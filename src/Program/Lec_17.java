// ------------------------------------------------------------------------------------------------------------------------------------------------------

// Lecture - 17 Relational & Logical Operators

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

public class Lec_17 {
    public static void main(String[] args) {

        boolean a1 = true;
        boolean b1 = false;
        if (a1 && b1)                         // a1 = true && b1 = true  => Output = True
            System.out.println("True");       // a1 = true && b1 = false  => Output = false
        else                                  // a1 = false && b1 = true  => Output = false
            System.out.println("False");      // a1 = false && b1 = false  => Output = false


        int a2 = 20;
        int b2 = 100;
        if (a2 < 20 && b2 < 100)                  // a2 < 20 && b2 < 100  => Output = True
            System.out.println("True");       // a2 < 20 && b2 > 100  => Output = false
        else                                  // a2 > 20 && b2 < 100  => Output = false
            System.out.println("False");      // a2 > 20 && b2 > 100  => Output = false


        int a3 = 20;
        int b3 = 100;
        if (a3 < 20 || b3 < 100)                   // a3 < 20 || b3 < 100  => Output = True
            System.out.println("True");        // a3 < 20 || b3 > 100  => Output = true
        else                                   // a3 > 20 || b3 < 100  => Output = true
            System.out.println("False");       // a3 > 20 || b3 > 100  => Output = false


        boolean a4 = true;
        boolean b4 = false;
        if (!(a4 || b4))                       // !(a4 = true || b4 = true)  => Output = false
            System.out.println("True");        // !(a4 = true || b4 = false)  => Output = false
        else                                   // !(a4 = false || b4 = true)  => Output = false
            System.out.println("False");       // !(a4 = false || b4 = false)  => Output = true


        int a5 = 20;
        int b5 = 100;
        if (!(a5 < 20 || b5 < 100))                  // !(a5 < 20 || b5 < 100)  => Output = false
            System.out.println("True");         // !(a5 < 20 || b5 > 100)  => Output = false
        else                                    // !(a5 > 20 || b5 < 100)  => Output = false
            System.out.println("False");        // !(a5 > 20 || b5 > 100)  => Output = true

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
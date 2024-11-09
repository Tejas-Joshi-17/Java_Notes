// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 32) Functions Overloading / Methods Overloading

// -- 1) Same Function Name with different no of parameters possible.
// -- 2) Same Function Name with same no. of paramertes but different Return Type not Possible.

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

public class Lec_32 {

    static void Sum() {
        System.out.println("Hello");
    }

    static void Sum(int a) {
        System.out.println("Hello :- " + a);
    }

    static void Sum(int a, int b) {
        System.out.println("Hello :- " + a + " & " + b);
    }

    static void Sum(int a, int b, int c) {
        System.out.println("Hello :- " + a + " & " + b + " & " + c);
    }

    // static int Sum(int a, int b, int c) {        // <---- Error
    // System.out.println("Hello :- " + a + " & " + b + " & " + c);
    // return a;
    // }

    static int Sum(int a, int b, int c, int d) {
        System.out.println("Hello :- " + a + " & " + b + " & " + c);
        return 5;
    }

    public static void main(String[] args) {
        Sum();                                                 // Hello
        Sum(10);                                            // Hello :- 10
        Sum(10, 20);                                      // Hello :- 10 & 20
        Sum(10, 20, 30);                                // Hello :- 10 & 20 & 30
        System.out.println(Sum(1, 2, 3, 4));         // 5
    }

}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
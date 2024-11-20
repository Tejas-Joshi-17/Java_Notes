// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 8) Operators, Types of Operators & Expression in Java

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

public class Lec_8_Operators {
    public static void main(String[] args) {


        // Arithmetic Operators
        int k = 100;
        System.out.println("The value of k is :- " + k);            // The value of k is :- 100
        System.out.println("The value of k++ is :- " + k++);        // The value of k++ is :- 100
        System.out.println("The value of k is :- " + k);            // The value of k is :- 101
        System.out.println("The value of ++k is :- " + ++k);        // The value of ++k is :- 102
        System.out.println("The value of k is :- " + k);            // The value of k is :- 102
        System.out.println("The value of k-- is :- " + k--);        // The value of k-- is :- 102
        System.out.println("The value of k is :- " + k);            // The value of k is :- 101
        System.out.println("The value of --k is :- " + --k);        // The value of --k is :- 100
        System.out.println("The value of k is :- " + k);            // The value of k is :- 100


        // Arithmetic Operators
        int a = 100;
        int b = 20;
        int w = 10;
        int x = -10;
        System.out.println("a + b = " + (a + b));        // a + b = 120
        System.out.println("a - b = " + (a - b));        // a - b = 80
        System.out.println("a * b = " + (a * b));        // a * b = 2000
        System.out.println("a / b = " + (a / b));        // a / b = 5
        System.out.println("a % b = " + (a % b));        // a % b = 0
        System.out.println("w % b = " + (w % b));        // w % b = 10
        System.out.println("x % b = " + (x % b));        // x % b = -10


        // Arithmetic Operators
        float p = 4.6f, q = -4.6f, r = 1.1f;
        System.out.println("The value of p is :- " + p);          // The value of p is :- 4.6
        System.out.println("The value of q is :- " + q);          // The value of q is :- -4.6
        System.out.println("The value of r is :- " + r);          // The value of r is :- 1.1
        System.out.println("p % r = " + (p % r));                  // p % r = 0.19999981
        System.out.println("q % r = " + (q % r));                  // q % r = -0.19999981
        System.out.println("The value of p++ is :- " + p++);      // The value of p++ is :- 4.6
        System.out.println("The value of p is :- " + p);          // The value of p is :- 5.6
        System.out.println("The value of ++p is :- " + ++p);      // The value of ++p is :- 6.6
        System.out.println("The value of p is :- " + p);          // The value of p is :- 6.6
        System.out.println("The value of p-- is :- " + p--);      // The value of p-- is :- 6.6
        System.out.println("The value of p is :- " + p);          // The value of p is :- 5.6
        System.out.println("The value of --p is :- " + --p);      // The value of --p is :- 4.6
        System.out.println("The value of p is :- " + p);          // The value of p is :- 4.6


        // Arithmetic Operators
        char name = 'a';
        System.out.println("The value of name is :- " + name);          // The value of name is :- a
        System.out.println("The value of name++ is :- " + name++);      // The value of name++ is :- a
        System.out.println("The value of name is :- " + name);          // The value of name is :- b
        System.out.println("The value of ++name is :- " + ++name);      // The value of ++name is :- c
        System.out.println("The value of name is :- " + name);          // The value of name is :- c
        System.out.println("The value of name-- is :- " + name--);      // The value of name-- is :- c
        System.out.println("The value of name is :- " + name);          // The value of name is :- b
        System.out.println("The value of --name is :- " + --name);      // The value of --name is :- a
        System.out.println("The value of name is :- " + name);          // The value of name is :- a

        // Arithmetic Operators
        char game = 'z';
        System.out.println("The value of game is :- " + game);          // The value of game is :- z
        System.out.println("The value of game++ is :- " + game++);      // The value of game++ is :- z
        System.out.println("The value of game is :- " + game);          // The value of game is :- {
        System.out.println("The value of ++game is :- " + ++game);      // The value of ++game is :- |
        System.out.println("The value of game is :- " + game);          // The value of game is :- |
        System.out.println("The value of game-- is :- " + game--);      // The value of game-- is :- |
        System.out.println("The value of game is :- " + game);          // The value of game is :- {
        System.out.println("The value of --game is :- " + --game);      // The value of --game is :- z
        System.out.println("The value of game is :- " + game);          // The value of game is :- z


        // Comparison Operators
        int a3 = 20;
        int b3 = 5;
        System.out.println("The value of a3 is :- " + a3);          // The value of a3 is :- 20
        System.out.println("The value of b3 is :- " + b3);          // The value of b3 is :- 5
        System.out.println("a3 == b3 = " + (a3 == b3));            // a3 == b3 = false
        System.out.println("a3 != b3 = " + (a3 != b3));            // a3 != b3 = true
        System.out.println("a3 > b3 = " + (a3 > b3));              // a3 > b3 = true
        System.out.println("a3 < b3 = " + (a3 < b3));              // a3 < b3 = false
        System.out.println("a3 >= b3 = " + (a3 >= b3));            // a3 >= b3 = true
        System.out.println("a3 <= b3 = " + (a3 <= b3));            // a3 <= b3 = false


        // Comparison Operators
        char c = 'p';
        char d = 'q';
        System.out.println("The value of c is :- " + c);              // The value of c is :- p
        System.out.println("ASCII Value of p is :- " + (float) c);     // ASCII Value of p is :- 112.0
        System.out.println("The value of d is :- " + d);              // The value of d is :- q
        System.out.println("ASCII Value of q is :- " + (float) d);     // ASCII Value of q is :- 113.0
        System.out.println("c == d = " + (c == d));                  // c == d = false
        System.out.println("c != d = " + (c != d));                  // c != d = true
        System.out.println("c > d = " + (c > d));                    // c > d = false
        System.out.println("c < d = " + (c < d));                    // c < d = true
        System.out.println("c >= d = " + (c >= d));                  // c >= d = false
        System.out.println("c <= d = " + (c <= d));                  // c <= d = true


        // Comparison Operators
        float e = 12.5f;
        float f = 21.3f;
        System.out.println("The value of e is :- " + e);                // The value of e is :- 12.5
        System.out.println("ASCII Value of e is :- " + (float) e);       // ASCII Value of e is :- 12.5
        System.out.println("The value of d is :- " + f);                // The value of d is :- 21.3
        System.out.println("ASCII Value of f is :- " + (float) f);       // ASCII Value of f is :- 21.3
        System.out.println("e == f = " + (e == f));                    // e == f = false
        System.out.println("e != f = " + (e != f));                    // e != f = true
        System.out.println("e > f = " + (e > f));                      // e > f = false
        System.out.println("e < f = " + (e < f));                      // e < f = true
        System.out.println("e >= f = " + (e >= f));                    // e >= f = false
        System.out.println("e <= f = " + (e <= f));                    // e <= f = true


        // Bitwise Operators

        //  1) Bitwise AND = &
        //     1 & 1 = 1
        //     1 & 0 = 0
        //     0 & 1 = 0
        //     0 & 0 = 0

        //  2) Bitwise OR = |
        //     1 | 1 = 1
        //     1 | 0 = 1
        //     0 | 1 = 1
        //     0 | 0 = 0

        //  3) Bitwise XOR = ^
        //     1 ^ 1 = 0
        //     1 ^ 0 = 1
        //     0 ^ 1 = 1
        //     0 ^ 0 = 0

        int a4 = 10;                           // 10 = 1010
        int b4 = 12;                           // 12 = 1100
        System.out.println(a4 & b4);           //      1000 = 8
        System.out.println(a4 | b4);           //      1110 = 14
        System.out.println(a4 ^ b4);           //      0110 = 6


        // Comparison Operators
        int a5 = 4;
        int b5 = 5;
        System.out.println("The value of a5 is:- " + a5);                     // The value of a5 is:- 4
        System.out.println("The value of b5 is:- " + b5);                     // The value of b5 is:- 5

        System.out.println("a5<b5 && a5!=b5 = " + (a5 < b5 && a5 != b5));        // a5<b5 && a5!=b5 = true
        System.out.println("a5<b5 && a5==b5 = " + (a5 < b5 && a5 == b5));        // a5<b5 && a5==b5 = false
        System.out.println("a5>b5 && a5!=b5 = " + (a5 > b5 && a5 != b5));        // a5>b5 && a5!=b5 = false
        System.out.println("a5>b5 && a5==b5 = " + (a5 > b5 && a5 == b5));        // a5>b5 && a5==b5 = false

        System.out.println("a5<b5 || a5!=b5 = " + (a5 < b5 || a5 != b5));        // a5<b5 || a5!=b5 = true
        System.out.println("a5<b5 || a5==b5 = " + (a5 < b5 || a5 == b5));        // a5<b5 || a5==b5 = true
        System.out.println("a5>b5 || a5!=b5 = " + (a5 > b5 || a5 != b5));        // a5>b5 || a5!=b5 = true
        System.out.println("a5>b5 || a5==b5 = " + (a5 > b5 || a5 == b5));        // a5>b5 || a5==b5 = false

        System.out.println("!(a5<b5 || a5!=b5) = " + !(a5 < b5 || a5 != b5));    // a5<b5 || a5!=b5 = false
        System.out.println("!(a5<b5 || a5==b5) = " + !(a5 < b5 || a5 == b5));    // a5<b5 || a5==b5 = false
        System.out.println("!(a5>b5 || a5!=b5) = " + !(a5 > b5 || a5 != b5));    // a5>b5 || a5!=b5 = false
        System.out.println("!(a5>b5 || a5==b5) = " + !(a5 > b5 || a5 == b5));    // a5>b5 || a5==b5 = true


        // Important Concepts
        int y1 = 7;
        int x1 = ++y1 * 8;
        System.out.println("The Value of x is :- " + x1);               // The Value of x is :- 64


        // Important Concepts
        char d1 = 'B';
        System.out.println("The Value of d1 is :- " + d1);              // The Value of d1 is :- B
        d1++;
        System.out.println("The Value of d1 is :- " + d1);              // The Value of d1 is :- C
        ++d1;
        System.out.println("The Value of d1 is :- " + d1);              // The Value of d1 is :- D
        d1--;
        System.out.println("The Value of d1 is :- " + d1);              // The Value of d1 is :- C
        --d1;
        System.out.println("The Value of d1 is :- " + d1);              // The Value of d1 is :- B

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
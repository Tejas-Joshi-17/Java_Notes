// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 33) Variable Arguments

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

public class Lec_33_VariableArguments {

    static int Sum(int a, int b) {                           // Require 2 Arguments
        return a + b;
    }

    static int Sum(int a, int b, int c) {                    // Require 3 Arguments
        return a + b + c;
    }

    static int Sum(int a, int b, int c, int d) {             // Require 4 Arguments
        return a + b + c + d;
    }

    static int Arithmetic_Add(int... arr) {
        // don't require specific no. of arguments provide facility to give as many
        // argument as we wish. if no argument
        int z = 0;          // store arguments as an array int [] arr;
        for (int i = 0; i < arr.length; i++) {
            z += arr[i];
        }
        return z;
    }

    static int Geometric_Add(int x, int... arr) {       // Require atleast 1 Argument
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            p += arr[i];
        }
        p += x;
        return p;
    }

    public static void main(String[] args) {
        System.out.println(Sum(10, 20));                                 // 30
        System.out.println(Sum(10, 20, 30));                          // 60
        System.out.println(Sum(10, 20, 30, 40));                    // 100
        System.out.print(Arithmetic_Add(1, 2, 3, 4, 5, 6, 7, 8, 9));     // 45
        System.out.println(Arithmetic_Add(10, 20, 30, 88, 56, -50));     // 154
        System.out.println(Geometric_Add(20));                              // 20
    }

}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 31) Functions/Methods in Java

// -- 1) If we declare static function then we can access it directly by using Class_Name as well as by creating object.
// -- 2) If we not declare function as static as need to create object of class to access it only.

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Apple31 {
    public static void Add(int a, int b) {
        int ans = a + b;
        System.out.println("Sum of " + a + " + " + b + " is :- " + ans);
    }
}

class Banana31 {
    public void Add(int a, int b) {
        int ans = a + b;
        System.out.println("Sum of " + a + " + " + b + " is :- " + ans);
    }
}


public class Lec_31_MethodsInJava {

    public static void Greet() {
        System.out.println("Hello from Base Class");
    }

    static void swap(int[] var) {
        for (int i = 0; i < var.length; i++) {
            System.out.print(var[i] + " ");
        }
        System.out.println(" ");
        var[2] = 66;
    }

    public static void main(String[] args) {

        // By Creating Object
        Lec_31_MethodsInJava a1 = new Lec_31_MethodsInJava();
        a1.Greet();                      // Hello from Base Class

        // Directly by Using Class Name
        Lec_31_MethodsInJava.Greet();                  // Hello from Base Class

        // Directly by Using Class Name
        Apple31.Add(10, 20);          // Sum of 10 + 20 is :- 30

        Apple31 b1 = new Apple31();
        b1.Add(10, 30);              // Sum of 10 + 30 is :- 40


        // By Creating Object
        Lec_31_MethodsInJava a2 = new Lec_31_MethodsInJava();
        a2.Greet();                 // Hello from Base Class

        // Directly by Using Class Name
        Lec_31_MethodsInJava.Greet();             // Error - Cannot make a static reference to the non-static method

        // Directly by Using Class Name
        // Banana31.Add(10, 20);       Error - Cannot make a static reference to the non-static method

        Banana31 b2 = new Banana31();
        b2.Add(10, 30);         // Sum of 10 + 30 is :- 40


        int[] marks = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        swap(marks);            // Get Reference of the Array i.e. Address
        swap(marks);            // Get Reference of the Array i.e. Address
        System.out.println(marks[2]);
        // 10 20 30 40 50 60 70 80 90 100
        // 10 20 66 40 50 60 70 80 90 100
        // 66

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
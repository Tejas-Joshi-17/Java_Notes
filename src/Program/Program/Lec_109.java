// ----------------------------------------------------------------------------------------------------------------------------------------

// 109) Anonymous Class & Lambda Expression in Java :-

// ----------------------------------------------------------------------------------------------------------------------------------------


package Program.Program;

interface Animals {
    void walk();
}

@FunctionalInterface
interface LambdaExp {
    void math(int a, int b);
}

class Cat implements Animals, LambdaExp {

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    public void Jump() {
        System.out.println("Cat is Jumping");
    }

    public void math(int a, int b) {
        System.out.println("The value of a and b is : " + (a + b));
    }
}


public class Lec_109 {
    public static void main(String[] args) {

        // ----------------------- Anonymous Class ---------------------------------
        // 1) Normal Way
        Animals animals = new Cat();
        animals.walk();                 // Cat is walking

        // 2) Using anonymous Class
        Animals animals1 = new Animals() {
            @Override
            public void walk() {
                System.out.println("Cat is walking from anonymous class");
            }
        };
        animals1.walk();                // Cat is walking from anonymous class


        // ----------------------- Lambda Expression ---------------------------------
        // 1) Normal Way
        LambdaExp lambda1 = new Cat();
        lambda1.math(10, 20);      // The value of a and b is : 30


        // 2) Lambda Expression
        LambdaExp lambda2 = (int a, int b) -> {
            System.out.println("Sum of " + a + " & " + b + " is :- " + (a + b));
        };
        lambda2.math(100, 8);       // Sum of 100 & 8 is :- 108

        // 3) Lambda Expression
        LambdaExp lambda3 = (a, b) -> {
            System.out.println("Sum of " + a + " & " + b + " is :- " + (a + b));
        };
        lambda3.math(180, 78);       // Sum of 180 & 78 is :- 258

    }
}

// ----------------------------------------------------------------------------------------------------------------------------------------
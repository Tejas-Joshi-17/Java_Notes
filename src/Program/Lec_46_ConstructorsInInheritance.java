// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 46) Constructor in Inheritance

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Apple461 {
    public int x;   // same as int x; but it is default and this is public
    public int y;   // same as int y; but it is default and this is public

    public Apple461() {
        System.out.println("Hi this is Class Apple without Argument");
    }

    public Apple461(int a) {
        System.out.println("Hi this is Class Apple with Argument :- a");
    }

    public Apple461(int a, int b) {
        System.out.println("Hi this is Class Apple with Argument :- a & b");
    }
}

class Ball461 extends Apple461 {
    public Ball461() {
        System.out.println("Hi this is Class Ball without Argument");
    }

    public Ball461(int x) {
        System.out.println("Hi this is Class Ball with Argument :- x");
    }

    public Ball461(int x, int y) {
        System.out.println("Hi this is Class Ball with Argument :- x & y");
    }
}

class Cat461 extends Ball461 {
    public Cat461() {
        System.out.println("Hi this is Class Cat without Argument");
    }

    public Cat461(int p) {
        System.out.println("Hi this is Class Cat with Argument :- p");
    }

    public Cat461(int p, int q) {
        System.out.println("Hi this is Class Cat with Argument :- p & q");
    }
}

class Ball462 extends Apple461 {
    public Ball462() {
        super(3);     // As we don't have any data we pass 3 are argument
        System.out.println("Hi this is Class Ball without Argument");
    }

    public Ball462(int x) {
        System.out.println("Hi this is Class Ball with Argument :- x");
    }

    public Ball462(int x, int y) {
        super(y);
        System.out.println("Hi this is Class Ball with Argument :- x & y");
    }
}

class Cat462 extends Ball462 {
    public Cat462() {
        //1.
        //3.super(0);
        // स्वतः Argument देऊ शकत नाही म्हणून 0 अर्गुमेंट pass केला.
        System.out.println("Hi this is Class Cat without Argument");
    }

    public Cat462(int p) {
        super(p, 10);
        //2. super(0);
        System.out.println("Hi this is Class Cat with Argument :- p");
    }

    public Cat462(int p, int q) {
        System.out.println("Hi this is Class Cat with Argument :- p & q");
    }
}

public class Lec_46_ConstructorsInInheritance {
    public static void main(String[] args) {

        Apple461 a = new Apple461();
        // Hi this is Class Apple without Argument

        Ball461 b = new Ball461();
        // Hi this is Class Apple without Argument
        // Hi this is Class Ball without Argument

        Cat461 c = new Cat461();
        // Hi this is Class Apple without Argument
        // Hi this is Class Ball without Argument
        // Hi this is Class Cat without Argument

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
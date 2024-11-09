// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 48) Function Overriding / Method Overriding

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Parent_Class481 {
    public void Hello() {
        System.out.println("Hello from Parent Class");
    }

    public void Good_Morning() {
        System.out.println("Good Morning from Parent Class");
    }
}

class Child_Class481 extends Parent_Class481 {
    public void Good_Night() {
        System.out.println("Good Night from Child Class");
    }
}

class Child_Class482 extends Parent_Class481 {
    @Override
    public void Hello() {
        System.out.println("Hello from Child Class");
    }

    public void Good_Night() {
        System.out.println("Good Night from Child Class");
    }
}

public class Lec_48 {
    public static void main(String[] args) {

        Parent_Class481 a = new Parent_Class481();
        a.Hello();              // Hello from Parent Class
        a.Good_Morning();       // Good Morning from Parent Class

        Child_Class481 b = new Child_Class481();
        b.Hello();              // Hello from Parent Class              <-------
        b.Good_Morning();       // Good Morning from Parent Class
        b.Good_Night();         // Good Night from Child Class

        Child_Class482 c = new Child_Class482();
        c.Hello();              // Hello from Child Class                <-------
        c.Good_Morning();       // Good Morning from Parent Class
        c.Good_Night();         // Good Night from Child Class

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
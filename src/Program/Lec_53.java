// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 53) Abstract Class & Methods

/*
 *  1) Abstract Method = Method which is only declare not define.
 *  2) Abstract Class = Class which contains atleast one Absract Method.
 *  3) Concreate Method = Method which is declare as well as define.
 *  4) Concreate Class = Class which contains all methods as concreate.
 *
 *  1) One Abstract Method makes whole class as Abstract Class.
 *  2) Abstract Class can contains many Concreate Methods but it contains atleast one Abstract Method
 *  3) Using Abstract Class we can create another class.
 *  4) Absract Class is Standard Class.
 *  5) We cann't create object of Abstract Class.
 *  6) Untill all methods of Abstract Class is define we cann't create Concreate Class
 *  7) Either override all methods of Abstract Class or make the class itself as abstract class.
 *  8) You can create a concrete class by implementing all the methods of the abstract class.
 *  9) You can create a second abstract class from one abstract class without implementing at least one method.
 *  10) We can't create object of class untill it is Concreate.
 *
 *  1) Using an abstract class as a reference, you can create an object of a concrete class.
 *     Abstract_Class obj1 = new Concreate_Class();
 *  2) You cannot create an object of an abstract class using a reference to a concrete class.
 *     Concreate_Class obj1 = new Abstract_Class();
 */

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

abstract class Parent531 {
    public Parent531() {
        System.out.println("Mai Abstract class ka constructor hu");
    }

    public void sayHello() {
        System.out.println("Hello EveryOne");
    }

    abstract public void greet1();

    abstract public void greet2();
}

abstract class child531 extends Parent531 {
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }

}


class child532 extends child531 {
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Night");
    }
}

class child533 extends Parent531 {
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Night");
    }
}

public class Lec_53 {
    public static void main(String[] args) {

        // Abstract Class = Parent531, Child531
        // Concreate Class = Child532, Child533

        // Parent531 p = new Parent531();      <--- We cann't object of Abstract Class
        // child531 o = new child531();        <--- We cann't object of Abstract Class

        // We can Create Object of Concreate Class
        child532 q = new child532();
        child533 b = new child533();

        // Using an abstract class as a reference, you can create an object of a concrete class.
        Parent531 n = new child533();
        Parent531 m = new child532();

        // You cannot create an object of an abstract class using a reference to a concrete class.
        // child532 v1 = new Parent531();
        // child533 v2 = new Parent531();

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
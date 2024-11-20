// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 60) Chapter-11 Practise Set :-

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

interface Basic_Animal601 {
    public void Eat();

    default public void Sleep() {
        System.out.println("All Animals are Sleeping");
    }
}

abstract class Pen601 {
    abstract public void Write();

    public void Refill() {
        System.out.println("Refilling the Normal Pen");
    }
}

class Fountain_Pen601 extends Pen601 {
    public void Write() {
        System.out.println("Writing from the Pen");
    }

    public void Change_Nib() {
        System.out.println("Changing Nib of the Pen");
    }
}

class Fountain_Pen602 extends Pen601 {
    public void Write() {
        System.out.println("Writing from the Pen");
    }

    public void Change_Nib() {
        System.out.println("Changing Nib of the Pen");
    }

    @Override
    public void Refill() {
        System.out.println("Refilling the Fountain Pen");
    }
}

class Monkey601 {
    public void Jump() {
        System.out.println("Monkey is Jumping");
    }

    public void Bite() {
        System.out.println("Monkey is Biting");
    }
}

class Human601 extends Monkey601 implements Basic_Animal601 {
    @Override
    public void Jump() {
        System.out.println("Human are Jumping");
    }

    public void Eat() {
        System.out.println("Humans like eating Spicy foods");
    }

    @Override
    public void Bite() {
        System.out.println("Human never Bite");
    }

    @Override
    public void Sleep() {
        System.out.println("All Human are sleep at night");
    }

    public void Brain() {
        System.out.println("Only Humans have Brain");
    }
}

public class Lec_60_Chapter11PracticeSet {
    public static void main(String[] args) {

        // 1) Create an Abstract Class Pen with methods write() & refill() as Abstarct methods
        Fountain_Pen601 f1 = new Fountain_Pen601();
        f1.Write();              // Writing from the Pen
        f1.Refill();             // Refilling the Normal Pen
        f1.Change_Nib();         // Changing Nob of the Pen


        // 2) Use Pen class Q.1. to create concreate class FountainPen with additional methods changenib().
        Fountain_Pen602 f2 = new Fountain_Pen602();
        f2.Write();              // Writing from the Pen
        f2.Refill();             // Refilling the Fountain Pen
        f2.Change_Nib();         // Changing Nob of the Pen


        // 3) Create a class Monkey with jump() & bite() method. Create a class Human which inherites a monkey class and implements the basic animal interface with eat() & sleep() method
        Human601 a = new Human601();
        a.Jump();           // Human are Jumping
        a.Bite();           // Human never Bite
        a.Eat();            // Humans like eating Spicy foods
        a.Sleep();          // All Human are sleep at night
        a.Brain();          // Only Humans have Brain

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
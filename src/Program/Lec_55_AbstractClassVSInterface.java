// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 55) Abstract Class VS Interfaces

/*
 * 1) All Variable & Methods in Interface are 'public' by default.
 * 2) If we want to declare variable in interface, must declare as 'final' and also must initialize it's value at time of declaration.
 * 3) 'final' means we cannot modify value.
 * 4) one Interface can extend another Interface.
 * 5) One Interface cannot implement another interface but classes can do that Interface.
 * 6) We can't extend multiple Abstract Class / Concrete Class, but we can implement multiple Interfaces at a time.
 * 7) Interfaces are meant for dynamic method dispatch and run-time polymorphism.
 * 8) An Interface can only have method, constant field (final variable) and default methods.
 * 9) The Class implementing an Interface need to declare the methods(not field/ final variable)
 * 10) We can create a Reference of Interface but not the Object.
 */

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

interface Bicycle551 {
    final int a = 45;      // final means cannot be modify

    void applybreake(int decrement);

    void speedup(int increment);

    default void run() {
        System.out.println("abhi");
    }
}

interface HornBicycle551 extends Bicycle551 {
    final int by = 89;     // final means cannot be modify

    void blowHornK3g(int decrement);

    void blowHornBMW(int increment);
}

class AvonCycle551 implements HornBicycle551 {
    int speed = 50;

    public void applybreake(int decrement) {
        speed = speed - decrement;
        System.out.println("Speed will be " + speed);
    }

    public void speedup(int increment) {
        speed = speed + increment;
        System.out.println("Speed will be " + speed);
    }

    void playgame() {
        System.out.println("Playing Game");
    }

    public void blowHornK3g(int decrement) {
        speed = speed - decrement;
        System.out.println("Speed will be " + speed);
    }

    public void blowHornBMW(int increment) {
        speed = speed + increment;
        System.out.println("Speed will be " + speed);
    }
}

public class Lec_55_AbstractClassVSInterface {
    public static void main(String[] args) {

        AvonCycle551 harry = new AvonCycle551();
        harry.applybreake(5);
        harry.speedup(10);
        harry.blowHornK3g(78);
        harry.blowHornBMW(41);
        harry.run();

        // You can not modify properties in Interfaces as they are final.
        // harry.a = 56;  <----The final field Bicycle.a cannot be assigned i.e.Error

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
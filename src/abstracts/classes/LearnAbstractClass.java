// --------------------------------------------------------------------------------------------------------------------------------------------------------------

package abstracts.classes;

import java.util.logging.Logger;

abstract class Vehicle {

    protected static final Logger logger = Logger.getLogger(Vehicle.class.getName());

    abstract void accelerate();

    void breaks() {
        logger.info("Vehicle's breaks are applied");
    }
}

abstract class Car extends Vehicle {
    void accelerate() {
        logger.info("Car is Accelerating");
    }

    @Override
    void breaks() {
        logger.info("Car's breaks is applied");
    }

    abstract void run();
}

class SuperCar extends Car {

    @Override
    void run() {
        logger.info("Super-Car is Running");
    }
}

class BiCycle extends Vehicle {

    @Override
    void accelerate() {
        logger.info("BiCycle is Accelerating");
    }
}

public class LearnAbstractClass {

    protected static final Logger logger = Logger.getLogger(LearnAbstractClass.class.getName());

    public static void main(String[] args) {

        Car car = new SuperCar();
        car.accelerate();       // Car is Accelerating
        car.breaks();           // Car's breaks is applied
        car.run();              // Super-Car is Running

        BiCycle biCycle = new BiCycle();
        biCycle.accelerate();   // BiCycle is Accelerating
        biCycle.breaks();       // Vehicle's breaks are applied

    }
}

// --------------------------------------------------------------------------------------------------------------------------------------------------------------
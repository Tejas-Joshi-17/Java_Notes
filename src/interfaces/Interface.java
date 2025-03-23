// ------------------------------------------------------------------------------------------------------------------------------------

package interfaces;

import java.util.logging.Logger;

interface Animal {

    public static final Logger logger = Logger.getLogger(Animal.class.getName());
    public static final String NAME = "Animal";

    void eats();

    default void run() {
        logger.info("Animal is Running");
    }
}

interface Cat extends Animal {
    void bark();

    default void laugh() {
        logger.info("Cat is Laughing");
    }
}

interface Fish {

    public static final Logger logger = Logger.getLogger(Fish.class.getName());

    void swim();

    default void eating() {
        logger.info("Fish is Eating");
    }
}

public class Interface implements Fish, Cat {

    protected static final Logger logger = Logger.getLogger(Interface.class.getName());

    @Override
    public void bark() {
        logger.info("Interface Class is Barking");
    }

    @Override
    public void laugh() {
        Cat.super.laugh();
    }

    @Override
    public void eats() {
        logger.info("Interface Class is Eating");
    }

    @Override
    public void run() {
        // Cat.super.run();     <-- Changing default implementation of method
        logger.info("Interface Class is Running");
    }

    @Override
    public void swim() {
        logger.info("Interface Class is Swimming");
    }

    @Override
    public void eating() {
        Fish.super.eating();
    }

    public static void main(String[] args) {

        Animal animal = new Interface();
        animal.eats();                     // Interface Class is Eating
        animal.run();                      // Interface Class is Running

        Cat cat = new Interface();
        cat.bark();                        // Interface Class is Barking
        cat.eats();                        // Interface Class is Eating
        cat.run();                         // Interface Class is Running
        cat.laugh();                       // Cat is Laughing

        Fish fish = new Interface();
        fish.eating();                     // Fish is Eating
        fish.swim();                       // Interface Class is Swimming

        Interface interfaces = new Interface();
        interfaces.bark();                 // Interface Class is Barking
        interfaces.eats();                 // Interface Class is Eating
        interfaces.run();                  // Interface Class is Running
        interfaces.swim();                 // Interface Class is Swimming
        interfaces.laugh();                // Cat is Laughing
        interfaces.eating();               // Fish is Eating

    }

}

// ------------------------------------------------------------------------------------------------------------------------------------
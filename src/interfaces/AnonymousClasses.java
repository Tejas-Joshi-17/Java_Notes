// ------------------------------------------------------------------------------------------------------------------------------------

package interfaces;

import java.util.logging.Logger;

class Parent {

    protected final Logger LOGGER = Logger.getLogger(Parent.class.getName());

    void greet() {
        LOGGER.info("Good Morning From Parent Class");
    }
}

interface Animals {

    Logger LOGGER = Logger.getLogger(Animals.class.getName());

    void bark();
    default void night() {
        LOGGER.info("Good Night From Animals Interface");
    }
}

public class AnonymousClasses {

    protected static final Logger LOGGER = Logger.getLogger(AnonymousClasses.class.getName());

    public static void main(String[] args) {

        Parent parent = new Parent() {          // An Anonymous Class extending subClasses

            @Override
            void greet() {
                LOGGER.info("Good Morning From Anonymous Class's Object");
            }

            void test() {
                LOGGER.info("This is for Testing Purpose");
            }

        };

        parent.greet();             // Good Morning From Anonymous Class's Object
        // parent.test();         <--- Anonymous Class Object cannot have extra methods added to it.

        Animals animals = new Animals() {          // An Anonymous Class implementing Interface
            @Override
            public void bark() {
                LOGGER.info("Animal is Barking From Anonymous Class's-Object");
            }

            @Override
            public void night() {
                LOGGER.info("Animals is Sleeping in Night From Anonymous Class's-Object");
            }

            void test() {
                LOGGER.info("This is for Testing Purpose");
            }
        };

        animals.bark();             // Animal is Barking From Anonymous Class's-Object
        animals.night();            // Animals is Sleeping in Night From Anonymous Class's-Object
        // animals.test();          <--- Anonymous Class Object cannot have extra methods added to it.

    }

}

// ------------------------------------------------------------------------------------------------------------------------------------
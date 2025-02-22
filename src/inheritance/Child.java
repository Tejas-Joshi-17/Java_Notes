// ------------------------------------------------------------------------------------------------------------------------------------------------

package inheritance;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Child extends Parent {
    protected static final Logger logger = Logger.getLogger(Child.class.getName());

    protected static int number = 17;

    protected static void goodNight() {
        logger.log(Level.INFO, "Good Night From Child Class");
    }

    public static void main(String[] args) {

        System.out.println("Child Number is :- " + Child.number);        // Child Number is :- 17
        System.out.println("Parent Number is :- " + Parent.number);      // Parent Number is :- 10

        System.out.println("Child Test is :- " + Child.testNumber);      // Child Test is :- 20
        System.out.println("Parent Test is :- " + Parent.testNumber);    // Child Test is :- 20

        Child.goodNight();          // Good Night From Child Class
        Parent.goodNight();         // Good Night From Parent Class

        Child.goodMorning();        // Good Morning From Parent Class
        Parent.goodMorning();       // Good Morning From Parent Class

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------------------
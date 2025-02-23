// ------------------------------------------------------------------------------------------------------------------------------------------------

package staticKeyword.inheritance;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Child extends Parent {
    protected static final Logger logger = Logger.getLogger(Child.class.getName());

    protected static int number = 17;

    protected static void goodNight() {
        logger.log(Level.INFO, "Good Night From Child Class");
    }

    public static void main(String[] args) {

        logger.log(Level.INFO, "Child Number is :- {0}", Child.number);       // Child Number is :- 17
        logger.log(Level.INFO, "Child Number is :- {0}", Parent.number);      // Child Number is :- 10

        logger.log(Level.INFO, "Child Test is :- {0}", testNumber);           // Child Test is :- 20
        logger.log(Level.INFO, "Child Test is :- {0}", testNumber);           // Child Test is :- 20

        Child.goodNight();          // Good Night From Child Class
        Parent.goodNight();         // Good Night From Child Class

        goodMorning();              // Good Morning From Child Class
        goodMorning();              // Good Morning From Child Class

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------------------
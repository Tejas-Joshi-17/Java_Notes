// ------------------------------------------------------------------------------------------------------------------------------------

// Wrapper Class in Java

// ------------------------------------------------------------------------------------------------------------------------------------


package wrappers.classes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WrapperClass {

    protected static final Logger logger = Logger.getLogger(WrapperClass.class.getName());

    public static void main(String[] args) {

        // How to use Wrapper Classes
        Integer a = Integer.valueOf("12");    // a = 12

        // Auto-Boxing :-  primitive data-type -> Wrapper Class
        Integer b = 23;
        logger.log(Level.INFO, "The Value of b is :- {0}", (int) b);
        // The Valiue of b is :- 23

        // Un-Boxing :-  Wrapper Class -> primitive data-type
        int c = b;
        logger.log(Level.INFO, "The Value of c is :- {0}", c);
        // The Value of c is :- 23;

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
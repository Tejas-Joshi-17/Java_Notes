// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.throow.and.throwss;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowAndThrows3 {

    protected static final Logger logger = Logger.getLogger(ThrowAndThrows3.class.getName());

    public static void divideByZero() throws ArithmeticException {
        int a = 30 / 0;
    }

    public static void main(String[] args) {
        logger.info("Starting Program");

        try {
            divideByZero();
        } catch (Exception e) {
            logger.log(Level.INFO, "Exception Occurs :- {0}", e.getMessage());
        }

        logger.info("Ending Program");
        // Starting Program
        // Exception Occurs :- / by zero
        // Ending Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
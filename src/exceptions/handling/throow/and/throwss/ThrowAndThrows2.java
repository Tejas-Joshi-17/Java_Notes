// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.throow.and.throwss;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowAndThrows2 {

    protected static final Logger logger = Logger.getLogger(ThrowAndThrows2.class.getName());

    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            logger.log(Level.INFO, "e => {0}", e.getMessage());
        }
        // e => Trying to divide by 0

        int[] arr = new int[50];
        try {
            arr[100] = 23232;
        } catch (Exception e) {
            logger.log(Level.INFO, "e => {0}", e.getMessage());
        }
        // e => 100
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
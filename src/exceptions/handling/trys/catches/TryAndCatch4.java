// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.trys.catches;

import java.util.logging.Logger;

public class TryAndCatch4 {

    protected static final Logger logger = Logger.getLogger(TryAndCatch4.class.getName());

    public static void fourthTryCatch() {
        int[] array4 = new int[5];

        logger.info("Starting the Program");
        try {
            logger.info("Good Morning Apple");
            array4[7] = 56;
            logger.info("Good Night Apple");
        } catch (Exception e) {
            logger.info("OutOfBound Exception Occurred");
        }

        logger.info("Starting the Program");
    }

    public static void main(String[] args) {
        fourthTryCatch();
        //  Starting the Program
        //  Good Morning Apple
        //  OutOfBound Exception Occurred
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
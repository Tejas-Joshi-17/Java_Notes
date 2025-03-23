// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.trys.catches;

import java.util.logging.Logger;

public class TryAndCatch3 {

    protected static final Logger logger = Logger.getLogger(TryAndCatch3.class.getName());

    public static void thirdTryCatch() {
        int[] array3 = new int[5];

        logger.info("Starting the Program");
        try {
            array3[7] = 56;
            logger.info("Good Morning Apple");
        } catch (Exception e) {
            logger.info("OutOfBound Exception Occurred");
        }

        logger.info("Starting the Program");
    }

    public static void main(String[] args) {
        thirdTryCatch();
        //  Starting the Program
        //  OutOfBound Exception Occurred
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.trys.catches;

import java.util.logging.Logger;

public class TryAndCatch2 {

    protected static final Logger logger = Logger.getLogger(TryAndCatch2.class.getName());

    public static void secondTryCatch() {
        int[] array2 = new int[5];

        logger.info("Starting the Program");
        try {
            array2[7] = 56;
        } catch (Exception e) {
            logger.info("OutOfBound Exception Occurred");
        }

        logger.info("Starting the Program");
    }

    public static void main(String[] args) {
        secondTryCatch();
        //  Starting the Program
        //  OutOfBound Exception Occurred
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
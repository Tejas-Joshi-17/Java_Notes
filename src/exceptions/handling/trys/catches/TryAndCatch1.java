// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.trys.catches;

import java.util.logging.Logger;

public class TryAndCatch1 {

    protected static final Logger logger = Logger.getLogger(TryAndCatch1.class.getName());

    public static void firstTryCatch() {
        int[] array1 = new int[5];

        logger.info("Starting the Program");

        array1[7] = 56;

        logger.info("Starting the Program");
    }

    public static void main(String[] args) {
        firstTryCatch();
        //  Starting the Program
        //  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
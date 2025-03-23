// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.trys.catches;

import java.util.logging.Logger;

public class TryAndCatch5 {

    protected static final Logger logger = Logger.getLogger(TryAndCatch5.class.getName());

    public static void fifthTryCatch() {
        int[] array5 = new int[5];

        logger.info("Starting the Program");
        try {
            logger.info("Good Morning Apple");
            array5[7] = 56;
            logger.info("Good Night Apple");
        } catch (NullPointerException e) {
            logger.info("Handing NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.info("Handling ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            logger.info("Handling all kinds of Exception");
        }

        logger.info("Starting the Program");
    }

    public static void main(String[] args) {
        fifthTryCatch();
        //  Starting the Program
        //  Good Morning Apple
        //  Handling ArrayIndexOutOfBoundsException
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
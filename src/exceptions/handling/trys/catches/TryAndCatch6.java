// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.trys.catches;

import java.util.logging.Logger;

public class TryAndCatch6 {

    protected static final Logger logger = Logger.getLogger(TryAndCatch6.class.getName());

    public static void sixthTryCatch() {
        int[] array6 = new int[5];

        logger.info("Starting the Program");
        try {
            logger.info("Good Morning Apple");
            array6[7] = 56;
            logger.info("Good Night Apple");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            logger.info("Handing NullPointerException & ArrayOurOfBoundException & ArithmeticException");
        } catch (RuntimeException e) {
            logger.info("Handling all kinds of Exception");
        }

        logger.info("Starting the Program");
    }

    public static void main(String[] args) {
        sixthTryCatch();
        //  Starting the Program
        //  Good Morning Apple
        //  Handing NullPointerException & ArrayOurOfBoundException & ArithmeticException
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
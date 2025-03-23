// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.finallly.block;

import java.util.logging.Logger;

public class FinallyBlock1 {

    protected static final Logger logger = Logger.getLogger(exceptions.handling.finallly.block.FinallyBlock1.class.getName());

    public static void firstFinallyBlock() {
        logger.info("Staring Program");
        try {
            int a = 34 / 0;
        } catch (Exception e) {
            logger.info(e.toString());
        } finally {
            logger.info("Hello from finally Block");
        }
        logger.info("Ending Program");
    }

    public static void main(String[] args) {
        firstFinallyBlock();
        // Starting Program
        // java.lang.ArithmeticException: / by zero
        // Hello from finally Block
        // Ending Program
    }

}

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

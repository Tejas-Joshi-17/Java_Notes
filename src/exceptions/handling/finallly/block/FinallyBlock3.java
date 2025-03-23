// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.finallly.block;

import java.util.logging.Logger;

public class FinallyBlock3 {
    
    protected static final Logger logger = Logger.getLogger(FinallyBlock3.class.getName());

    public static void thirdFinallyBlock() {
        logger.info("Staring Program");
        try {
            int a = 34 / 23;
        } catch (Exception e) {
            logger.info(e.toString());
        } finally {
            int sum = 100 / 0;
            logger.info("Hello from finally Block");
        }
        logger.info("Ending Program");
    }

    public static void main(String[] args) {
        thirdFinallyBlock();
        // Staring Program
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.FinallyBlock;

import java.util.logging.Logger;

public class FinallyBlock4 {
    
    protected static final Logger logger = Logger.getLogger(FinallyBlock4.class.getName());

    public static void fourthFinallyBlock() {
        logger.info("Staring Program");
        try {
            int a = 34 / 0;
        } catch (Exception e) {
            logger.info("Handling Exception");
            System.exit(1);
        } finally {
            logger.info("Hello from finally Block");
        }
        logger.info("Ending Program");
    }

    public static void main(String[] args) {
        fourthFinallyBlock();
        // Staring Program
        // Handling Exception
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
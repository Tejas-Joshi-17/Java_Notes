// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.FinallyBlock;

import java.util.logging.Logger;

public class FinallyBlock2 {
    
    protected static final Logger logger = Logger.getLogger(FinallyBlock2.class.getName());

    public static void secondFinallyBlock() {
        logger.info("Staring Program");
        try {
            int a = 34 / 2;
        } catch (Exception e) {
            logger.info(e.toString());
        } finally {
            logger.info("Hello from finally Block");
        }
        logger.info("Ending Program");
    }

    public static void main(String[] args) {
        secondFinallyBlock();
        // Starting Program
        // Hello from finally Block
        // Ending Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
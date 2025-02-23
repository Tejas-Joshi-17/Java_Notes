// ------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

import java.util.logging.Logger;

public class StaticAndInstanceBlock {

    protected static final Logger logger = Logger.getLogger(StaticAndInstanceBlock.class.getName());

    protected static int staticVariable = 10;
    protected int instanceVariable = 10;

    // Static Block         <------ Executed once when the class is loaded into memory.
    static {
        staticVariable = 20;
        logger.info("Setting Value of Static Variable Using Static Block");
    }

    // Instance Block       <------ Executed every time an object is created, before the constructor.
    {
        this.instanceVariable = 20;
        logger.info("Setting Value of Instance Variable Using Instance Block");
    }

    // Constructor
    public StaticAndInstanceBlock() {
        logger.info("This is Constructor");
    }

    public static void main(String[] args) {

        logger.info("This is Start of Main Function");
        StaticAndInstanceBlock s1 = new StaticAndInstanceBlock();
        StaticAndInstanceBlock s2 = new StaticAndInstanceBlock();
        StaticAndInstanceBlock s3 = new StaticAndInstanceBlock();
        logger.info("This is End of Main Function");

        // Setting Value of Static Variable Using Static Block
        // This is Start of Main Function
        // Setting Value of Instance Variable Using Instance Block
        // This is Constructor
        // Setting Value of Instance Variable Using Instance Block
        // This is Constructor
        // Setting Value of Instance Variable Using Instance Block
        // This is Constructor
        // This is End of Main Function
        
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
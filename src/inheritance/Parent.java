// ------------------------------------------------------------------------------------------------------------------------------------------------

package inheritance;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Parent {
    private static final Logger logger = Logger.getLogger(Parent.class.getName());

    protected static int number = 10;
    protected static int testNumber = 20;

    protected static void goodMorning() {
        logger.log(Level.INFO, "Good Morning From Parent Class");
    }

    protected static void goodNight() {
        logger.log(Level.INFO, "Good Night From Parent Class");
    }

    public static void main(String[] args) {
        Parent.number = 121;
        Parent.goodMorning();
    }

}

// ------------------------------------------------------------------------------------------------------------------------------------------------
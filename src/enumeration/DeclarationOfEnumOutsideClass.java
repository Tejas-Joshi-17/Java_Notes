package enumeration;

import java.util.logging.Level;
import java.util.logging.Logger;

enum Color {
    RED,            // Implicitly 'public static final'
    GREEN,          // Implicitly 'public static final'
    BLUE            // Implicitly 'public static final'
}

public class DeclarationOfEnumOutsideClass {

    protected static final Logger logger = Logger.getLogger(DeclarationOfEnumOutsideClass.class.getName());

    public static void main(String[] args) {

        Color c1 = Color.RED;
        logger.log(Level.INFO, "Color is :- {0}", c1);          // Color is :- RED

    }

}

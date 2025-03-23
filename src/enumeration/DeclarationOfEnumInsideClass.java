// ------------------------------------------------------------------------------------------------------------------------------------

package enumeration;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DeclarationOfEnumInsideClass {
    protected static final Logger logger = Logger.getLogger(DeclarationOfEnumInsideClass.class.getName());

    enum Color {
        RED,        // Implicitly 'public static final'
        GREEN,      // Implicitly 'public static final'
        BLUE        // Implicitly 'public static final'
    }

    public static void main(String[] args) {

        Color c1 = Color.BLUE;
        logger.log(Level.INFO, "Color is :- {0}", c1);      // Color is :- BLUE

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
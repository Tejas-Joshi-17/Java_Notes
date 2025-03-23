package enumeration;

import java.util.logging.Level;
import java.util.logging.Logger;


enum Colors {
    RED,        // Implicitly 'public static final'
    GREEN,      // Implicitly 'public static final'
    BLUE        // Implicitly 'public static final'
}

public class LoopThroughEnum {

    protected static final Logger logger = Logger.getLogger(LoopThroughEnum.class.getName());

    public static void main(String[] args) {

        for(Colors colors : Colors.values())
            logger.log(Level.INFO, "Color is :- {0}", colors);
        // Color is :- RED
        // Color is :- GREEN
        // Color is :- BLUE

    }

}

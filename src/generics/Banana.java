// ------------------------------------------------------------------------------------------------------------------------------------

package generics;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Banana<T extends Number> {

    protected static final Logger logger = Logger.getLogger(Banana.class.getName());

    public T milk(T num) {
        logger.log(Level.INFO, "Value is :- {0}", num);
        logger.log(Level.INFO, "class is :- {0}", num.getClass().getName());
        return num;
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
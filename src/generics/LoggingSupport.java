// ------------------------------------------------------------------------------------------------------------------------------------

package generics;

import java.util.logging.Logger;

public class LoggingSupport<T> {
    protected Class<T> tClass;

    public static Logger logger = null;

    protected LoggingSupport() {
        //
    }

    protected LoggingSupport(Class<T> tClass) {
        this.tClass = tClass;
        logger = Logger.getLogger(tClass.getName());
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
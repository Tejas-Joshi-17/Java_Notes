// ------------------------------------------------------------------------------------------------------------------------------------

package generics;

import java.util.logging.Level;

class Apple<V> extends LoggingSupport<Apple> {

    public Apple() {
        super(Apple.class);
    }

    public void goodMorning(V data) {
        logger.log(Level.INFO, "Good Morning :- {0}" , data);
    }

    public <K> int goodNight(K data) {
        return 23;
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
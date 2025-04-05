// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

// @Override :-   1) used to check whether Same method with same signature present in Parent Class till Object Class
//                2) If Not use No problem, but it might you write method with explicit definition which is not present in Parent Class till Object Class

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

import java.util.logging.Logger;

class OverrideAnno1 {
    public static final Logger logger = Logger.getLogger(OverrideAnno1.class.getName());

    void greet() {
        logger.info("This is present in Parent-Class");
    }

}

public class OverrideAnnotation extends OverrideAnno1{

    @Override
    void greet() {          // Add the "@Override" annotation above this method signature
        logger.info("This is present in Child-Class");
    }

    void goodMorning() {
        logger.info("Good Morning From Child Class");
    }

    // @Override            <---- Method does not override method from its superclass
    void goodNight() {
        logger.info("Good Night From Child Class");
    }

    public static void main(String[] args) {
        OverrideAnno1 overrideAnno1 = new OverrideAnno1();
        overrideAnno1.greet();               // This is present in Parent-Class

        OverrideAnnotation overrideAnnotation = new OverrideAnnotation();
        overrideAnnotation.greet();          // This is present in Child-Class
        overrideAnnotation.goodMorning();    // Good Morning From Child Class
        overrideAnnotation.goodNight();      // Good Night From Child Class
    }
}


// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
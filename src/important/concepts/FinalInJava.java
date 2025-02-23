// ------------------------------------------------------------------------------------------------------------------------------------

// Like const in C, C++, Javascript
// There is 'final' in Java

// ------------------------------------------------------------------------------------------------------------------------------------


package important.concepts;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FinalInJava {

    protected static final Logger logger = Logger.getLogger(FinalInJava.class.getName());

    public static void main(String[] args) {
        final int finalVariable = 34;

        logger.log(Level.INFO, "The Value of a is :- {0}", finalVariable);
        // The Value of finalVariable is :- 34

        // finalVariable = 50;   <---- Cannot change value of const variable.
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
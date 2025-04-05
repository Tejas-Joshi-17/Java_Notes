// ------------------------------------------------------------------------------------------------------------------------------------

package interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;

@FunctionalInterface
interface FunctionalInterfaces1 {
    int square(int x);
}

@FunctionalInterface
interface FunctionalInterfaces2 {
    void sum(int x, int y);
}

public class FunctionalInterfaceAndLambdaExpression {

    private static final Logger LOGGER = Logger.getLogger(FunctionalInterfaceAndLambdaExpression.class.getName());

    public static void main(String[] args) {

        // -------------------------------------------------------------------------------------------------------------

        FunctionalInterfaces1 functionalInterfaces11 = new FunctionalInterfaces1() {
            @Override
            public int square(int x) {
                return x*x;
            }
        };

        FunctionalInterfaces1 functionalInterfaces12 = (int x) -> {
            return x*x;
        };

        FunctionalInterfaces1 functionalInterfaces13 = x -> x*x;

        LOGGER.log(Level.INFO, "Square of 2 is :- {0}", functionalInterfaces11.square(2));  // Square of 2 is :- 4
        LOGGER.log(Level.INFO, "Square of 4 is :- {0}", functionalInterfaces12.square(4));  // Square of 4 is :- 16
        LOGGER.log(Level.INFO, "Square of 6 is :- {0}", functionalInterfaces13.square(6));  // Square of 6 is :- 36

        // -------------------------------------------------------------------------------------------------------------


        FunctionalInterfaces2 functionalInterfaces21 = new FunctionalInterfaces2() {
            @Override
            public void sum(int x, int y) {
                LOGGER.log(Level.INFO, "Sum of 1 & 2 is :- {0}", (1+2));
            }
        };

        FunctionalInterfaces2 functionalInterfaces22 = (x, y) -> {
            LOGGER.log(Level.INFO, "Sum of 3 & 4 is :- {0}", (x+y));
        };

        functionalInterfaces21.sum(1, 2);   // Sum of 1 & 2 is :- 3
        functionalInterfaces22.sum(3, 4);   // Sum of 3 & 4 is :- 7

        // -------------------------------------------------------------------------------------------------------------

    }

}

// ------------------------------------------------------------------------------------------------------------------------------------
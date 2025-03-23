// ------------------------------------------------------------------------------------------------------------------------------------

// Labeled Break :- Use to break from loop having label passed

// ------------------------------------------------------------------------------------------------------------------------------------


package important.concepts;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LabeledBreak {

    protected static final Logger logger = Logger.getLogger(LabeledBreak.class.getName());

    public static void main(String[] args) {

        lable1:     // <---- Label for Child while Loop
        for (int i = 0; i < 5; i++) {
            logger.log(Level.INFO, "Value of i :- {0}", i);
            for (int j = 0; j < 5; j++) {
                logger.log(Level.INFO, "Value of j :- {0}", j);
                if (j == 3) {
                    break lable1;
                }
            }
        }
    }
}
// Value of i :- 0
// Value of j :- 0
// Value of j :- 1
// Value of j :- 2
// Value of j :- 3

// ------------------------------------------------------------------------------------------------------------------------------------
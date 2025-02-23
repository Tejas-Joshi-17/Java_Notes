// ------------------------------------------------------------------------------------------------------------------------------------

// Labeled Continue :- Use to continue from loop having label passed

// ------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LabeledContinue {

    private static final Logger logger = Logger.getLogger(LabeledContinue.class.getName());

    public static void main(String[] args) {

        lable1:     // <---- Label for Child while Loop
        for (int i = 0; i < 3; i++) {
            logger.log(Level.INFO,"Value of i :- {0}", i);
            for (int j = 0; j < 3; j++) {
                logger.log(Level.INFO,"Value of j :- {0}", j);
                if (j == 2) {
                    continue lable1;
                }
            }
        }
    }
}
// Value of i :- 0
// Value of j :- 0
// Value of j :- 1
// Value of j :- 2
// Value of i :- 1
// Value of j :- 0
// Value of j :- 1
// Value of j :- 2
// Value of i :- 2
// Value of j :- 0
// Value of j :- 1
// Value of j :- 2

// ------------------------------------------------------------------------------------------------------------------------------------
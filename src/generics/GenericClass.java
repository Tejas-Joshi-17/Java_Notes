// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

package generics;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericClass {
    
    protected static final Logger logger = Logger.getLogger(GenericClass.class.getName());
    
    public static void main(String[] args) {

        Student<Integer, String> a = new Student<>();
        a.setRollNo(1);
        a.setName("Tejas Joshi");
        logger.log(Level.INFO, "a's Roll_No is :- {0}", a.getRollNo());    // a's Roll_No is :- 1
        logger.log(Level.INFO, "a'Name  is :- {0}", a.getName());          // a's Name is :- Tejas Joshi

        Student<Double, Integer> b = new Student<>();
        b.setRollNo(23.12);
        b.setName(11);
        logger.log(Level.INFO, "b's Roll_No is :- {0}", b.getRollNo());    // b's Roll_No is :- 23.12
        logger.log(Level.INFO, "b'Name  is :- {0}", b.getName());          // b's Name is :- 11


    }
}


// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
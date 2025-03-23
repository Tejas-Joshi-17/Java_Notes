// ------------------------------------------------------------------------------------------------------------------------------------

package generics;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericClass {
    
    protected static final Logger logger = Logger.getLogger(GenericClass.class.getName());
    
    public static void main(String[] args) {

        Student<Integer, String> a = new Student<>();
        a.setRoll_No(1);
        a.setName("Tejas Joshi");
        logger.log(Level.INFO, "a's Roll_No is :- {0}", a.getRoll_No());   // a's Roll_No is :- 1
        logger.log(Level.INFO, "a'Name  is :- {0}", a.getName());          // a's Name is :- Tejas Joshi

        Student<Double, Integer> b = new Student<>();
        b.setRoll_No(23.12);
        b.setName(11);
        logger.log(Level.INFO, "b's Roll_No is :- {0}", b.getRoll_No());   // b's Roll_No is :- 23.12
        logger.log(Level.INFO, "b'Name  is :- {0}", b.getName());          // b's Name is :- 11


    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
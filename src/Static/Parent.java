// ------------------------------------------------------------------------------------------------------------------------------------------------

package Static;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Parent {
    protected static final Logger logger = Logger.getLogger(Parent.class.getName());

    public static int NUM = 10;     // <-- Make static variable as 'final' so that no instance can change value of variable

    public static void greet() {
        logger.info("Good Morning, From Parent Class");
    }

    public void good() {
        logger.info("Good Bye, Form Parent Class");
    }

    public static void main(String[] args) {
        logger.log(Level.INFO,"Constant is :- {0}", Parent.NUM);    // Constant is :- 10
        Parent.greet();             // <--- As method in same class so No Need to use className to call method
        greet();                    // <--- As method in same class so No Need to use className to call method
        // ParentClass.good();         <-- Error - non-static method good() cannot be referenced from a static context

        Parent parent1 = new Parent();
        logger.log(Level.INFO, "Constant is :- {0}", Parent.NUM);   // Constant is :- 10
        parent1.NUM = 20;           // <--- Not Recommended
        logger.log(Level.INFO, "Constant is :- {0}", Parent.NUM);   // Constant is :- 20
        Parent.greet();     // Good Morning, From Parent Class
        parent1.good();     // Good By, Form Parent Class


        Parent parent2 = new Parent();
        logger.log(Level.INFO, "Constant is :- {0}", Parent.NUM);   // Constant is :- 20
        parent2.NUM = 30;           // <--- Not Recommended
        logger.log(Level.INFO, "Constant is :- {0}", Parent.NUM);   // Constant is :- 30
        Parent.greet();     // Good Morning, From Parent Class
        parent2.good();     // Good By, Form Parent Class


    }
}

// ------------------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------------------

package Static;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Parent {
    protected static final Logger logger = Logger.getLogger(Parent.class.getName());

    public static final int NUM = 10;

    public static void greet() {
        logger.info("Good Morning");
    }

    public void good() {
        logger.info("Goof Bye");
    }

    public static void main(String[] args) {
        logger.log(Level.INFO,"Constant is :- {0}", Parent.NUM);
        Parent.greet();      // <--- As method in same class so need to user className to call method
        greet();                  // <--- As method in same class so need to user className to call method
        // ParentClass.good();   <-- Error - non-static method good() cannot be referenced from a static context

        Parent parent = new Parent();
        logger.log(Level.INFO, "Constant is :- {0}", Parent.NUM);
        Parent.greet();
        parent.good();

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------------------

package Static;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Child extends Parent {
    protected static final Logger logger = Logger.getLogger(Child.class.getName());

    public static void greet() {
        logger.info("Good Morning");
    }

    public void good() {
        logger.info("Goof Bye");
    }

    public static void main(String[] args) {

        Child.greet();              // <--- As method in same class so need to user className to call method
        greet();                    // <--- As method in same class so need to user className to call method

        Child childClass = new Child();
        childClass.good();

        logger.log(Level.INFO,  "Constant is :- {0}", Parent.NUM);
        Parent.greet();
        // ParentClass.good();   <-- Error - non-static method good() cannot be referenced from a static context

        Parent parent = new Parent();
        parent.greet();
        parent.good();
        logger.info("Constant is :- " + parent.NUM);

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------------------
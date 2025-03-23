// ------------------------------------------------------------------------------------------------------------------------------------------------

package Static;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Child extends Parent {
    protected static final Logger logger = Logger.getLogger(Child.class.getName());

    public static void greet() {
        logger.info("Good Morning, From Child Class");
    }

    @Override
    public void good() {
        logger.info("Good By, From Child Class");
    }

    public static void main(String[] args) {

        Child childClass = new Child();
        Child.greet();    // Good Morning, Form Child Class <--- As method in Same Class, So No Need to use className to call method
        greet();          // Good Morning, From Child Class <--- As method in Same Class, So No Need to use className to call method
        childClass.good();      // Good By, From Child Class

        logger.log(Level.INFO,  "Constant is :- {0}", Parent.NUM);      // Constant is :- 10

        Parent parent = new Parent();
        parent.greet();     // Good Morning, From Parent CLass <--- As method in Different Class, So Need to use className or create instance to call method
        Parent.greet();     // Good Morning, From Parent CLass <--- As method in Different Class, So Need to use className or create instance to call method
        // Parent.good();   <-- Error - non-static method good() cannot be referenced from a static context
        parent.good();      // Good By, From Parent Class

        logger.info("Constant is :- " + parent.NUM);        // Constant is :- 10

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

import java.util.logging.Level;
import java.util.logging.Logger;

class Parent {
    
    protected static final Logger logger = Logger.getLogger(Parent.class.getName());

    int parentVariable;

    public void funcParents() {
        logger.info("Function - Child Class");
    }

    void getParentVariable() {
        logger.log(Level.INFO, "Value of parentVariable is :- {0}", this.parentVariable);
    }
}

class Child extends Parent {

    int childVariable;

    public void funcChild() {
        logger.info("Function - Child Class");
    }

    void getChildVariable() {
        logger.log(Level.INFO, "Value of childVariable is :- {0}", this.childVariable);
    }
}

public class InstanceOfOperator {
    
    protected static final Logger logger = Logger.getLogger(InstanceOfOperator.class.getName());
    
    public static void main(String[] args) {

        Parent p1 = new Parent();
        logger.info(String.valueOf(p1 instanceof Parent));       // true
        logger.info(String.valueOf(p1 instanceof Child));        // false

        Child c1 = new Child();
        logger.info(String.valueOf(c1 instanceof Parent));       // true
        logger.info(String.valueOf(c1 instanceof Child));        // true

        Parent p2 = new Child();
        logger.info(String.valueOf(p2 instanceof Parent));       // true
        logger.info(String.valueOf(p2 instanceof Child));        // true
        p2.parentVariable = 12;

        // Child c2 = new Child();       <----- Error

        Child c2 = (Child) p2;
        c2.getParentVariable();                       // Value of parentVariable is :- 12
        c2.parentVariable = 10;
        c2.childVariable = 20;
        c2.getParentVariable();                       // Value of parentVariable is :- 10
        c2.getChildVariable();                        // Value of childVariable is :- 20
        c2.funcParents();                             // Function - Child Class
        c2.funcChild();                               // Function - Child Class

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
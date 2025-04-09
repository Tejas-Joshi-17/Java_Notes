// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
 * 'instanceOf' Operator :-
 *         1) The instanceof keyword checks whether an object is an instance of a specific class or an interface.
 *         2) The instanceof keyword compares the instance with type. The return value is either true or false.
 */

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

import java.util.logging.Level;
import java.util.logging.Logger;

class Parent {
    
    protected static final Logger logger = Logger.getLogger(Parent.class.getName());

    int parentVariable;

    public void funcParents() {
        logger.info("Function - Parent Class");
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

        Parent parent1 = new Parent();
        logger.info(String.valueOf(parent1 instanceof Parent));       // true
        logger.info(String.valueOf(parent1 instanceof Child));        // false

        Child child1 = new Child();
        logger.info(String.valueOf(child1 instanceof Parent));        // true
        logger.info(String.valueOf(child1 instanceof Child));         // true

        Parent parent2 = new Child();
        logger.info(String.valueOf(parent2 instanceof Parent));       // true
        logger.info(String.valueOf(parent2 instanceof Child));        // true
        parent2.parentVariable = 12;

        // Child c2 = new Parent();       <----- Error

        Child child2 = (Child) parent2;
        child2.getParentVariable();                       // Value of parentVariable is :- 12
        child2.parentVariable = 10;
        child2.childVariable = 20;
        child2.getParentVariable();                       // Value of parentVariable is :- 10
        child2.getChildVariable();                        // Value of childVariable is :- 20
        child2.funcParents();                             // Function - Parent Class
        child2.funcChild();                               // Function - Child Class

    }
}

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
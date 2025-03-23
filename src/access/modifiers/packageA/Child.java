// ------------------------------------------------------------------------------------------------------------------------------------

package access.modifiers.packageA;

import java.util.logging.Logger;

public class Child extends Parent {

    protected static final Logger logger = Logger.getLogger(Child.class.getName());

    int defaultChildNumber;
    public int publicChildNumber;
    protected int protectedChildNumber;
    private int privateChildNumber;

    public static void main(String[] args) {

        Child child = new Child();            // Same Package Subclass
        child.defaultChildNumber = 10;
        child.publicChildNumber = 10;
        child.protectedChildNumber = 10;
        child.privateChildNumber = 10;

        child.defaultParentNumber = 20;
        child.publicParentNumber = 20;
        child.protectedParentNumber = 20;
        // child.privateParentNumber = 20;

        Parent parent = new Parent();           // Same Package Non-Subclass
        parent.defaultParentNumber = 30;
        parent.publicParentNumber = 30;
        parent.protectedParentNumber = 30;
        // parent.privateParentNumber = 30;

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
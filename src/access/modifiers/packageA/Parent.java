// ------------------------------------------------------------------------------------------------------------------------------------

package access.modifiers.packageA;

import java.util.logging.Logger;

public class Parent {
    protected static final Logger logger = Logger.getLogger(Parent.class.getName());

    int defaultParentNumber;
    public int publicParentNumber;
    protected int protectedParentNumber;
    private int privateParentNumber;

    public static void main(String[] args) {

        Parent parent = new Parent();           // Same Class Object
        parent.defaultParentNumber = 10;
        parent.publicParentNumber = 10;
        parent.protectedParentNumber = 10;
        parent.privateParentNumber = 10;

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
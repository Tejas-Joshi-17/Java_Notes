// ------------------------------------------------------------------------------------------------------------------------------------

package access.modifiers.packageB;

import access.modifiers.packageA.Parent;

import java.util.logging.Logger;

public class Other {

    protected static final Logger logger = Logger.getLogger(Other.class.getName());

    int defaultOtherNumber;
    public int publicOtherNumber;
    protected int protectedOtherNumber;
    private int privateOtherNumber;

    public static void main(String[] args) {

        Other other = new Other();              // Same Class Object
        other.defaultOtherNumber = 10;
        other.publicOtherNumber = 10;
        other.protectedOtherNumber = 10;
        other.privateOtherNumber = 10;

        Child child = new Child();              // Same Package Non-Subclass
        child.defaultChildNumber = 20;
        child.publicChildNumber = 20;
        child.protectedChildNumber = 20;
        // child.privateChildNumber = 20;
        // child.defaultParentNumber = 20;
        child.publicParentNumber = 20;
        // child.protectedParentNumber = 20;
        // child.privateParentNumber = 20;

        Parent parent = new Parent();             // Different Package Non-Subclass
        // parent.defaultParentNumber = 30;
        parent.publicParentNumber = 30;
        // parent.protectedParentNumber = 30;
        // parent.privateParentNumber = 30;

        access.modifiers.packageA.Child child1 = new access.modifiers.packageA.Child();
        // child1.defaultChildNumber = 40;       // Different Package Non-Subclass
        child1.publicChildNumber = 40;
        // child1.protectedChildNumber = 40;
        // child1.privateChildNumber = 40;
        // child1.defaultParentNumber = 40;
        child1.publicParentNumber = 40;
        // child1.protectedParentNumber = 40;
        // child1.privateParentNumber = 40;

    }

}

// ------------------------------------------------------------------------------------------------------------------------------------
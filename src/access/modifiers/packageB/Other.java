// ------------------------------------------------------------------------------------------------------------------------------------

package access.modifiers.packageB;

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

        Child child = new Child();              // Different Package Non-Subclass
        child.defaultChildNumber = 20;
        child.publicChildNumber = 20;
        child.protectedChildNumber = 20;
        // child.parentChildNumber = 20;
        // child.defaultParentNumber = 20;
        child.publicParentNumber = 20;
        // child.protectedParentNumber = 20;
        // child.privateParentNumber = 20;

    }

}

// ------------------------------------------------------------------------------------------------------------------------------------
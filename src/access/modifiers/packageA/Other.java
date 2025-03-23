package access.modifiers.packageA;

import java.util.logging.Logger;

public class Other {

    protected static final Logger logger = Logger.getLogger(Other.class.getName());

    int defaultOtherNumber;
    public int publicOtherNumber;
    protected int protectedOtherNumber;
    private int privateOtherNumber;

    public static void main(String[] args) {

        Other other = new Other();
        other.defaultOtherNumber = 10;
        other.publicOtherNumber = 10;
        other.protectedOtherNumber = 10;
        other.privateOtherNumber = 10;

        Parent parent = new Parent();
        parent.defaultParentNumber = 20;
        parent.publicParentNumber = 20;
        parent.protectedParentNumber = 20;
        // parent.privateParentNumber = 20;

        Child child = new Child();
        child.defaultChildNumber = 30;
        child.publicChildNumber = 30;
        child.protectedChildNumber = 30;
        // child.privateChildNumber = 30;

    }
}

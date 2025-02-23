package access.modifiers.packageB;

import access.modifiers.packageA.Parent;
import java.util.logging.Logger;

public class Child extends Parent {

    protected static final Logger logger = Logger.getLogger(Child.class.getName());

    int defaultChildNumber;
    public int publicChildNumber;
    protected int protectedChildNumber;
    private int privateChildNumber;

    public static void main(String[] args) {

        Child child = new Child();
        child.defaultChildNumber = 10;
        child.publicChildNumber = 10;
        child.protectedChildNumber = 10;
        child.privateChildNumber = 10;
        // child.defaultParentNumber = 20;
        child.publicParentNumber = 20;
        child.protectedParentNumber = 20;
        // child.privateParentNumber = 20;

        Parent parent = new Parent();
        // parent.defaultParentNumber = 10;
        parent.publicParentNumber = 10;
        // parent.protectedParentNumber = 10;
        // parent.privateParentNumber = 10;

    }

}

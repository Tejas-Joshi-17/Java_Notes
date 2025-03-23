package access.modifiers.packageA;

import java.util.logging.Logger;

public class Child extends Parent {

    protected static final Logger logger = Logger.getLogger(Child.class.getName());

    int defaultChildNumber;
    public int publicChildNumber;
    protected int protectedChildNumber;
    private int privateChildNumber;

    public static void main(String[] args) {

        Child child = new Child();
        child.defaultChildNumber = 30;
        child.publicChildNumber = 30;
        child.protectedChildNumber = 30;
        child.privateChildNumber = 30;
        child.defaultParentNumber = 10;
        child.publicParentNumber = 10;
        child.protectedParentNumber = 10;
        // child.privateParentNumber = 10;

        Parent parent = new Parent();
        parent.defaultParentNumber = 20;
        parent.publicParentNumber = 20;
        parent.protectedParentNumber = 20;
        // parent.privateParentNumber = 20;

    }
}
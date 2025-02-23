// ------------------------------------------------------------------------------------------------------------------------------------


package important.concepts;

import java.util.logging.Logger;

class ParentClass1 {
    
    protected static final Logger logger = Logger.getLogger(ParentClass1.class.getName());
    
    ParentClass1() {
        logger.info("Child Class with No. of Argument - 0");
    }

    ParentClass1(int a) {
        logger.info("Child Class with No. of Argument - 1");
    }

    ParentClass1(int a, int b) {
        logger.info("Child Class with No. of Argument - 2");
    }
}

public class ThisVsSuper extends ParentClass1 {
    
    ThisVsSuper() {
        logger.info("Self Class with No. of Argument - 0");
    }

    ThisVsSuper(int a) {
        super(a, 10);
        logger.info("Self Class with No. of Argument - 1");
    }

    ThisVsSuper(int a, int b) {
        logger.info("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {

        ThisVsSuper a = new ThisVsSuper();
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0

        ThisVsSuper b = new ThisVsSuper(10);
        // Child Class with No. of Argument - 2
        // Self Class with No. of Argument - 1

        ThisVsSuper c = new ThisVsSuper(10, 20);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 2

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class ParentClass2 {
    
    protected static final Logger logger = Logger.getLogger(ParentClass2.class.getName());
    
    ParentClass2() {
        logger.info("Child Class with No. of Argument - 0");
    }

    ParentClass2(int a) {
        logger.info("Child Class with No. of Argument - 1");
    }

    ParentClass2(int a, int b) {
        logger.info("Child Class with No. of Argument - 2");
    }
}

class ThisVsSuper1 extends ParentClass2 {
    ThisVsSuper1() {
        super();
        logger.info("Self Class with No. of Argument - 0");
    }

    ThisVsSuper1(int a) {
        this(a, 10);
        logger.info("Self Class with No. of Argument - 1");
    }

    ThisVsSuper1(int a, int b) {
        logger.info("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {

        ThisVsSuper1 a = new ThisVsSuper1();
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0

        ThisVsSuper1 b = new ThisVsSuper1(10);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 2
        // Self Class with No. of Argument - 1

        ThisVsSuper1 c = new ThisVsSuper1(10, 20);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 2

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class ParentClass3 {

    protected static final Logger logger = Logger.getLogger(ParentClass3.class.getName());
    
    ParentClass3() {
        logger.info("Child Class with No. of Argument - 0");
    }

    ParentClass3(int a) {
        logger.info("Child Class with No. of Argument - 1");
    }

    ParentClass3(int a, int b) {
        logger.info("Child Class with No. of Argument - 2");
    }
}

class ThisVsSuper3 extends ParentClass3 {
    ThisVsSuper3() {
        super();
        logger.info("Self Class with No. of Argument - 0");
    }

    ThisVsSuper3(int a) {
        this(a, 10);
        logger.info("Self Class with No. of Argument - 1");
    }

    ThisVsSuper3(int a, int b) {
        this();
        logger.info("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {

        ThisVsSuper3 a = new ThisVsSuper3();
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0

        ThisVsSuper3 b = new ThisVsSuper3(10);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0
        // Self Class with No. of Argument - 2
        // Self Class with No. of Argument - 1

        ThisVsSuper3 c = new ThisVsSuper3(10, 20);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0
        // Self Class with No. of Argument - 2

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class ParentClass4 {

    protected static final Logger logger = Logger.getLogger(ParentClass4.class.getName());
    
    ParentClass4() {
        logger.info("Child Class with No. of Argument - 0");
    }

    ParentClass4(int a) {
        logger.info("Child Class with No. of Argument - 1");
    }

    ParentClass4(int a, int b) {
        logger.info("Child Class with No. of Argument - 2");
    }
}

class ThisVsSuper4 extends ParentClass4 {
    ThisVsSuper4() {
        super();
        logger.info("Self Class with No. of Argument - 0");
    }

    ThisVsSuper4(int a) {
        // this(a, 10);        <-- Error - Recursive constructor invocation this_VS_super(int a, int b)
        logger.info("Self Class with No. of Argument - 1");
    }

    ThisVsSuper4(int a, int b) {
        this(20);           // Error - Recursive constructor invocation this_VS_super(int)
        logger.info("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {
        logger.info("This is Main Function of ThisVsSuper4 Class");
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class ParentClass5 {

    protected static final Logger logger = Logger.getLogger(ParentClass5.class.getName());
    
    ParentClass5() {
        logger.info("Child Class with No. of Argument - 0");
    }

    ParentClass5(int a) {
        logger.info("Child Class with No. of Argument - 1");
    }

    ParentClass5(int a, int b) {
        logger.info("Child Class with No. of Argument - 2");
    }
}

class ThisVsSuper5 extends ParentClass5 {
    ThisVsSuper5() {
        super();
        logger.info("Self Class with No. of Argument - 0");
    }

    ThisVsSuper5(int a) {
        // this(a, 10);     <-- Error - Constructor call must be the first statement in a constructor
        // super();         <-- Error - Constructor call must be the first statement in a constructor
        logger.info("Self Class with No. of Argument - 1");
    }

    ThisVsSuper5(int a, int b) {
        this();           // Error - Recursive constructor invocation this_VS_super(int)
        logger.info("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {
        logger.info("This is Main Function of ThisVsSuper5 Class");
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class ParentClass6 {

    protected static final Logger logger = Logger.getLogger(ParentClass6.class.getName());
    
    ParentClass6() {
        logger.info("Child Class with No. of Argument - 0");
    }

    ParentClass6(int a) {
        logger.info("Child Class with No. of Argument - 1");
    }

    ParentClass6(int a, int b) {
        logger.info("Child Class with No. of Argument - 2");
    }
}

class ThisVsSuper6 extends ParentClass6 {
    ThisVsSuper6() {
        super();
        logger.info("Self Class with No. of Argument - 0");
    }

    ThisVsSuper6(int a) {
        // super();         <-- Error - Constructor call must be the first statement in a constructor
        // this(a, 10);     <-- Error - Constructor call must be the first statement in a constructor
        logger.info("Self Class with No. of Argument - 1");
    }

    ThisVsSuper6(int a, int b) {
        this();           // Error - Recursive constructor invocation this_VS_super(int)
        logger.info("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {
        logger.info("This is Main Function of ThisVsSuper6 Class");
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
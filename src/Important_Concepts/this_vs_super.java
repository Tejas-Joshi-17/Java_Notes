// ------------------------------------------------------------------------------------------------------------------------------------


package Important_Concepts;

class Parent_Class_1 {
    Parent_Class_1() {
        System.out.println("Child Class with No. of Argument - 0");
    }

    Parent_Class_1(int a) {
        System.out.println("Child Class with No. of Argument - 1");
    }

    Parent_Class_1(int a, int b) {
        System.out.println("Child Class with No. of Argument - 2");
    }
}

public class this_vs_super extends Parent_Class_1 {
    this_vs_super() {
        System.out.println("Self Class with No. of Argument - 0");
    }

    this_vs_super(int a) {
        super(a, 10);
        System.out.println("Self Class with No. of Argument - 1");
    }

    this_vs_super(int a, int b) {
        System.out.println("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {

        this_vs_super a = new this_vs_super();
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0

        this_vs_super b = new this_vs_super(10);
        // Child Class with No. of Argument - 2
        // Self Class with No. of Argument - 1

        this_vs_super c = new this_vs_super(10, 20);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 2

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class Parent_Class_2 {
    Parent_Class_2() {
        System.out.println("Child Class with No. of Argument - 0");
    }

    Parent_Class_2(int a) {
        System.out.println("Child Class with No. of Argument - 1");
    }

    Parent_Class_2(int a, int b) {
        System.out.println("Child Class with No. of Argument - 2");
    }
}

class this_vs_super_1 extends Parent_Class_2 {
    this_vs_super_1() {
        super();
        System.out.println("Self Class with No. of Argument - 0");
    }

    this_vs_super_1(int a) {
        this(a, 10);
        System.out.println("Self Class with No. of Argument - 1");
    }

    this_vs_super_1(int a, int b) {
        System.out.println("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {

        this_vs_super_1 a = new this_vs_super_1();
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0

        this_vs_super_1 b = new this_vs_super_1(10);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 2
        // Self Class with No. of Argument - 1

        this_vs_super_1 c = new this_vs_super_1(10, 20);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 2

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class Parent_Class_3 {
    Parent_Class_3() {
        System.out.println("Child Class with No. of Argument - 0");
    }

    Parent_Class_3(int a) {
        System.out.println("Child Class with No. of Argument - 1");
    }

    Parent_Class_3(int a, int b) {
        System.out.println("Child Class with No. of Argument - 2");
    }
}

class this_vs_super_3 extends Parent_Class_3 {
    this_vs_super_3() {
        super();
        System.out.println("Self Class with No. of Argument - 0");
    }

    this_vs_super_3(int a) {
        this(a, 10);
        System.out.println("Self Class with No. of Argument - 1");
    }

    this_vs_super_3(int a, int b) {
        this();
        System.out.println("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {

        this_vs_super_3 a = new this_vs_super_3();
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0

        this_vs_super_3 b = new this_vs_super_3(10);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0
        // Self Class with No. of Argument - 2
        // Self Class with No. of Argument - 1

        this_vs_super_3 c = new this_vs_super_3(10, 20);
        // Child Class with No. of Argument - 0
        // Self Class with No. of Argument - 0
        // Self Class with No. of Argument - 2

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class Parent_Class_4 {
    Parent_Class_4() {
        System.out.println("Child Class with No. of Argument - 0");
    }

    Parent_Class_4(int a) {
        System.out.println("Child Class with No. of Argument - 1");
    }

    Parent_Class_4(int a, int b) {
        System.out.println("Child Class with No. of Argument - 2");
    }
}

class this_vs_super_4 extends Parent_Class_4 {
    this_vs_super_4() {
        super();
        System.out.println("Self Class with No. of Argument - 0");
    }

    this_vs_super_4(int a) {
        // this(a, 10);        <-- Error - Recursive constructor invocation this_VS_super(int a, int b)
        System.out.println("Self Class with No. of Argument - 1");
    }

    this_vs_super_4(int a, int b) {
        this(20);           // Error - Recursive constructor invocation this_VS_super(int)
        System.out.println("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class Parent_Class_5 {
    Parent_Class_5() {
        System.out.println("Child Class with No. of Argument - 0");
    }

    Parent_Class_5(int a) {
        System.out.println("Child Class with No. of Argument - 1");
    }

    Parent_Class_5(int a, int b) {
        System.out.println("Child Class with No. of Argument - 2");
    }
}

class this_vs_super_5 extends Parent_Class_5 {
    this_vs_super_5() {
        super();
        System.out.println("Self Class with No. of Argument - 0");
    }

    this_vs_super_5(int a) {
        // this(a, 10);     <-- Error - Constructor call must be the first statement in a constructor
        // super();         <-- Error - Constructor call must be the first statement in a constructor
        System.out.println("Self Class with No. of Argument - 1");
    }

    this_vs_super_5(int a, int b) {
        this();           // Error - Recursive constructor invocation this_VS_super(int)
        System.out.println("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------


class Parent_Class_6 {
    Parent_Class_6() {
        System.out.println("Child Class with No. of Argument - 0");
    }

    Parent_Class_6(int a) {
        System.out.println("Child Class with No. of Argument - 1");
    }

    Parent_Class_6(int a, int b) {
        System.out.println("Child Class with No. of Argument - 2");
    }
}

class this_vs_super_6 extends Parent_Class_6 {
    this_vs_super_6() {
        super();
        System.out.println("Self Class with No. of Argument - 0");
    }

    this_vs_super_6(int a) {
        // super();         <-- Error - Constructor call must be the first statement in a constructor
        // this(a, 10);     <-- Error - Constructor call must be the first statement in a constructor
        System.out.println("Self Class with No. of Argument - 1");
    }

    this_vs_super_6(int a, int b) {
        this();           // Error - Recursive constructor invocation this_VS_super(int)
        System.out.println("Self Class with No. of Argument - 2");
    }

    public static void main(String[] args) {

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
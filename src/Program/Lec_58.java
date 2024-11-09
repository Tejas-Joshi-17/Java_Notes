// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 58) Inherietnce in Interfaces :-

/*
 * 1) one Interface can extend more than one Interface.
 * 2) but One Class doesn't extend more than One Class.
 * 3) Class can implements more than one Interfaces at a time.
 * 4) When one Interface extends another Interface, all methods in another Interface is now also their in Interface extending it.
 */

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

interface Method_581 {
    void Hello();
}

interface Method_582 {
    void Hello();

    void Good();
}

// All Methods in Method_1 & Method_2 are also avaliable in Method_3
interface Method_583 extends Method_581, Method_582 {

}

interface Method_584 {
    default void Hello() {
        System.out.println("Hello Everyone");
    }

    ;
}

interface Method_585 {
    void Hello();

    void Good();
}

// All Methods in Method_1 & Method_2 are also avaliable in Method_3
// interface Method_586 extends Method_584, Method_585{
// Error - The default method Hello() inherited from Method_1 conflicts with another method inherited from Method_2
// }

interface method1 {
    void A1();

    void A2();
}

interface method2 extends method1 {
    // All the methods in method1 are also now in method2
    void B1();

    void B2();
}

class Apple58 implements method2 {
    void game() {
        System.out.println("Playing the GTA-Vice -5  ");
    }

    public void B1() {
        System.out.println("B1 of method2");
    }

    public void B2() {
        System.out.println("B2 of method2");
    }

    //  Get An Eroor because we don't implement all methods present in method2

    public void A1() {
        System.out.println("A1 of method1");
    }

    public void A2() {
        System.out.println("A2 of method1");
    }
}

public class Lec_58 {
    public static void main(String[] args) {

        Apple58 a = new Apple58();
        a.A1();                 // A1 of method1
        a.A2();                 // A2 of method1
        a.B1();                 // B1 of method2
        a.B2();                 // B2 of method2

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
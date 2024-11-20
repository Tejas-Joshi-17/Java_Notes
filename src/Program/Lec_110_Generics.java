// -------------------------------------------------------------------------------------------------------------------------

// 110) Generics in Java :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

import java.util.ArrayList;

class myGenericClass<T1, T2> {
    private final T1 a;
    private final T2 b;

    public myGenericClass(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public T1 getA() {
        return a;
    }

    public T2 getB() {
        return b;
    }
}

public class Lec_110_Generics {
    public static void main(String[] args) {

        // ----------------------------------------------------------------------------------------

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(10);
        arrayList1.add("Tejas Joshi");
        arrayList1.add(20);

        // Integer a = arrayList1.get(2);
        // Error - incompatible types: java.lang.Object cannot be converted to java.lang.Integer

        Integer b = (int) arrayList1.get(2);        // Return :- 20

        // ----------------------------------------------------------------------------------------

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(10);
        arrayList2.add(20);

        Integer c = (int) arrayList2.get(1);       // No Need to Type-Cast

        // ----------------------------------------------------------------------------------------

        myGenericClass<Integer, Object> myGenericClass1 = new myGenericClass<>(1, "Sachin Tendulkar");
        System.out.println(myGenericClass1.getA());      // Return :- 1
        System.out.println(myGenericClass1.getB());      // Return :- Sachin Tendulkar

        myGenericClass<Integer, Object> myGenericClass2 = new myGenericClass<>(2, true);
        System.out.println(myGenericClass2.getA());      // Return :- 2
        System.out.println(myGenericClass2.getB());      // Return :- true

        // ----------------------------------------------------------------------------------------

    }
}

// -------------------------------------------------------------------------------------------------------------------------

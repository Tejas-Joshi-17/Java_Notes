// ------------------------------------------------------------------------------------------------------------------------------------

package generics;

public class BoundedGenerics {

    public static void main(String[] args) {
        BoundedGenerics a = new BoundedGenerics();
        a.goodMorning(12);      // class is :- java.lang.Integer
        a.goodMorning(23.12);   // class is :- java.lang.Double

        Banana<Integer> b = new Banana<>();
        b.milk(23);
        // Value is :- 23
        // Class is :- java.lang.Integer

        Banana<Double> c = new Banana<>();
        c.milk(23.12);
        // Value is :- 23.12
        // Class is :- java.lang.Double

    }

    protected <T extends Number> void goodMorning(T num) {
        T e = num;
        System.out.println("class is :- " + e.getClass().getName());
    }

}


// ------------------------------------------------------------------------------------------------------------------------------------
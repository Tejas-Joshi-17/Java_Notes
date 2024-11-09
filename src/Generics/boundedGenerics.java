// ------------------------------------------------------------------------------------------------------------------------------------

package Generics;

public class boundedGenerics {

    public static void main(String[] args) {
        boundedGenerics a = new boundedGenerics();
        a.<Integer>Good_Morning(12);     // class is :- java.lang.Integer
        a.<Double>Good_Morning(23.12);   // class is :- java.lang.Double

        Banana<Integer> b = new Banana<Integer>();
        b.milk(23);
        // Value is :- 23
        // Class is :- java.lang.Integer

        Banana<Double> c = new Banana<Double>();
        c.milk(23.12);
        // Value is :- 23.12
        // Class is :- java.lang.Double

    }

    <E extends Number> void Good_Morning(E num) {
        E a = num;
        System.out.println("class is :- " + a.getClass().getName());
    }

}


// ------------------------------------------------------------------------------------------------------------------------------------
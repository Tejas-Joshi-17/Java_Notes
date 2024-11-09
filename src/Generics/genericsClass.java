// ------------------------------------------------------------------------------------------------------------------------------------

package Generics;

public class genericsClass {
    public static void main(String[] args) {

        Student<Integer, String> a = new Student<Integer, String>();
        a.setRoll_No(1);
        a.setName("Tejas Joshi");
        System.out.println("a's Roll_No is :- " + a.getRoll_No());   // a's Roll_No is :- 1
        System.out.println("a'Name  is :- " + a.getName());          // a's Name is :- Tejas Joshi

        Student<Double, Integer> b = new Student<Double, Integer>();
        b.setRoll_No(23.12);
        b.setName(11);
        System.out.println("b's Roll_No is :- " + b.getRoll_No());   // b's Roll_No is :- 23.12
        System.out.println("b'Name  is :- " + b.getName());          // b's Name is :- 11

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
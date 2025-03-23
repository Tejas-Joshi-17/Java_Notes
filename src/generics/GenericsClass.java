// ------------------------------------------------------------------------------------------------------------------------------------

package generics;

public class GenericsClass extends LoggingSupport<GenericClass> {

    public GenericsClass() {
        super(GenericClass.class);
    }

    public static void main(String[] args) {

        Student<Integer, String> a = new Student<Integer, String>();
        a.setRollNo(1);
        a.setName("Tejas Joshi");
        System.out.println("a's Roll_No is :- " + a.getRollNo());   // a's Roll_No is :- 1
        System.out.println("a'Name  is :- " + a.getName());          // a's Name is :- Tejas Joshi

        Student<Double, Integer> b = new Student<Double, Integer>();
        b.setRollNo(23.12);
        b.setName(11);
        System.out.println("b's Roll_No is :- " + b.getRollNo());   // b's Roll_No is :- 23.12
        System.out.println("b'Name  is :- " + b.getName());          // b's Name is :- 11

    }
}

//------------------------------------------------------------------------------------------------------------------------------------
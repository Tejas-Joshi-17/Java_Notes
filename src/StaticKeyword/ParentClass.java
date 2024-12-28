package StaticKeyword;

public class ParentClass {
    public static final int NUM = 10;

    public static void greet() {
        System.out.println("Good Morning");
    }

    public void good() {
        System.out.println("Goof Bye");
    }

    public static void main(String[] args) {
        System.out.println("Constant is :- " + ParentClass.NUM);
        ParentClass.greet();      // <--- As method in same class so need to user className to call method
        greet();                  // <--- As method in same class so need to user className to call method
        // ParentClass.good();   <-- Error - non-static method good() cannot be referenced from a static context

        ParentClass parentClass = new ParentClass();
        System.out.println("Constant is :- " + parentClass.NUM);
        parentClass.greet();
        parentClass.good();

    }
}

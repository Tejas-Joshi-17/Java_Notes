package Static;

public class ChildClass extends ParentClass {

    public static void greet() {
        System.out.println("Good Morning");
    }

    public void good() {
        System.out.println("Goof Bye");
    }

    public static void main(String[] args) {

        ChildClass.greet();         // <--- As method in same class so need to user className to call method
        greet();                    // <--- As method in same class so need to user className to call method

        ChildClass childClass = new ChildClass();
        childClass.good();

        System.out.println("Constant is :-" + ParentClass.NUM);
        ParentClass.greet();
        // ParentClass.good();   <-- Error - non-static method good() cannot be referenced from a static context

        ParentClass parentClass = new ParentClass();
        parentClass.greet();
        parentClass.good();
        System.out.println("Constant is :- " + parentClass.NUM);

    }
}

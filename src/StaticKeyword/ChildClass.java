package StaticKeyword;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {

        System.out.println("Constant is :-" + ParentClass.NUM);
        ParentClass.greet();
        // ParentClass.good();   <-- Error - non-static method good() cannot be referenced from a static context

        ParentClass parentClass = new ParentClass();
        parentClass.greet();
        parentClass.good();
        System.out.println("Constant is :- " + parentClass.NUM);

    }
}

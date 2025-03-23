package staticKeyword;


import java.util.logging.Logger;

public class ParentClass {
    private static final Logger logger = Logger.getLogger(ParentClass.class.getName());

    public static final int NUM = 10;

    public static void greet() {
        logger.info("Good Morning");
    }

    public void good() {
        logger.info("Goof Bye");
    }

    public static void main(String[] args) {
        logger.info("Constant is :- " + ParentClass.NUM);
        ParentClass.greet();      // <--- As method in same class so need to user className to call method
        greet();                  // <--- As method in same class so need to user className to call method
        // ParentClass.good();   <-- Error - non-static method good() cannot be referenced from a static context

        ParentClass parentClass = new ParentClass();
        logger.info("Constant is :- " + parentClass.NUM);
        parentClass.greet();
        parentClass.good();

    }
}

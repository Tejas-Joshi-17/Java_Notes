// ----------------------------------------------------------------------------------------------------------------------------------------

// 108) Annotations in Java :-

// ----------------------------------------------------------------------------------------------------------------------------------------


package Program;

@FunctionalInterface            // Make Sure that interface contains only & only one abstract class
interface Animal {
    void walk();
}

class Phone {
    public void Call() {
        System.out.println("Calling from Phone");
    }

    @Deprecated                 // Show Warnings on Using
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

class SmartPhone extends Phone {
    @Override               // Shows that method is Override
    public void Call() {
        System.out.println("Calling from SmartPhone");
    }
}

public class Lec_108_AnnotationsInJava {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.Call();
        // Calling from SmartPhone

        Phone phone = new Phone();
        phone.sendMessage();            // Shows Warning if SuppressWarning is not used
        // If used No Warning Shows

    }
}


// ----------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 49) Dynamic Method Dispatch

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Phone491 {
    public void Ringing() {
        System.out.println("Phone Ringing");
    }

    public void Photos() {
        System.out.println("Photos taken from Phone");
    }
}

class Smart_Phone491 extends Phone491 {
    public void WhatsApp() {
        System.out.println("WhatsApp using in SmartPhone");
    }

    public void Facebook() {
        System.out.println("Facebook using in SmartPhone");
    }
}

public class Lec_49 {
    public static void main(String[] args) {

        Phone491 a = new Phone491();       // Phone को Phone बोल रहे है.
        a.Ringing();                       // Phone Ringing
        a.Photos();                        // Photos taken from Phone
        // a.WhatsApp();                   <-- The method WhatsApp() is undefined for the type Phone
        // a.Facebook();                   <-- The method Facebook() is undefined for the type Phone

        Smart_Phone491 b = new Smart_Phone491();      // Smartphone को Smartphone बोल रहे है.
        b.Ringing();                                  // Phone Ringing
        b.Photos();                                   // Photos taken from Phone
        b.WhatsApp();                                 // WhatsApp using in SmartPhone
        b.Facebook();                                 // Facebook using in SmartPhone

        Phone491 c = new Smart_Phone491();    // Smartphone को Phone बोल रहे है.
        c.Ringing();                          // Phone Ringing
        c.Photos();                           // Photos taken from Phone
        // c.WhatsApp();                <-- The method WhatsApp() is undefined for the type Phone
        // c.Facebook();                <-- The method Facebook() is undefined for the type Phone

        // Smart_Phone a = new Phone();    <---- Error  Phone को Smartphone बोल रहे है.

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
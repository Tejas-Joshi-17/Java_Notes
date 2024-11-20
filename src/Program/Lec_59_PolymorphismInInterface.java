// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 59) Polymorphism in Interfaces :-

/*
 * 1) We can create Reference of Abstract Class = Object of Concrete Class
 *    Abstract_Class obj1 = new Concrete_Class();
 *
 * 2) we can create Reference of Interface = Object of Concrete Class
 *    Interface obj2 = new Concrete_Class();
 *
 * 3) We can't create Reference of Concrete_Class = Object of Abstract_Class
 *    Concrete_Class obj3 = new Abstract_Class();
 *
 * 4) We can't create Reference of Interface = Object of Concrete Class
 *    Concrete_Class obj4 = new Interface();
 *
 * 5) We can't create Object of Abstract Class in Java.
 * 6) we can't create Object of Interface in Java.
 * 7) We can create Object of Concrete Class in Java.
 *
 */

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

interface GPS591 {
    public void Connecting_Satelite(String satelite);

    default public void Find_Road() {
        System.out.println("Finding Shortest Path (Interface)");
    }
}

interface Camera591 {
    public void Clicking_Photos();

    default public void Editing_Photos() {
        System.out.println("Deleting Photos in Camera (Interface)");
    }
}

interface Media_Player591 {
    default public void Playing_Song(String[] song) {
        System.out.println("Playing Song :- ");
        for (int i = 0; i < song.length; i++)
            System.out.println((i + 1) + ") " + song[i]);
    }

    public void Deleting_Song();
}

abstract class CellPhone591 {
    public void Call_Number(int num) {
        System.out.println("Calling the Number - (Abstract Class) " + num);
    }

    abstract public void Delete_Number(int num);
}

class SmartPhone591 extends CellPhone591 implements GPS591, Camera591, Media_Player591 {
    @Override
    public void Call_Number(int num) {
        System.out.println("Calling the Number - " + num);
    }

    public void Delete_Number(int num) {
        System.out.println("Deleting the Number - " + num);
    }

    ;

    public void Connecting_Satelite(String satelite) {
        System.out.println("Connecting to Satelite - " + satelite);
    }

    ;

    public void Clicking_Photos() {
        System.out.println("Clicking the Photos from Camera");
    }

    ;

    public void Editing_Photos() {
        System.out.println("Deleting Photos in Camera ");
    }

    public void Deleting_Song() {
        System.out.println("Deleting Song from in Media Player");
    }



    public void WhatsApp() {
        System.out.println("Seeing WhatsApp Message in SmartPhone");
    }
}

public class Lec_59_PolymorphismInInterface {
    public static void main(String[] args) {

        // Abstract Class   :-  CellPhone591
        // Interface        :-  GPS591, Camera591, Media_Player591
        // Concrete Class  :-  SmartPhone591
        // SmartPhone591 extends CellPhone implements GPS591, Camera591, Media_Player591 {

        // We can create Reference of Abstract Class = Object of Concreate Class
        CellPhone591 a = new SmartPhone591();
        a.Call_Number(1234);                           // Calling the Number - 8485
        a.Delete_Number(1234);                         // Deleting the Number - 8485

        // we can create Reference of Interface = Object of Concreate Class
        GPS591 b = new SmartPhone591();
        b.Connecting_Satelite("NASA");               // Connecting to Satelite - NASA
        b.Find_Road();                                  // Finding Shortest Path (Interface)

        // we can create Reference of Interface = Object of Concreate Class
        Camera591 c = new SmartPhone591();
        c.Clicking_Photos();                            // Clicking the Photos from Camera
        c.Editing_Photos();                             // Deleting Photos in Camera

        // we can create Reference of Interface = Object of Concreate Class
        Media_Player591 d = new SmartPhone591();
        String[] Songs = {"America", "India", "Japan", "Austrila"};
        d.Playing_Song(Songs);
        // Playing Song :-
        // 1) America
        // 2) India
        // 3) Japan
        // 4) Austrila

        d.Deleting_Song();                               // Deleting Song from in Media Player


        SmartPhone591 e = new SmartPhone591();
        e.Call_Number(8485);                         // Calling the Number - 8485
        e.Delete_Number(8485);                       // Deleting the Number - 8485
        e.Connecting_Satelite("ISRO");             // Connecting to Satelite - ISRO
        e.Find_Road();                                // Finding Shortest Path (Interface)
        e.Clicking_Photos();                          // Clicking the Photos from Camera
        e.Editing_Photos();                           // Deleting Photos in Camera

        String[] Song = {"America", "India", "Japan", "Austrila"};
        e.Playing_Song(Song);
        // Playing Song :-
        // 1) America
        // 2) India
        // 3) Japan
        // 4) Austrila

        e.Deleting_Song();                        // Deleting Song from in Media Player
        e.WhatsApp();                             // Seeing WhatsApp Message in SmartPhone

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
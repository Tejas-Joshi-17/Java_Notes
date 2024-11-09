// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 57) Default Method in Java :-

/*
 * 1) An Interface can have static and default methods.
 * 2) Default methods enable us to add new functionality to existing Interface.
 * 3) deafult Method is used for our conveience, We can define default method at time of declaration in Interface.
 * 4) If Class implementing Interface, Not override default method present in Interface, Whatever their in Interface is implemented.
 * 5) If Class implementing Interface, Override default method present in Interface then whatever their in Class is implemened.
 */

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

interface Camera571 {
    void takeSnap();

    void recordVideo();

    default void Deletephoto() {
        System.out.println("Deleting the photos in Interface....!");
    }
}


interface WiFi571 {
    String[] getNetWork();

    void connectNetWork(String NetWork);
}

class CellPhone571 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling.. " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting.. ");
    }
}

class SmartPhone571 extends CellPhone571 implements Camera571, WiFi571 {

    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    public void recordVideo() {
        System.out.println("Recording Videos ....!");
    }

    public String[] getNetWork() {
        System.out.println("Getting ListInterface of Networks");
        String[] networklist = {"Harry", "Tejas", "India"};
        return networklist;
    }

    public void connectNetWork(String NetWork) {
        System.out.println("Connecting to ... " + NetWork);
    }
}

class SmartPhone572 extends CellPhone571 implements Camera571, WiFi571 {
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    public void recordVideo() {
        System.out.println("Recording Videos ....!");
    }

    @Override           // Overriding Default Method in Interface
    public void Deletephoto() {
        System.out.println("Deleting the Photos in main class");
    }

    public String[] getNetWork() {
        System.out.println("Getting ListInterface of Networks");
        String[] networklist = {"Harry", "Tejas", "India"};
        return networklist;
    }

    public void connectNetWork(String NetWork) {
        System.out.println("Connecting to ... " + NetWork);
    }
}

public class Lec_57 {
    public static void main(String[] args) {

        // Interface :-  Camera571, Wifi571
        // Class     :-  CellPhone571
        // Class     :-  SmartPhone571 extends CellPhone571 implements Camera571, Wifi571

        SmartPhone571 p = new SmartPhone571();

        String[] arr1 = p.getNetWork();             // Getting ListInterface of Networks
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");        // Harry Tejas India Taking Snap...
        }
        System.out.println();

        p.takeSnap();                               // Taking Snap...
        p.recordVideo();                            // Recording Videos ....!
        p.connectNetWork("VijayThirth");            // Connecting to ... VijayThirth

        p.callNumber(8585);             // Calling.. 8585    <---- from Parent Class
        p.pickCall();                               // Connecting..      <---- from Parent Class

        p.Deletephoto();                            // Deleting the photos in Interface....!
        // <--- Default Mathod Runs


        // Interface :-  Camera571, Wifi571
        // Class     :-  CellPhone571
        // Class     :-  SmartPhone572 extends CellPhone571 implements Camera571, Wifi571

        SmartPhone572 q = new SmartPhone572();

        String[] arr2 = q.getNetWork();            // Getting ListInterface of Networks
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");       // Harry Tejas India Taking Snap...
        }
        System.out.println();

        q.takeSnap();                             // Taking Snap...
        q.recordVideo();                          // Recording Videos ....!
        q.connectNetWork("VijayThirth");          // Connecting to ... VijayThirth

        q.callNumber(8585);           // Calling.. 8585    <---- from Parent Class
        q.pickCall();                             // Connecting..      <---- from Parent Class

        q.Deletephoto();                          // Deleting the Photos in main class

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
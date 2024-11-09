// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.TryCatch;

public class try_catch_4 {

    public static void fourthTryCatch() {
        int[] array_4 = new int[5];

        System.out.println("Starting the Program");
        try {
            System.out.println("Good Morning Apple");
            array_4[7] = 56;
            System.out.println("Good Night Apple");
        } catch (Exception e) {
            System.out.println("OutOfBound Exception Occurred");
        }

        System.out.println("Starting the Program");
    }

    public static void main(String[] args) {
        fourthTryCatch();
        //  Starting the Program
        //  Good Morning Apple
        //  OutOfBound Exception Occurred
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
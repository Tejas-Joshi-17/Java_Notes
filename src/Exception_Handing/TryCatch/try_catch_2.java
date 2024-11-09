// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.TryCatch;

public class try_catch_2 {

    public static void secondTryCatch() {
        int[] array_2 = new int[5];

        System.out.println("Starting the Program");
        try {
            array_2[7] = 56;
        } catch (Exception e) {
            System.out.println("OutOfBound Exception Occurred");
        }

        System.out.println("Starting the Program");
    }

    public static void main(String[] args) {
        secondTryCatch();
        //  Starting the Program
        //  OutOfBound Exception Occurred
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
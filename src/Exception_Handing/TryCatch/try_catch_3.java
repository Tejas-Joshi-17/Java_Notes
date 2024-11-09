// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.TryCatch;

public class try_catch_3 {

    public static void thirdTryCatch() {
        int[] array_3 = new int[5];

        System.out.println("Starting the Program");
        try {
            array_3[7] = 56;
            System.out.println("Good Morning Apple");
        } catch (Exception e) {
            System.out.println("OutOfBound Exception Occurred");
        }

        System.out.println("Starting the Program");
    }

    public static void main(String[] args) {
        thirdTryCatch();
        //  Starting the Program
        //  OutOfBound Exception Occurred
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
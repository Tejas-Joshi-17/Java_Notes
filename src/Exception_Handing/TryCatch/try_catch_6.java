// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.TryCatch;

public class try_catch_6 {

    public static void sixthTryCatch() {
        int[] array_6 = new int[5];

        System.out.println("Starting the Program");
        try {
            System.out.println("Good Morning Apple");
            array_6[7] = 56;
            System.out.println("Good Night Apple");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Handing NullPointerException & ArrayOurOfBoundException & ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Handling all kinds of Exception");
        }

        System.out.println("Starting the Program");
    }

    public static void main(String[] args) {
        sixthTryCatch();
        //  Starting the Program
        //  Good Morning Apple
        //  Handing NullPointerException & ArrayOurOfBoundException & ArithmeticException
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
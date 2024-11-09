// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.TryCatch;

public class try_catch_5 {

    public static void fifthTryCatch() {
        int[] array_5 = new int[5];

        System.out.println("Starting the Program");
        try {
            System.out.println("Good Morning Apple");
            array_5[7] = 56;
            System.out.println("Good Night Apple");
        } catch (NullPointerException e) {
            System.out.println("Handing NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handling ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Handling all kinds of Exception");
        }

        System.out.println("Starting the Program");
    }

    public static void main(String[] args) {
        fifthTryCatch();
        //  Starting the Program
        //  Good Morning Apple
        //  Handling ArrayIndexOutOfBoundsException
        //  Starting the Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
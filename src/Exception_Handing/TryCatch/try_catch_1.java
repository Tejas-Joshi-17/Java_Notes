// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.TryCatch;

public class try_catch_1 {

    public static void firstTryCatch() {
        int[] array_1 = new int[5];

        System.out.println("Starting the Program");

        array_1[7] = 56;

        System.out.println("Starting the Program");
    }

    public static void main(String[] args) {
        firstTryCatch();
        //  Starting the Program
        //  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.throwAndThrows;

public class throw_and_throws_2 {

    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            System.out.println("e => " + e.getMessage());
        }
        // e => Trying to divide by 0

        int arr[] = new int[50];
        try {
            arr[100] = 23232;
        } catch (Exception e) {
            System.out.println("e => " + e.getMessage());
        }
        // e => 100
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
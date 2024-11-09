// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.throwAndThrows;

public class throw_and_throws_3 {

    public static void divideByZero() throws ArithmeticException {
        int a = 30 / 0;
    }

    public static void main(String[] args) {
        System.out.println("Starting Program");

        try {
            divideByZero();
        } catch (Exception e) {
            System.out.println("Exception Occurs :- " + e.getMessage());
        }

        System.out.print("Ending Program");
        // Starting Program
        // Exception Occurs :- / by zero
        // Ending Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
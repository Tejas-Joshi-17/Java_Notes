// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.throwAndThrows;

public class throw_and_throws_1 {

    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
        // Exception in thread "main" java.lang.ArithmeticException: Trying to divide by 0
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
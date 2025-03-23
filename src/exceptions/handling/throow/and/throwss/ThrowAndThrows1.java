// ------------------------------------------------------------------------------------------------------------------------------------

package exceptions.handling.throow.and.throwss;

public class ThrowAndThrows1 {

    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
        // Exception in thread "main" java.lang.ArithmeticException: Trying to divide by 0
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
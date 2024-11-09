// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.FinallyBlock;

public class finally_block_3 {

    public static void thirdFinallyBlock() {
        System.out.println("Staring Program");
        try {
            int a = 34 / 23;
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            int sum = 100 / 0;
            System.out.println("Hello from finally Block");
        }
        System.out.println("Ending Program");
    }

    public static void main(String[] args) {
        thirdFinallyBlock();
        // Staring Program
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
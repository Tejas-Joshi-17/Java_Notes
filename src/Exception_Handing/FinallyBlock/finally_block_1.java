// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.FinallyBlock;

public class finally_block_1 {

    public static void firstFinallyBlock() {
        System.out.println("Staring Program");
        try {
            int a = 34 / 0;
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Hello from finally Block");
        }
        System.out.println("Ending Program");
    }

    public static void main(String[] args) {
        firstFinallyBlock();
        // Starting Program
        // java.lang.ArithmeticException: / by zero
        // Hello from finally Block
        // Ending Program
    }

}

// ------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.FinallyBlock;

public class finally_block_4 {

    public static void fourthFinallyBlock() {
        System.out.println("Staring Program");
        try {
            int a = 34 / 0;
        } catch (Exception e) {
            System.out.println("Handling Exception");
            System.exit(1);
        } finally {
            System.out.println("Hello from finally Block");
        }
        System.out.println("Ending Program");
    }

    public static void main(String[] args) {
        fourthFinallyBlock();
        // Staring Program
        // Handling Exception
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
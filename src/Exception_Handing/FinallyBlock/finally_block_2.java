// ------------------------------------------------------------------------------------------------------------------------------------

package Exception_Handing.FinallyBlock;

public class finally_block_2 {

    public static void secondFinallyBlock() {
        System.out.println("Staring Program");
        try {
            int a = 34 / 2;
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Hello from finally Block");
        }
        System.out.println("Ending Program");
    }

    public static void main(String[] args) {
        secondFinallyBlock();
        // Starting Program
        // Hello from finally Block
        // Ending Program
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
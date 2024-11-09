// ------------------------------------------------------------------------------------------------------------------------------------


package Important_Concepts;

public class Static_Block {

    // Static Block        <------ Execute Only once when '.class' File Executed.
    static {
        System.out.println("This is Static Block");
    }

    // Instance Block      <------ Runs Everytime when object Creation Starts
    {
        System.out.println("This is Instance Block");
    }

    // Constructor        <------ Runs Everytime when object Created.
    Static_Block() {
        System.out.println("This is Constructor");
    }

    public static void main(String[] args) {

        System.out.println("This is Main Function");
        Static_Block s1 = new Static_Block();
        Static_Block s2 = new Static_Block();
        Static_Block s3 = new Static_Block();
        // This is Static Block
        // This is Main Function
        // This is Instance Block
        // This is Constructor
        // This is Instance Block
        // This is Constructor
        // This is Instance Block
        // This is Constructor


        Static_Block p1 = new Static_Block();
        Static_Block p2 = new Static_Block();
        Static_Block p3 = new Static_Block();
        System.out.println("This is Main Function");
        // This is Static Block
        // This is Instance Block
        // This is Constructor
        // This is Instance Block
        // This is Constructor
        // This is Instance Block
        // This is Constructor
        // This is Main Function

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
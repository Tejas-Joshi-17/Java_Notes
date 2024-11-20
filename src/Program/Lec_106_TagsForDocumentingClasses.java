// -------------------------------------------------------------------------------------------------------------------------

// 106) Tags for Documenting Classes :-

// -------------------------------------------------------------------------------------------------------------------------


package Program;

/**
 * <i>This is a simple documentation to show that HTML elements can be included in JavaDoc.</i>
 *
 * @author Tejas Joshi
 * @version 1.0
 * @see <a href="https://www.codewithharry.com/videos/java-tutorials-for-beginners-1">Best Java Course Available For <b>Free</b></a>
 * @since 2024
 */
public class Lec_106_TagsForDocumentingClasses {

    /**
     * This method is used to return the divison of two numbers
     *
     * @param a First parameter -  Integer
     * @param b Second parameter - Integer
     * @return Integer
     * @throws ArithmeticException if divided by 0
     */
    public static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int ans = division(10, 2);
        System.out.println("Division is :- " + ans);
        System.out.println("This is my Main method");
        // Division is :- 5
        // This is my Main method
    }
}

// -------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------------

package generics;

import java.util.logging.Level;

public class GenericMethod extends Apple<String> {
    public static void main(String[] args) {

        Apple<String> b = new Apple<>();

        b.goodMorning("Tejas Joshi");
        // Good Morning :- Tejas Joshi

        int ans = b.goodNight(17);
        new GenericMethod().logger.log(Level.INFO, "answer is :- {}" , ans);
        // answer is :- 23

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
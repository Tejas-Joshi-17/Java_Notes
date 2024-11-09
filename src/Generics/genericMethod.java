// ------------------------------------------------------------------------------------------------------------------------------------

package Generics;

public class genericMethod {
    public static void main(String[] args) {

        Apple b = new Apple();

        b.<String>Good_Morning("Tejas Joshi");
        // Good Morning :- Tejas Joshi

        int ans = b.<Integer>Good_Night(17);
        System.out.println("answer is :- " + ans);
        // answer is :- 23

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
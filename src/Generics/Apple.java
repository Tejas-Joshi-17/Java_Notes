// ------------------------------------------------------------------------------------------------------------------------------------

package Generics;

class Apple {
    public <T> void Good_Morning(T data) {
        System.out.println("Good Morning :- " + data);
    }

    public <K> int Good_Night(K data) {
        return 23;
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
package collectionFramework.List;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {

        ArrayList<String> m1 = new ArrayList<>();
        ArrayList<Object> m2 = new ArrayList<>();

        m1.add("Aakash");
        m1.add("Bhushan");
        System.out.println(m1.getClass());
        System.out.println(m1.get(1));

        m2.add("Tejas Joshi");
        m2.add(12);
        System.out.println(m2);

    }
}

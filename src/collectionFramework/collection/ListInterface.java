package collectionFramework.collection;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // 1) add(Object o)    :-  add Object at the end
        list.add(10);          // list = [10]
        list.add(20);          // list = [10, 20]
        list.add(10);          // list = [10, 20, 10]

        System.out.println(list);

        ArrayDeque<Integer> j = new ArrayDeque<>();

    }
}

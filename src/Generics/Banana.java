package Generics;

public class Banana<T extends Number> {
    private T number;

    public T milk(T num) {
        this.number = num;
        System.out.println("Value is :- " + number);
        System.out.println("class is :- " + number.getClass().getName());
        return this.number;
    }
}

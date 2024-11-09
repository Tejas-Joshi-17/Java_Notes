// ------------------------------------------------------------------------------------------------------------------------------------

package Generics;

public class Student<T, K> {
    private T Roll_No;
    private K Name;

    public T getRoll_No() {
        return this.Roll_No;
    }

    public void setRoll_No(T Roll_No) {
        this.Roll_No = Roll_No;
    }

    public K getName() {
        return this.Name;
    }

    public void setName(K Name) {
        this.Name = Name;
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
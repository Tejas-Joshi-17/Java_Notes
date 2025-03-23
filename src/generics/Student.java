// ------------------------------------------------------------------------------------------------------------------------------------

package generics;

public class Student<T, K> {
    private T rollNo;
    private K name;

    public T getRollNo() {
        return this.rollNo;
    }

    public void setRollNo(T rollNo) {
        this.rollNo = rollNo;
    }

    public K getName() {
        return this.name;
    }

    public void setName(K name) {
        this.name = name;
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
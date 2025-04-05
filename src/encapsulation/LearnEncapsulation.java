// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package encapsulation;

import java.util.logging.Level;
import java.util.logging.Logger;


class Person {
    private int age;

    boolean canBeChanged = true;
    boolean canBeAccessed = false;

    public void setAge(int age) {
        if(canBeChanged) {
            this.age = age;
        }
    }

    public int getAge() {
        if(canBeAccessed && age > 0) {
            return this.age;
        }
        return -1;
    }

}


public class LearnEncapsulation {

    protected static final Logger logger = Logger.getLogger(LearnEncapsulation.class.getName());

    public static void main(String[] args) {

        Person person1 = new Person();
        // person.age = 10;      <----- 'age' has private access in 'encapsulation.Person'
        person1.setAge(10);

        logger.log(Level.INFO, "Person-1 Age is :- {0}", person1.getAge());
        // Person-1 Age is :- -1

        Person person2 = new Person();
        // person2.age = -45;      <----- 'age' has private access in 'encapsulation.Person'
        person2.setAge(-45);

        logger.log(Level.INFO, "Person-2 Age is :- {0}", person2.getAge());
        // Person-2 Age is :- -1

    }
}

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
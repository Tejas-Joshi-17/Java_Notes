// ------------------------------------------------------------------------------------------------------------------------------------

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
        if(canBeAccessed) {
            return this.age;
        }
        return -1;
    }

}


public class LearnEncapsulation {

    protected static final Logger logger = Logger.getLogger(LearnEncapsulation.class.getName());

    public static void main(String[] args) {

        Person person = new Person();
        // person.age = 10;
        person.setAge(10);

        logger.log(Level.INFO, "Person Age is :- {0}", person.getAge());
        // Person Age is :- -1
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------
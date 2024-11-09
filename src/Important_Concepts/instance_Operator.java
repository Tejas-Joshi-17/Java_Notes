// ------------------------------------------------------------------------------------------------------------------------------------


package Important_Concepts;

class Parent {

    int variable_Parent;

    public void func_Parents() {
        System.out.println("Function - Parent Class");
    }

    void get_variable_Parent() {
        System.out.println("Value of variable_Parent is :- " + this.variable_Parent);
    }
}

class Child extends Parent {

    int variable_Child;

    public void func_Child() {
        System.out.println("Function - Child Class");
    }

    void get_variable_Child() {
        System.out.println("Value of variable_Child is :- " + this.variable_Child);
    }
}

public class instance_Operator {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        System.out.println(p1 instanceof Parent);       // true
        System.out.println(p1 instanceof Child);        // false

        Parent p2 = new Child();
        System.out.println(p2 instanceof Parent);       // true
        System.out.println(p2 instanceof Child);        // true
        p2.variable_Parent = 12;

        Child c1 = new Child();
        System.out.println(c1 instanceof Parent);       // true
        System.out.println(c1 instanceof Child);        // true

        // Child c2 = new Parent();       <----- Error

        Child c2 = (Child) p2;
        c2.get_variable_Parent();                       // Value of variable_Parent is :- 12
        c2.variable_Parent = 10;
        c2.variable_Child = 20;
        c2.get_variable_Parent();                       // Value of variable_Parent is :- 10
        c2.get_variable_Child();                        // Value of variable_Child is :- 20
        c2.func_Parents();                              // Function - Parent Class
        c2.func_Child();                                // Function - Child Class

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------
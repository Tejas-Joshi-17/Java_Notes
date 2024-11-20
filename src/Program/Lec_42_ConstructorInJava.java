// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 42) Constructor & Its Overloading

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Employee42 {
    int Id;
    String Name;

    public Employee42() {
        this.Id = 1;
        this.Name = "Aakash";
    }

    public Employee42(int Id) {
        this.Id = Id;
    }

    public Employee42(String Name) {
        this.Name = Name;
    }

    public Employee42(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public void Set_ID(int id) {
        this.Id = id;
    }

    public void Set_Name(String name) {
        this.Name = name;
    }

    public int Get_ID() {
        return this.Id;
    }

    public String Get_Name() {
        return this.Name;
    }
}

public class Lec_42_ConstructorInJava {
    public static void main(String[] args) {

        Employee42 a = new Employee42();
        System.out.println("ID of Employee-a is :- " + a.Id);           // Id of Employee-a is :- 1
        System.out.println("Name of Employee-a is :- " + a.Name);       // Name of Employee-a is :- Aakash

        Employee42 b = new Employee42(10);
        System.out.println("ID of Employee-b is :- " + b.Id);           // Id of Employee-b is :- 10
        System.out.println("Name of Employee-b is :- " + b.Name);       // Name of Employee-b is :- null

        Employee42 c = new Employee42("Kohli");
        System.out.println("ID of Employee-c is :- " + c.Id);           // Id of Employee-c is :- 0
        System.out.println("Name of Employee-c is :- " + c.Name);       // Name of Employee-c is :- Kohli

        Employee42 d = new Employee42(45, "Rohit");
        System.out.println("ID of Employee-d is :- " + d.Id);           // Id of Employee-d is :- 45
        System.out.println("Name of Employee-d is :- " + d.Name);       // Name of Employee-d is :- Rohit

        Employee42 e = new Employee42();
        e.Set_ID(99);
        e.Set_Name("Vikrant");
        System.out.println("ID of Employee-e is :- " + e.Id);           // Id of Employee-e is :- 99
        System.out.println("Name of Employee-e is :- " + e.Name);       // Name of Employee-e is :- Vikrant

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
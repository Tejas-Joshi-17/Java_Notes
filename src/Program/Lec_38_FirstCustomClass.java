// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 38) OOP's First Custom Class

// -- 1) एक program मै सिर्फ एकही class public हो सकता है.
// -- 2) public class name should be equal to File_Name.java

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Employee38 {
    int Id;
    String Name;
    int Salary;

    public void Print_Details() {                               // Create Method of the class
        System.out.println("Hi My Name is :- " + this.Name);
    }

    public void Print_ID() {
        System.out.println("Hi My Id is :- " + this.Id);
    }

    public int Print_Salary() {
        return Salary;
    }
}


public class Lec_38_FirstCustomClass {
    public static void main(String[] args) {

        Employee38 Harry = new Employee38();        // Initializing new Employee Object
        Harry.Id = 1;                               // Setting attributes
        Harry.Name = "CodeWithHarry";
        Harry.Salary = 12000;

        Employee38 Tejas = new Employee38();        // Initializing new Employee Object
        Tejas.Id = 2;                               // Setting attributes
        Tejas.Name = "CodeWithTejas";
        Tejas.Salary = 13000;

        Employee38 Vaibhav = new Employee38();      // Initializing new Employee Object
        Vaibhav.Id = 3;                             // Setting attributes
        Vaibhav.Name = "CodeWithVaibhav";
        Vaibhav.Salary = 14000;

        Harry.Print_Details();                                  // Hi My Name is :- CodeWithHarry
        Harry.Print_ID();                                       // Hi My Id is :- 1
        int a = Harry.Print_Salary();
        System.out.println("Harry's Salary is :- " + a);        // Harry's Salary is :- 12000

        Tejas.Print_Details();                                  // Hi My Name is :- CodeWithTejas
        Tejas.Print_ID();                                       // Hi My Id is :- 2
        int b = Tejas.Print_Salary();
        System.out.println("Tejas's Salary is :- " + b);        // Tejas's Salary is :- 13000

        Vaibhav.Print_Details();                                // Hi My Name is :- CodeWithVaibhav
        Vaibhav.Print_ID();                                     // Hi My Id is :- 3
        int c = Vaibhav.Print_Salary();
        System.out.println("Vaibhav's Salary is :- " + c);      // Vaibhav's Salary is :- 14000

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
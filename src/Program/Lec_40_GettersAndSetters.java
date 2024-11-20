// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 40) Getter & Setter

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Employee40 {
    private int Id;
    private String Name;

    public void Set_Details(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public int Get_ID() {
        return this.Id;
    }

    public String Get_Name() {
        return this.Name;
    }
}

public class Lec_40_GettersAndSetters {
    public static void main(String[] args) {

        Employee40 Harry = new Employee40();

        // Harry.Id = 1;           // Id is private acces modifier    // Not Access by these accessible only by public methods
        // Harry.Name = "Tejas";   // Name is private acces modifier  // Not Access by these accessible only by public methods

        Harry.Set_Details(10, "CodeWithHarry");

        System.out.println("Id is :- " + Harry.Get_ID());           // Id is :- 10
        System.out.println("Name is :- " + Harry.Get_Name());       // Name is :- CodeWithHarry
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
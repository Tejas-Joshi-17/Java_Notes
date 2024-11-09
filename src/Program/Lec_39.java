// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 39) Chapter-8 Practice Set

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Employee39 {
    String Name;
    int Salary;

    public void Set_Name(String Name) {
        this.Name = Name;
    }

    public void Set_Salary(int Salary) {
        this.Salary = Salary;
    }

    public String Get_Name() {
        return this.Name;
    }

    public int Get_Salary() {
        return this.Salary;
    }
}

class CellPhone39 {
    public void Call_Friend() {
        System.out.println("Calling Friend ...!");
    }

    public void Viberation() {
        System.out.println("Vibrating ...!");
    }

    public void Ring() {
        System.out.println("Ringing the Phone ...!");
    }
}

class Square39 {
    float Side;
    float Area;
    float Perimeter;

    public void Set_Side(float side) {
        this.Side = side;
    }

    public float Get_Area() {
        Area = this.Side * this.Side;
        return this.Area;
    }

    public float Get_Perimeter() {
        Perimeter = this.Side * 4;
        return this.Perimeter;
    }
}

class Circle39 {
    double Radius;
    double Area;
    double Perimeter;

    public void Set_Radius(double Radius) {
        this.Radius = Radius;
    }

    public double Get_Radius() {
        return this.Radius;
    }

    public double Get_Area() {
        this.Area = Math.PI * this.Radius * this.Radius;
        return Area;
    }

    public double Get_Perimeter() {
        this.Perimeter = 2 * Math.PI * this.Radius;
        return this.Perimeter;
    }
}

class Rectangle39 {
    float Length, Breadth;
    float Area;
    float Perimeter;

    public void Set_Dimension(float Length, float Breadth) {
        this.Length = Length;
        this.Breadth = Breadth;
    }

    public void Get_Dimension() {
        System.out.println("Length of Rectangle is :- " + this.Length);
        System.out.println("Breadth of Rectangle is :- " + this.Breadth);
    }

    public float Get_Area() {
        Area = this.Length * this.Breadth;
        return this.Area;
    }

    public float Get_Perimeter() {
        Perimeter = 2 * (this.Length + this.Breadth);
        return this.Perimeter;
    }
}

public class Lec_39 {
    public static void main(String[] args) {


        // Q.1. Create a class Employee with following properties and methods
        // 1) Salary (property) (int)
        // 2) Name (property) (String)
        // 3) Set_Name (method - Set Name)
        // 4) Set_Salary (method - Set Salary)
        // 5) Get_Salary (method returning int)
        // 6) Get_Name (method - returning String)
        Employee39 Harry = new Employee39();

        Harry.Set_Name("CodeWithHarry");
        Harry.Set_Salary(100000);

        System.out.println("Harry's Name is :- " + Harry.Get_Name());
        // Harry's Name is :- CodeWithHarry

        System.out.println("Harry's Salary is :- " + Harry.Get_Salary());
        // Harry's Salary is :- 100000


        // Q.2. Create a class cellphone with methods to print "ringing .. " , "vibrating ..."
        CellPhone39 Vivo = new CellPhone39();

        Vivo.Call_Friend();          // Calling Friend ...!
        Vivo.Viberation();           // Vibrating ...!
        Vivo.Ring();                 // Ringing the Phone ...!


        // Q.3. Create a class square with a method to initilize its side , calculating area , perimeter , etc
        Square39 a = new Square39();
        a.Set_Side(10);

        System.out.println("Area of Square is :- " + a.Get_Area());
        // Area of Square is :- 100.0

        System.out.println("Perimeter of Square is :- " + a.Get_Perimeter());
        // Perimeter of Square is :- 40.0


        // Q.4. Create a class rectangle with a method to initilize its side , calcukating area , perieter , etc
        Rectangle39 b = new Rectangle39();
        b.Set_Dimension(10, 20);

        b.Get_Dimension();
        // Length of Rectangle is :- 10.0
        // Breadth of Rectangle is :- 20.0

        System.out.println("Area of Rectangle is :- " + b.Get_Area());
        // Area of Rectangle is :- 200.0

        System.out.println("Perimeter of Rectangle is :- " + b.Get_Perimeter());
        // Perimeter of Rectangle is :- 60.0


        // Q.5. Create a class circle with a method to initilize its side , calcukating area , perieter , etc
        Circle39 c = new Circle39();
        c.Set_Radius(10);

        System.out.println("Area of Square of Radius-" + c.Get_Radius() + " is :- " + c.Get_Area());
        // Area of Square of Radius-10.0 is :- 314.1592653589793

        System.out.println("Perimeter of Square of Radius-" + c.Get_Radius() + " is :- " + c.Get_Perimeter());
        // Perimeter of Square of Radius-10.0 is :- 62.83185307179586

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
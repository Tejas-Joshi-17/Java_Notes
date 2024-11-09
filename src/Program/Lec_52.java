// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 52) Chapter-10 Pratice Set

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

// 1) Create a class Circle and use inheritence to create another class Cylinder from it.
class Circle521 {
    public int Radius;

    public Circle521(int radius) {
        this.Radius = radius;
    }

    public void Set_Radius(int radius) {
        this.Radius = radius;
    }

    public int Get_Radius() {
        return this.Radius;
    }

    public double Get_Area() {
        return Math.PI * this.Radius * this.Radius;
    }
}

class Cylinder521 extends Circle521 {
    public int Height;

    public Cylinder521(int radius, int height) {
        super(radius);
        this.Height = height;
    }

    public int Get_Height() {
        return this.Height;
    }

    public double Get_Volumne() {
        return Math.PI * this.Radius * this.Radius * this.Height;
    }
}

public class Lec_52 {
    public static void main(String[] args) {

        Circle521 a = new Circle521(10);
        System.out.println("Radius of Circle is :- " + a.Get_Radius());
        System.out.println("Area of Circle of Radius-" + a.Get_Radius() + " is :- " + a.Get_Area());
        // Radius of Circle is :- 10
        // Area of Circle of Radius-10 is :- 314.1592653589793

        Cylinder521 b = new Cylinder521(10, 2);
        System.out.println("Radius of Cylinder is :- " + b.Get_Radius());
        System.out.println("Height of Cylinder is :- " + b.Get_Height());
        System.out.println("Volume of Cylinder is :- " + b.Get_Volumne());
        // Radius of Cylinder is :- 10
        // Height of Cylinder is :- 2
        // Volume of Cylinder is :- 628.3185307179587

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
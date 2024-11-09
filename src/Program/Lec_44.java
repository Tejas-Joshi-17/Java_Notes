// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 44) Chapter-9 Pratice Set

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

// 1) Create a class Cylinder and use getter and setters to set its radius and height
class Cylinder44 {

    double Radius, Height;
    double Area, Volume;

    public Cylinder44() {
        this.Radius = 0;
        this.Height = 0;
    }

    public Cylinder44(double radius, double height) {
        this.Radius = radius;
        this.Height = height;
    }

    public void Set_Radius(double radius) {
        this.Radius = radius;
    }

    public void Set_Height(double height) {
        this.Height = height;
    }

    public double Get_Radius() {
        return this.Radius;
    }

    public double Get_Height() {
        return this.Height;
    }

    public double Get_Area() {
        this.Area = Math.PI * this.Radius * this.Radius;
        return this.Area;
    }

    public double Get_Volume() {
        this.Volume = Math.PI * this.Radius * this.Radius * this.Height;
        return this.Volume;
    }

}

public class Lec_44 {
    public static void main(String[] args) {

        Cylinder44 a = new Cylinder44();
        a.Set_Radius(10);
        a.Set_Height(20);
        System.out.println("Area of Cylinder is :- " + a.Get_Area());
        // Area of Cylinder is :- 314.1592653589793
        System.out.println("Volume of Cylinder is :- " + a.Get_Volume());
        // Volume of Cylinder is :- 6283.185307179587

        Cylinder44 b = new Cylinder44(10, 20);
        System.out.println("Area of Cylinder is :- " + b.Get_Area());
        // Area of Cylinder is :- 314.1592653589793
        System.out.println("Volume of Cylinder is :- " + b.Get_Volume());
        // Volume of Cylinder is :- 6283.185307179587

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
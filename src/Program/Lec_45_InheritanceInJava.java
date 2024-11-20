// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 45) Inheritance

// -- 1) Parent Class is Superclass.
// -- 2) Child class is Subclass.

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Square45 {
    int Side;         // By-deault access modifier in 'default'
    int Radius;       // By-deault access modifier in 'default'

    public void Set_Radius(int radius) {
        this.Radius = radius;
    }

    public void Set_Side(int side) {
        this.Side = side;
    }

    public int Get_Radius() {
        return this.Radius;
    }

    public int Get_Side() {
        return this.Side;
    }
}

// Here square is superclass and rectangle is subclass
class Rectangle45 extends Square45 {
    int a;
    int b;

    public void Set_a(int a) {
        this.a = a;
    }

    public void Set_b(int b) {
        this.b = b;
    }

    public int Get_a() {
        return this.a;
    }

    public int Get_b() {
        return this.b;
    }

}


public class Lec_45_InheritanceInJava {
    public static void main(String[] args) {

        Square45 ball = new Square45();
        ball.Side = 232;
        ball.Radius = 33;
        System.out.println(ball.Get_Side());            // 232
        System.out.println(ball.Get_Radius());          // 33
        ball.Set_Radius(10);
        ball.Set_Side(20);
        System.out.println(ball.Get_Radius());          // 10
        System.out.println(ball.Get_Side());            // 20
        // ball.a = 31;                             <--- No Accessible
        // ball.b = 23;                             <--- No Accessible
        // ball.Set_a(10);                          <--- No Accessible
        // ball.Set_b(45);                          <--- No Accessible
        // System.out.println(ball.Get_a());        <--- No Accessible
        // System.out.println(ball.Get_b());        <--- No Accessible


        Rectangle45 bat = new Rectangle45();
        bat.Side = 3232;
        bat.Radius = 12;
        System.out.println(bat.Get_Radius());           // 12
        System.out.println(bat.Get_Side());             // 3232
        bat.Set_Radius(40);
        bat.Set_Side(10);
        System.out.println(bat.Get_Radius());           // 40
        System.out.println(bat.Get_Side());             // 10
        bat.a = 45;
        bat.b = 89;
        System.out.println(bat.Get_a());                // 45
        System.out.println(bat.Get_b());                // 89
        bat.Set_a(55);
        bat.Set_b(10);
        System.out.println(bat.Get_a());                // 55
        System.out.println(bat.Get_b());                // 10

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
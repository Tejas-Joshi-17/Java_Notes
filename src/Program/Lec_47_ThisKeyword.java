// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 47) this keyword

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

class Circle471 {
    int Radius;

    public void Set_Radius(int Radius) {
        Radius = Radius;                   // <---- Confusion
    }

    public int Get_Radius() {
        return Radius;
    }
}

class Circle472 {
    int Radius;

    public void Set_Radius(int Radius) {
        this.Radius = Radius;               // <---- Confusion
    }

    public int Get_Radius() {
        return Radius;
    }
}

public class Lec_47_ThisKeyword {
    public static void main(String[] args) {

        Circle471 a = new Circle471();
        a.Set_Radius(10);
        System.out.println("Radius of Circle is :- " + a.Get_Radius());
        // Radius of Circle is :- 0

        Circle472 b = new Circle472();
        b.Set_Radius(10);
        System.out.println("Radius of Circle is :- " + b.Get_Radius());
        // Radius of Circle is :- 10

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------
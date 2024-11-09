package Program.Exercise_5;

public class Circle extends Shape {
    Circle(int dim1, int dim2) {
        super(dim1, -1);
    }

    public double Area() {
        return Math.PI * this.dim1 * this.dim1;
    }
}

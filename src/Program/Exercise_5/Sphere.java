package Program.Exercise_5;

public class Sphere extends Shape {
    Sphere(int dim1, int dim2) {
        super(dim1, -1);
    }

    public double Area() {
        return 4 * Math.PI * this.dim1 * this.dim1;
    }
}

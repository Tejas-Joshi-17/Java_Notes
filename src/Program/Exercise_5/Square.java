package Program.Exercise_5;

public class Square extends Shape {
    Square(int dim1, int dim2) {
        super(dim1, -1);
    }

    public int Area(int dim1, int dim2) {
        return this.dim1 * this.dim1;
    }
}

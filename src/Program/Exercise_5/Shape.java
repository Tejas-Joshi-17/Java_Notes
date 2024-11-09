package Program.Exercise_5;

public class Shape {

    int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int get_Dim1() {
        return this.dim1;
    }

    public void set_Dim1(int dim1) {
        this.dim1 = dim1;
    }

    public int get_Dim2() {
        return this.dim2;
    }

    public void set_Dim2(int dim2) {
        this.dim2 = dim2;
    }
}

package This.Keyword;


class ComplexNum {
    int real;
    int imaginary;

    public ComplexNum() {

    }

    public ComplexNum(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String print() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Complex :- " + this.real + " + " + this.imaginary + "i";
    }
}
public class Sample {
    public static void main(String[] args) {

        ComplexNum complexNum = new ComplexNum(10, 20);
        String info = complexNum.print();
        System.out.println(info);

    }
}

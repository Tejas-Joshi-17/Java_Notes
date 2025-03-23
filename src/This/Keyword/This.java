package This.Keyword;

import java.util.logging.Logger;

class Complex {
    int real;
    int imaginary;

    public Complex() {

    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex newComplexNumber(Complex num2) {
        Complex complex = new Complex();
        complex.real = this.real + num2.real;
        complex.imaginary = this.imaginary + num2.imaginary;
        return complex;
    }

    public void print(Complex num) {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Complex{" +
               "real=" + real +
               ", imaginary=" + imaginary +
               '}';
    }
}

public class This {
    private static final Logger logger = Logger.getLogger(This.class.getName());

    public static void main(String[] args) {

        Complex num1 = new Complex(3, 4);
        Complex num2 = new Complex(4, 5);
        Complex result = num1.newComplexNumber(num2);

        num1.print(num1);
        num2.print(num2);
        logger.info("Result is :- " + result);

    }
}

package laboratori4.apartat1;

public class ComplexNumber {
    public static final ComplexNumber ZERO = new ComplexNumber(0, 0);
    private double real;
    private double imaginary;

    public ComplexNumber(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(this.real + c.real, this.imaginary + c.imaginary);
    }

    public String toString() {
        String output = this.real + " + " + this.imaginary + "i";
        return output;
    }

}

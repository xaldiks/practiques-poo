package laboratori4.apartat2;

import java.lang.Math;

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

    public ComplexNumber substract(ComplexNumber c) {
        return new ComplexNumber(this.real - c.real, this.imaginary - c.imaginary);
    }

    public void accumulate(ComplexNumber c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    public double getModulus() {
        double modulus = Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
        return modulus;
    }

    public double getArc() {
        double arc = Math.atan(this.imaginary / this.real);
        return arc;
    }

    public ComplexNumber multiplication(ComplexNumber c) {
        return new ComplexNumber(this.getModulus() * c.getModulus() * Math.cos(this.getArc() + c.getArc()), this.getModulus() * c.getModulus() * Math.sin(this.getArc() + c.getArc()));
    }

    public ComplexNumber division(ComplexNumber c) {
        return new ComplexNumber((this.getModulus() / c.getModulus()) * Math.cos(this.getArc() - c.getArc()), (this.getModulus() / c.getModulus()) * Math.sin(this.getArc() - c.getArc()));
    }

    public String toString() {
        String output = this.real + " + " + this.imaginary + "i";
        return output;
    }

}

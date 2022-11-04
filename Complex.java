class Complex {

    private double real;
    private double imaginary;
    final double LIMIT = 10;

    Complex() {

        real = 0;
        imaginary = 0;
    }

    Complex(double actual) {

        this.real = actual;
        imaginary = 0;
    }

    Complex(double actual, double fake) {

        this.real = actual;
        this.imaginary = fake;
    }

    public double getReal() {

        return real;
    }

    public double getImaginary() {

        return imaginary;
    }

    public void setReal(double actual) {

        this.real = actual;
    }

    public void setImaginary(double fake) {

        this.imaginary = fake;
    }

    public String toString() {

        return real + " + " + imaginary + "i";
    }

    public boolean equals(Complex complexNumber) {

        if(real == complexNumber.real && imaginary == complexNumber.imaginary) {
            return true;
        }

        else {
            return false;
        }
    }

    public Complex add(Complex complexNumber) {

        Complex temp = new Complex (0.0,0.0);
        temp.real = real + complexNumber.real;
        temp.imaginary = imaginary + complexNumber.imaginary;

        return temp;

    }

    public Complex add (double val) {

        Complex temp = new Complex(0.0, 0.0);
        temp.real = real + val;
        temp.imaginary = imaginary + val;

        return temp;

    }

    public static Complex add(Complex complexNumber, Complex c2) {
        Complex temp = new Complex(0.0, 0.0);
        temp.real = complexNumber.real + c2.real;
        temp.imaginary = complexNumber.imaginary + c2.imaginary;
        return temp;

    }

    public boolean isBig() {
        double size = Math.sqrt((Math.pow(real, 2) + Math.pow(imaginary, 2)));
        if(size > LIMIT)
            return true;
        else
            return false;

    }

}

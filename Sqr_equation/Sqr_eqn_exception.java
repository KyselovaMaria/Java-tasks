package Sqr_equation;


class Sqr_eqn_exception extends ArithmeticException {
    private String detail;

    Sqr_eqn_exception(String message) {
        detail = message;
    }

    @Override
    public String toString() {
        return detail;
    }
}

class Discriminant_eqn_exception extends ArithmeticException {
    private double a, b, c, d;

    Discriminant_eqn_exception(String message, double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Discriminant is " + d + " for a, b, c: " + a + ", " + b + ", " + c;
    }
}
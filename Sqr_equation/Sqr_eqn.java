package Sqr_equation;

public class Sqr_eqn {
    private double a, b, c, x1, x2;

    Sqr_eqn() {}

    Sqr_eqn(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double discriminant() throws  Discriminant_eqn_exception {
        double d = b*b - 4*a*b;

        if (d < 0) {
            throw new Discriminant_eqn_exception("Oi!", a, b, c, d);
        }
        return d;
    }

    public void solution() throws Discriminant_eqn_exception,Sqr_eqn_exception {
        try {
            if (a == 0) throw new Sqr_eqn_exception("Main member is 0.");

            double d = discriminant();
            double x1 = (-b - Math.sqrt(d))/(2*a);
            double x2 = (-b + Math.sqrt(d))/(2*a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            this.x1 = x1;
            this.x2 = x2;

        } catch (Sqr_eqn_exception e) {
            System.out.println(e);
            throw new Sqr_eqn_exception("Division by 0.");
        } catch (Discriminant_eqn_exception e) {
            throw e;
        }
    }

    public void printRoots() {
        System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
    }
}
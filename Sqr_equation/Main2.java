package Sqr_equation;

import java.util.InputMismatchException;

public class Main2 {
    public static void main(String[] args) {
        double a, b, c;

        IOTool io = new IOTool();

        try {
            Sqr_eqn qadr1 = new Sqr_eqn(2, -6, 4);
            qadr1.solution();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            Sqr_eqn qadr2 = new Sqr_eqn(1, 2, 3);
            qadr2.solution();
        } catch (Discriminant_eqn_exception e) {
            e.printStackTrace();
        }

        try {
            Sqr_eqn qadr3 = new Sqr_eqn(0, 2, 3);
            qadr3.solution();
        } catch (Sqr_eqn_exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("\nInput a, b, c:");
            a = io.readDouble();
            b = io.readDouble();
            c = io.readDouble();

            Sqr_eqn qadr = new Sqr_eqn(a, b, c);
            qadr.solution();
            qadr.printRoots();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

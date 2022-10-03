
import java.util.Scanner;

public class t3_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, diff, prod;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        scanner.close();
        prod = a*b;
        diff = Math.abs(a-b);
        System.out.printf("Difference = %.6f", diff);
        System.out.printf("\nProduct = %.6f", prod);

    }
}
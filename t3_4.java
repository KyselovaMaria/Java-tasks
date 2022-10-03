
import java.util.Scanner;
public class t3_4 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("Res: 1");
        } else {
            if (a == b || b == c || c == a) {
                System.out.println("Res: 2");
            } else {
                System.out.println("Res: 3");
            }
        }
    }
}

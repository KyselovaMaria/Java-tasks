
import java.util.Random;

public class t3_2 {
    public static void main(String[] args) {
        Random rn = new Random();
        int n = rn.nextInt(50) + 10;
        System.out.println("Number: " + n);
        for (int i = 0; i < 25; i++) {
            int t = rn.nextInt() % 50;
            while (t <= n) {
                t = rn.nextInt() % 50;
            }
            System.out.println(t);
        }
    }
                }

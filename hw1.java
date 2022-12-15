//2.6
import java.util.Random;
public class hw1 {
    public static void main(String[] args) {
        int upperbound = 100;
        Random rand = new Random();
        System.out.print("without newline: \n");
        for (int i = 0; i < 7; i++) {
            int int_random = rand.nextInt(upperbound);
            System.out.print(" " + int_random);

        }

        System.out.print("\nЗ with newline: \n");
        for (int i = 0; i < 7; i++) {
            int int_random = rand.nextInt(upperbound);
            System.out.println(" " + int_random);
        }
    }
}
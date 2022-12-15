import java.util.Scanner;
import java.lang.Math;

public class t1_15_2 {
    public static void main(String args[]) {
        System.out.println("Введіть рядок чисел: ");
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int res = array[0].length();
        for (int i = 1; i < array.length ; i++) {
            int r =  i-1 + (int) (Math.random()*2);
            //System.out.println(r);
            array[i] = array[r];
        }
        System.out.println("Random res: " + array[array.length - 1]);

    }
}




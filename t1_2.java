import java.util.Scanner;

public class t1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        Integer[] mas = new Integer[array.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(array[i]);
        }
        Integer min = mas[0], max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (min > mas[i])
                min = mas[i];
            if (max < mas[i])
                max = mas[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
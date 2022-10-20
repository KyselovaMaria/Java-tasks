import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task_1_5();
        //Task_1_6();
        Task_1_4();
    }

    public  static void Task_1_4(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of number: ");
        int n = in.nextInt();
        int[] array = new int[n + 1];
        array[n] = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("number [" + (i + 1) + "] = ");
            array[i] = in.nextInt();
        }
        int[] res = {0, 0};
        int count = 1;
        int prev = 0;
        for (int a : array) {
            if (a != prev) {
                if (count > res[0]) {
                    res[0] = count;
                    res[1] = prev;
                } else if (count == res[0] && prev > res[1]) {
                    res[1] = prev;
                }
                count = 0;
            }
            prev = a;
            count += 1;
        }
        //return res;
        System.out.printf("Number %d, repeats %d times", res[1], res[0]);
    }

    public static void Task_1_5() {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        double bestX = Double.NaN;
        double bestY = Double.NaN;
        double bestZ = Double.NaN;
        double bestDist = Double.POSITIVE_INFINITY;

        while(in.hasNextDouble())
        {
            double xi = in.nextDouble();
            double yi = in.nextDouble();
            double zi = in.nextDouble();
            double dist = Math.pow(x - xi, 2) + Math.pow(y- yi,2) + Math.pow(z -zi, 2);
            if(dist < bestDist)
            {
                bestX = xi;
                bestY = yi;
                bestZ = zi;
                bestDist = dist;
            }
        }
        System.out.printf("Closest point = {%f, %f, %f)\n", bestX, bestY, bestZ);
    }
    public static void Task_1_6(){
        System.out.println("Введіть рядок чисел: ");
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int min = array[0].length();
        for(int i = 1; i < array.length; i++)
        {
            if(min > array[i].length())
                min = array[i].length();
        }
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].length() == min)
            {
                System.out.println(array[i]);
            }
        }
    }
}

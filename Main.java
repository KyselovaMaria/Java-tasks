import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// 2.1 2.2
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    public static void main(String[] args) {
        Main.run();
    }

    public static void run(){
        int n;
        System.out.print("n = ");
        n = sc.nextInt();
        int[][] m = inputRandomSquareMatrix(n);
        showMatrix(m);
        System.out.println("***************");
        m = sortRows(m);
        showMatrix(m);
        System.out.println("***************");
        cyclicShift(m, 2);
        showMatrix(m);
    }

    static void showMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(" " + m[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] inputSquareMatrix(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n * n; i++) {
            System.out.printf("a[%d][%d] = ", i / n, i % n);
            res[i / n][i % n] = sc.nextInt();
        }
        return res;
    }

    static int[][] inputRandomSquareMatrix(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n * n; i++) {
            res[i / n][i % n] = rnd.nextInt(2 * n + 1) - n;
        }
        return res;
    }

    static void cyclicShift(int[][] m, int k) {
        for (int i = 0; i < m.length; i++) {
            int[] row = new int[m[i].length];
            for (int j = 0; j < m[i].length; j++) {
                if (j + k < m[i].length)
                    row[j] = m[i][j + k];
                else
                    row[j] = m[i][j + k - m[i].length];
            }
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = row[j];
            }
        }
    }

    static int[][] sortRows(int[][] m) {
        int n = m.length;
        int[][] res = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            Arrays.sort(m[i]);
            res[i] = m[i].clone();
        }
        return res;
    }
}
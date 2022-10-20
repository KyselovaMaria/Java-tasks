import java.lang.*;
import java.util.Scanner;

public class t2_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of rows in matrix:");
        int n = in.nextInt();
        System.out.println("Enter amount of columns in matrix:");
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("array[" + (i + 1) + "] [" + (j + 1) + "] = ");
                int k = in.nextInt();
                matrix[i][j] = k;
            }
        }
        outputMatrix("Original: ", matrix);
        outputMatrix("Rotated: ", rotateMatrix(m, n, matrix));
    }

    public static int[][] rotateMatrix(int m, int n, int[][] matrix) {
        int[][] rotated = new int[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                rotated[j][i] = matrix[i][n - j - 1];
            }
        return rotated;
    }
    public static void outputMatrix(String title, int[][] matrix) {
        System.out.println(title);
        for (int[] row : matrix) {
            for (int el : row)
                System.out.print(" " + el);
            System.out.println();
        }
    }
}
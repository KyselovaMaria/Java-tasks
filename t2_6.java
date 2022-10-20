import java.util.*;
import java.lang.*;

public class t2_6 {
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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += Math.pow(matrix[i][j],2);
            }
        }
        System.out.println("Norma = " + Math.sqrt(sum));

    }

}
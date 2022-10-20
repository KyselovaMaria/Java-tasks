import java.util.Random;
import java.util.Scanner;

public class t2_13 {
    static void fillRandomMatrix(int m[][], int d) {
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[j][i] = random.nextInt(2 * d + 1) - d;
            }}}
    static void printMatrix(int[][] m) {
        for (int[] i: m) {
            for (int j: i)
                System.out.print(j + " ");
            System.out.println();
        }}

    static void printArray_asMatrix(int[] arr, int size) {
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            k++;
            if (k%size == 0){
                System.out.print(arr[i] + "\n");
            }
            else System.out.print(arr[i] + " ");
        }}
    public static int[] replace_0_toTheEnd(int[] arr) {
        int j = 0;
        for (int i: arr) {
            if (i != 0) {
                arr[j++] = i;
            }}
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        } return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int size = sc.nextInt();

        int m[][] = new int[size][size];
        fillRandomMatrix(m, size);
        System.out.println("\nRandom matrix: ");
        printMatrix(m);

        int[] m_array = new int[m.length * m.length];
        int c = 0;
        for (int[] i : m) {
            for (int j : i) {
                m_array[c++] = j;
            }}

        System.out.println();
        System.out.println("Matrix with zeros in the end: ");
        replace_0_toTheEnd(m_array);
        printArray_asMatrix(replace_0_toTheEnd(m_array), size);
    }}

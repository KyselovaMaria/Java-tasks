import java.util.Scanner;

public class t1_3 {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        int n;
        double sum = 0f;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        double[] numArray = new double[n];
        for(int i = 0; i < n; i++)
        {
            numArray[i] = in.nextDouble();
            sum+=numArray[i];
        }
        double mean = sum/n, stadrtdvtn = 0.0;
        System.out.println("Mean: " + mean);
        for(double num: numArray)
        {
            stadrtdvtn += Math.pow(num - mean, 2);
        }
        System.out.println("Sample standart Deviation: " + stadrtdvtn);
    }
}

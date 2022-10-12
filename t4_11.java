import java.util.Scanner;
import java.util.Arrays;

public class t4_11 {
    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {

        System.out.println("Enter the required size of the array: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int[size];
        System.out.println("Enter the elements of the array one by one ");
        String res = new String();
        for (int i = 0; i < size; i++) {
            myArray[i] = s.nextInt();
        }
        System.out.println("Contents of the array are: " + Arrays.toString(myArray));

        for (int i = 0; i < size; i++) {
            if (isArmstrong(myArray[i])==true) {
                System.out.print("Armstrong: " + myArray[i] + '\n' );
            }
        }

    }
}

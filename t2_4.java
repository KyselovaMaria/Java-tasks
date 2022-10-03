
import java.util.Scanner;
public class t2_4 {
    public static void t2_4(int n, byte m)
    {
        int mask = 1 << m;
        n = n ^ mask;
        //return n;
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        byte m = sc.nextByte();
        String bit = Integer.toBinaryString(n);
        t2_4(n,m);

    }
}
 //5,1 res:7
//2.12
import java.io.*;
import java.util.Scanner;

public class Main {
    public static int modifyBit(int m,
                                int j)
    {
        int mask = 1 << j;
        return (m & ~mask) |
                ((0 << j) & mask);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m = sc.nextInt();
        System.out.println("Enter the value of j:");
        int j = sc.nextInt();
        System.out.println("б)Result : "+ modifyBit(m,j));


  }

}



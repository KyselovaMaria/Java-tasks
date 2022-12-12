package cw10;
import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed string: " + sb);
    }
}

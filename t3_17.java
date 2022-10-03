import java.util.Scanner;

public class t3_17 {
    public static void main(String args[]) {
        String s ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter:");
        s = sc.nextLine();
        s=s.replaceAll("\\W", "") ;
        System.out.println(Math.pow(Integer.parseInt(s),3));
        }
}
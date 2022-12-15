
import java.util.Scanner;
//4_2 б в
public class Main {
    public static int function1(int x, int y){
        int res = (int) (Math.pow(x, 2) * Math.pow(y, 2) + Math.pow(x, 3) * Math.pow(y, 3) + Math.pow(x, 4) * Math.pow(y, 4));
        return res;
    }
    public static int function2(int x, int y){
        int res = (int) (x+y+Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(x, 4) + Math.pow(y, 4));
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();
        System.out.println("б)Result : "+function1(x,y));
        System.out.println("в)Result: "+function2(x,y));
    }

}
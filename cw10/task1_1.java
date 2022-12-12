package cw10;
import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] words = string.split("\\s+");
        System.out.println("Words in text: " + words.length);
    }
}

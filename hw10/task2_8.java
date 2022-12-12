package hw10;
import java.util.Scanner;

public class task2_8 {
    public static void main(String[] args){
        String str = "abcdef";
        int key = 2;
        char[] ch  = str.toCharArray();
        String str2 = "";
        for(char c : ch) {
            int temp = (int) c + key;
            StringBuffer buffer = new StringBuffer(str2);
            buffer.append((char) temp);
            System.out.println(buffer.toString());
        }
    }
}

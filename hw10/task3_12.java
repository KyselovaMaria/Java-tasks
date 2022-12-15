package hw10;
import java.util.Scanner;

public class task3_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text: " );
        String text = sc.nextLine();
        char add = ' ';
        text = String.format("%s%c", text, add);

        StringBuilder builder = new StringBuilder();
        System.out.println(text.length());

        for (int i = 0; i < text.length()-1 ; i++) {
            char char_prev = text.charAt(i);
            char char_temp = text.charAt(i+1);

            System.out.println("[" + char_prev + "] " + (int)char_prev);

            int difference = Math.abs(char_prev - char_temp);
            if (difference == 1){
                builder.append(char_prev);
                if (i == text.length()-1){
                    builder.append(char_temp);
                }
            }
        }
        System.out.println("Main result: " + builder);
    }
}

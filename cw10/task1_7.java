package cw10;
import java.util.Scanner;

public class task1_7 {
    public static int countChars(String text){
        String[] words = text.split(" ");
        String str = String.join("", words);
        return str.length();
    }

    public static int countWords(String text){
        String r = "[\\p{Punct}\\s]+";
        String[] words = text.split(r);
        return words.length;
    }

    public static int countPunctMarks(String text){
        String r = "[\\p{Punct}]+";
        String[] words = text.split(r);
        return words.length-1;

    }

    public static int countSentences(String text){
        String r = "[.?!]";
        String[] sentences = text.split(r);
        return sentences.length;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String[] str = string.split("([\\W\\s]+)");
        System.out.println("Amount of characters: " + countChars(str));
        System.out.println("Amount of words: " + countWords(str));
        System.out.println("Amount of punctuation marks: " + countPunctMarks(str));
        System.out.println("Amount of sentences: " + countSentences(str));

    }
}

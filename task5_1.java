package cw11;

import java.util.*;
import java.io.*;

public class task5_1 {
    public static void main(String[] args){
    }

    public String fileWork () throws FileNotFoundException {
        String separator = File.separator;
        int count = 0;
        String infoFile;
        String longest_word = "";
        String current;

        Scanner sc = new Scanner(new File(separator + "C:" + separator + "Users"
                + separator + "mariy" + separator + "5_1.txt"));


        while (sc.hasNext()) {
            current = sc.next();
            count += 1;
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }
        }

        //part a
        System.out.println("\nLongest word: " + longest_word);

        //part b
        System.out.println("\nNumber of words in file: " + count + "\n");
        infoFile = longest_word + count;

        return infoFile;
    }

}

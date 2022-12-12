package cw11;
import java.io.*;
import java.util.*;

public class task6_1{
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        Scanner textFile = new Scanner(new File(separator + "C:" + separator + "Users"
                + separator + "mariy" + separator + "6_1.txt"));
        FileWriter fw = new FileWriter(separator + "C:" + separator + "Users"
                + separator + "mariy" + separator + "6_1_output");

        int sum = 0, count = 0;
        System.out.println("All numbers in text file :");
        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count += 1;
            System.out.println(count + ". " +nextInt);
            sum += nextInt;
            fw.write(nextInt + " ");
        }
        System.out.println("\nTheir sum = " + sum);
        fw.close();
    }
}
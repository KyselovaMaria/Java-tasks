import java.io.*;
import java.util.*;

//6_2
public class Main{
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        Scanner textFile = new Scanner(new File(separator + "C:" + separator + "Users"
                + separator + "mariy" + separator + "6_2.txt"));
        FileWriter fw = new FileWriter(separator + "C:" + separator + "Users"
                + separator + "mariy" + separator + "6_2_output");

        double product = 1;
        int count = 0;
        System.out.println("All numbers in text file :");
        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count += 1;
            System.out.println(count + ". " +nextInt);
            if (nextInt != 0){
                product *= Math.abs(nextInt);
                fw.write(nextInt + " ");
            }

        }
        System.out.println("\nTheir product = " + product);
        fw.close();
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task11_1 {
    private static String method(String filePath) {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader buffer = new BufferedReader(
                new FileReader(filePath))) {
            String str;

            while ((str = buffer.readLine()) != null) {
                builder.append(str).append("\n");
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }

    static int extractMaximum(String str) {
        int num = 0, res = 0;

        for (int i = 0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i)))
                num = num * 10 + (str.charAt(i)-'0');

            else{
                res = Math.max(res, num);
                num = 0;
            }
        }

        return Math.max(res, num);
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\mariy\\11_1.txt";
        String str = method(filePath);
        System.out.println("All num-s: " + str);
        System.out.println("Greatest: " + extractMaximum(str));
    }
}
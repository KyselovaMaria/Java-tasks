
import java.util.Scanner;
public class t4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = scanner.nextInt();

        for(int i = 10; i < 100; i++){
            if((i-10)%n==0){
                   System.out.println();
            }
            System.out.printf("%d ", i);

        }
    }
}

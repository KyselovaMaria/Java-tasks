package task6_14;
import toys. *;
import gameroom. *;
import java.util.Arrays;
import java.util.Scanner;

public class task6_14 {
    public static void main(String[] args) {
        Doll doll = new Doll("6-8", 1, 10, false);
        Ball ball = new Ball("8-12", 3, 1000, true);
        Toy[] toys = new Toy[]{ball, doll };
        Gameroom gameroom = new Gameroom(2, toys);

        System.out.printf("The price of this gameroom = %d\n", gameroom.get_price());
        System.out.println("\nToys sorted in ascending order by their size: ");
        Arrays.sort(toys);
        for(Toy toy:toys){
            System.out.println(toy);
        }

        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input range of desired age group: ");
        String ag = sc.nextLine();
        System.out.println("Suitable toy: ");
        gameroom.check_age_group(ag);

    }
}

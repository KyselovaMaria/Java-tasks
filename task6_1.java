import flowers. *;
import accessories. *;
import bouquet. *;
import java.util.Arrays;
import java.util.Scanner;

public class task6_1 {
    public static void main(String[] args) {

        Rose rose1 = new Rose("red", 10, 10, 30, "Roseae", "Rosaceae");
        Rose rose2 = new Rose("white", 8, 12, 50, "Roseae", "Rosaceae");
        Daisy daisy1 = new Daisy("yellow", 20, 12, 20, "Daisy1", "Asteraceae");
        Daisy daisy2 = new Daisy("yellow", 20, 11, 20, "Daisy2", "Asteraceae");
        Daisy daisy3 = new Daisy("yellow", 20, 6, 10, "Daisy3", "Asteraceae");
        Flower[] flowers = new Flower[]{rose1, rose2, daisy1, daisy2, daisy3 };

        Accessories accessory1 = new Accessories("white ribbon", 10);
        Accessories accessory2 = new Accessories("clear wrap", 15);
        Accessories[] accessories = new Accessories[]{accessory1, accessory2};

        Bouquet bouquet = new Bouquet(5, flowers, 2, accessories);

        System.out.printf("The price of this bouquet = %d\n", bouquet.get_price());
        System.out.println("\nFlowers sorted in ascending order by their freshness: ");
        Arrays.sort(flowers);
        for(Flower flower: flowers){
            System.out.println(flower);
        }

        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        int left_border, right_border;
        System.out.println("Input range of desired stem length: ");
        left_border = sc.nextInt();
        right_border = sc.nextInt();
        System.out.println("\nThe flower with the desired length os stem: ");
        for(Flower flower: flowers){
            if((left_border<=flower.getStem_length()) && (flower.getStem_length()<=right_border)){
                System.out.println(flower);
                break;
            }
        }
    }
}

import java.util.Objects;
import java.util.Scanner;

public class t2_8{

    static void print_phones_with_higher_limit(Phone[] phones, int limit){
        System.out.println("Phones with time spending more than: " + limit);
        for(Phone phone: phones){
            if (phone.time > limit){
                phone.show();
            }
        }
    }

    static void print_phones_using_calls(Phone[] phones){
        System.out.println("Phones, which using calls: ");
        for(Phone phone: phones){
            if (phone.time > 0){
                phone.show();
            }
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the amount of phones: ");
        int n = console.nextInt();

        Phone[] phones = new Phone[n];

        for(int i = 0; i < n; i++){
            System.out.println(i+1+" :");
            phones[i] = new Phone();
        }

        print_phones_using_calls(phones);
        print_phones_with_higher_limit(phones, 2);
    }
}
import java.util.Scanner;

public class Phone {
    int id;
    String surname;
    String name;
    String middle_name;
    String address;
    int card;
    float debit;
    float credit;
    float time;


    public Phone(int id, String surname, String name, String middle_name, String address, int card, float debit, float credit, float time) {
        this.id = id;
        this.surname = surname;
        this.name= name;
        this.middle_name = middle_name;
        this.address = address;
        this.card = card;
        this.debit = debit;
        this.credit = credit;
        this.time = time;

    }

    public Phone() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter id: ");
        this.id = console.nextInt();
        console.nextLine();
        System.out.println("Enter surname: ");
        this.surname = console.nextLine();
        System.out.println("Enter name: ");
        this.name= console.nextLine();
        System.out.println("Enter middle_name: ");
        this.middle_name = console.nextLine();
        //console.nextLine();
        System.out.println("Enter address: ");
        this.address = console.nextLine();
        System.out.println("Enter card: ");
        this.card = console.nextInt();
        System.out.println("Enter debit: ");
        this.debit = console.nextFloat();
        System.out.println("Enter credit: ");
        this.credit = console.nextFloat();
        System.out.println("Enter time: ");
        this.time = console.nextFloat();

    }

    public void show() {
        System.out.printf("\nId: %d\nSurname: %s\nName: %s\nMiddle_name: %s\nAddress: %s\nCard:  %s\nDebit:  %s\nCredit: %s\nTime: %s\n\n", this.id, this.surname, this.name, this.middle_name, this.address, this.card, this.debit, this.credit, this.time);
    }


}

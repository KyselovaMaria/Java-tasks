public class Main {
    public static void main(String[] args) {

        Payment p = new Payment(3);
        p.addProduct("Milk", 30.57);
        p.addProduct("Beer", 32.31);
        p.addProduct("Beer", 42.24);
        System.out.println(p);
        System.out.println("Total price: " + p.priceOfPayment());
    }
}
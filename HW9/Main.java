package HW9;

public class Main {
    public static void main(String[] args){
        Mobile m = new Mobile(3);
        m.addPhone("A", "Germany", 150.150);
        m.addPhone("B", "USA", 149.149);
        m.addPhone("C", "Japan", 200.200);

        System.out.print(m);
    }
}

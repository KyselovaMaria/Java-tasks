
public class t2_1 {
    public static void main(String[] args){
        int x = 0x123;
        int y = 0x522;
        int a = x | y;
        int b = x & y;
        int c = x ^ y;
        System.out.printf("Result in decimal: a: %d, b: %d, c: %d \n", a, b, c);
        System.out.printf("Result in hex: a: %x, b: %x, c: %x \n", a, b, c);
    }
}

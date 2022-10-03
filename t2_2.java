
public class t2_2{
    public static void t2_2()
    {
        int bin = 0b10101110101;
        for(int i = 0; i < 11; i++)
        {
            bin = bin << 1;
            System.out.println("i = " + i + ", " + Integer.toBinaryString(bin));
        }
    }
}
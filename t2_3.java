public class t2_3 {
    public static void main(String[] args) {
        char ch = 'a';
        //a = 'Ю';
        int s =  ch;
        StringBuilder result = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;
            result.append((s & mask) != 0 ? "1" : "0");
        }

        System.out.println(result);
        System.out.println(Integer.toBinaryString(s));
    }
}

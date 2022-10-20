//3.1 3.4
public class t3 {
    public static void main(String[] args) {

        t3 task = new t3();
        t3 task2 = new t3("Jack");

    }
    public String str1;
    public String str2 = "Hello";
    public String str3;

    public t3(String str3) {
        this.str3 = str3;
        System.out.println("Hello, " + str3);
    }

    public t3() {
        System.out.println("Hello everybody.");
    }
    }


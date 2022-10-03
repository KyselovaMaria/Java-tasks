
public class t1_5 {
    float x = 200.0f;
    String name = "russian";

    public void method(){
        System.out.print(this.name + this.x);
    }

    public static void main(String[] args) {
       t1_5 tmp = new t1_5();
        tmp.method();

    }
}

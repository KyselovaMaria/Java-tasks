
import java.util.Scanner;
    public class t3_15_2 {
        int age = getAge();
        String name = getName();
        static Scanner sc = new Scanner(System.in);
        public static final int getAge() {
            System.out.println("Enter age value: ");
            return sc.nextInt();
        }
        public static final String getName() {
            System.out.println("Enter name value: ");
            return sc.next();
        }
        public void display(){
            System.out.println("Name and age values: ");
            System.out.println(this.name);
            System.out.println(this.age);
        }
        public static void main(String args[]){
            t3_15_2 obj = new t3_15_2();
            obj.display();
        }
}
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        Circle c1 = new Circle(0,0,3);
        Circle c2 = new Circle(0,3,4);
        Circle c3 = new Circle(3,0,5);


        List<Circle> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        double min = 10000000;
        double max = 0;
        Circle min_c = new Circle();
        Circle max_c = new Circle();
        for (Circle obj: list
        ) {

            if (min >= obj.getArea()){
                min = obj.getArea();
                min_c = obj;
            }
            if (max <= obj.getArea()){
                max = obj.getArea();
                max_c = obj;
            }

            System.out.println(obj.toString());
            System.out.println("Perimeter: " + obj.getPerimeter() + ", square: " + obj.getArea());

        }
        System.out.println("Smallest: " + min_c.toString());
        System.out.println("Perimeter: " + min_c.getPerimeter() + ", square: " + min_c.getArea());
        System.out.println("Biggest: " + max_c.toString());
        System.out.println("Perimeter: " + max_c.getPerimeter() + ", square: " + max_c.getArea());
    }
}
package hw7_2.House;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Door d1 = new Door();
        Door d2 = new Door();
        List<Door> doors = new ArrayList<>(){{;
            add(d1);
            add(d2);
        }};

        Window w1 = new Window();
        Window w2 = new Window();
        List<Window> windows = new ArrayList<>(){{;
            add(w1);
            add(w2);
        }};;

        House house = new House(doors,windows);
        System.out.println(house);
        d1.amount = 3;
        d2.amount = 6;
        d1.set_locked(true);
        w1.amount = 10;
        w2.amount = 4;
        System.out.println(house);

    }
}
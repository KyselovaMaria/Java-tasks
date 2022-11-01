package hw7_2.House;

import java.util.List;

public class House {
    List<Door> doors;
    List<Window> windows;

    public House(List<Door> doors, List<Window> windows) {
        this.doors = doors;
        this.windows = windows;
    }


    @Override
    public String toString() {
        return "House{" +
                "doors=" + doors +
                "windows=" + windows + '}';
    }

}

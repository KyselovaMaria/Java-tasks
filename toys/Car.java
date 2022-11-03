package toys;

public class Car extends Toy{

    Boolean waterproof;

    @Override
    public String toString() {
        return "Car{" +
                "waterproof = '" + waterproof + '\'' +
                "age group = '" + age_group + '\'' +
                ", size = " + size +
                ", price = " + price +
                '}';
    }

    public boolean get_waterproof() {
        return waterproof;
    }


    public Car(String age_group, int size, int price, Boolean waterproof) {
        super(age_group, size, price);
        this.waterproof = waterproof;

    }
}
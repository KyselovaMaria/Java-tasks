package toys;

public class Toy implements Comparable<Toy>{

    String age_group;
    int size;
    int price;

    public Toy(String age_group, int size, int price){
        this.age_group = age_group;
        this.size = size;
        this.price = price;
    }

    public int compareTo(Toy other) {

        int compare_size = ((Toy) other).get_size();

        return this.size - compare_size;

    }

    public String get_age_group() {
        return age_group;
    }

    public int get_size() {
        return size;
    }

    public int get_price() {
        return price;
    }

    public void set_age_group(String age_group) {
        this.age_group = age_group;
    }

    public void set_size(int size) {
        this.size = size;
    }

    public void set_price(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Toy{" +
                "age group = '" + age_group + '\'' +
                ", size = " + size +
                ", price = " + price +
                '}';
    }

}
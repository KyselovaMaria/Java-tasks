package hw7_2.House;

public class Door {

    boolean locked;
    boolean isDoor;
    int amount;

    public Door(){
        this.isDoor = true;
        this.amount = 1;
        this.locked = false;
    }

    public Boolean get_is_door() {
        return isDoor;
    }

    public void set_is_door(Boolean isDoor) {
        this.isDoor = isDoor;
    }

    public Boolean get_locked() {
        return locked;
    }

    public void set_locked(Boolean locked) {
        this.locked = locked;
    }

    public int get_amountd() {
        return amount;
    }

    public void set_amountd(int amount) {
        this.amount = amount;;
    }

    @Override
    public String toString() {
        return "Door{" +
                "isPresent = " + isDoor +
                ", amount = " + amount+
                ", locked = " + locked + '}';
    }
}

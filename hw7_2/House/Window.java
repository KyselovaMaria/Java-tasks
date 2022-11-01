package hw7_2.House;

public class Window {

    boolean isWindow;
    int amount;

    public Window(){
        this.isWindow = true;
        this.amount = 1;

    }

    public Boolean get_is_window() {
        return isWindow;
    }

    public void set_is_window(Boolean isWindow) {
        this.isWindow = isWindow;
    }


    public int get_amountw() {
        return amount;
    }

    public void set_amountw(int amount) {
        this.amount = amount;;
    }

    @Override
    public String toString() {
        return "Window{" +
                "isPresent = " + isWindow +
                ", amount = " + amount + '}';
    }
}

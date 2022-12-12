package excptns;

public class Hours {
    private int hours;

    public Hours(int hours) throws WrongValueException{
        if(hours < 0 || hours > 59)
        {
            this.hours = 0;
            throw new WrongValueException("Wrong value of hours exception", hours);
        }
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
}

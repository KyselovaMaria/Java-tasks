package excptns;

public class Minutes {
    private int minutes;

    public Minutes(int minutes) throws WrongValueException {
        if(minutes < 0 || minutes > 59)
        {
            this.minutes = 0;
            throw new WrongValueException("Wrong value of minutes exception", minutes);
        }
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }
}

package excptns;

public class Main {
    public static void main(String[] args){
        try{
            Minutes minutes = new Minutes(25);
            Hours hours = new Hours(12);
            Day day = new Day(hours, minutes);
            day.printTime();
            day.printDayTime();
        }
        catch (WrongValueException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }

        Day day2 = new Day(-21, 23);
        day2.printTime();
        day2.printDayTime();
    }
}
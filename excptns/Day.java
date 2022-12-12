package excptns;

public class Day {
    private Hours hours;
    private Minutes minutes;

    public Day(Hours hours, Minutes minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Day(int hours, int minutes){
        try{
            this.hours = new Hours(hours);
        }
        catch (WrongValueException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
            try{
                this.hours = new Hours(0);
            }
            catch (WrongValueException e){
            }
        }
        try{
            this.minutes = new Minutes(minutes);
        }
        catch (WrongValueException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
            try{
                this.minutes = new Minutes(0);
            }
            catch (WrongValueException e){
            }
        }
    }

    public void printTime(){
        System.out.println(hours.getHours() + " часов " + minutes.getMinutes() + " минут");
    }

    public void printDayTime(){
        if(hours.getHours() < 6){
            System.out.println("Night");
        }
        if(hours.getHours() >= 6 && hours.getHours() < 12){
            System.out.println("Morning");
        }
        if(hours.getHours() >= 12 && hours.getHours() < 18){
            System.out.println("Day");
        }
        if(hours.getHours() >= 18){
            System.out.println("Evening");
        }
    }
}

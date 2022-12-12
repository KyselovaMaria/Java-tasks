package excptns;

public class WrongNameException extends Exception{
    private String name1;
    private String name2;
    public String getName1(){return name1;}
    public String getName2(){return name2;}

    public WrongNameException(String message, String name1, String name2){
        super(message);
        this.name1 = name1;
        this.name2 = name2;
    }
}

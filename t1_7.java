
public class t1_7 {
    private String username, surname;
    public static void main(String args[]){
        t1_7 obj = new t1_7();

        if(args.length<1){
            System.out.println("Incorrect number of arguments");
        } else {
            obj.username = args[0];
            obj.surname = args[1];
            System.out.println(obj.username);
            System.out.println(obj.surname);
        }
    }
}


/** Represents a t1_8.
 * @author Mariia Kyselova
 * @version 1.0
 * @since 13.09.2022
 */
public class t1_8 {
    /**
     * Username input from command line
     */
    private String username, surname;
    public static void main(String[] args){
        t1_8 obj = new t1_8();

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
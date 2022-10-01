//1.5 - 1.6
public class t1_5 {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println(("Incorrect number of arguments"));
        }
        double sum = 0;
        for(String a:args){
            double x = Double.parseDouble(a);
            sum += x;
        }

        System.out.println("1: "+args[0]);
        System.out.println("2: "+args[1]);
        System.out.println("3: "+args[2]);
        System.out.printf("Sum: %f", sum);
    }
}
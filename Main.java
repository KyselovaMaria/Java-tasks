public class Main {
    static String findRectangle(int x1, int y1,
                                int x2, int y2,
                                int x3, int y3,
                                int x4, int y4)
    {

        int x5,y5,x6,y6;

        if (x1 <= x2)
            x5=x1;
        else
            x5=x2;
        if (y1 <= y2)
            y5=y1;
        else
            y5=y2;

        if (x3 >= x4)
            x6=x3;
        else
            x6=x4;
        if (y3 >= y4)
            y6=y3;
        else
            y6=y4;

       // Pair<String, Integer> pair = Pair.with(x5,y5);
        //var p1= Pair(x5,y5);
        String result = x5 + " " + y5 + " " + x6 + " " + y6 +" " ;
        ///return result;
        //System.out.println(result);

        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        int x1 = -1, y1 = -1,
                x2 = 0, y2 = 0,
                x3 = 1, y3 = 1,
                x4 = 2, y4 = 2;
        //at first coordinates of 1st rctngl, then 2nd
        // points should be written in correct order like in condition of problem
       String res = findRectangle(x1, y1, x2, y2, x3, y3, x4, y4);
       String[] splitStr = res.split("\\s+");
       System.out.println("Result: \nLeft point: "+ splitStr[0] + "," +splitStr[1]);
       System.out.println("Right point: "+ splitStr[2] + "," + splitStr[3]);
    }


}

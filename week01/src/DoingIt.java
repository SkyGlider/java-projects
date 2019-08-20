/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    public DoingIt() {
    }

    public void doIt(Window win){

        int a = 5;
        double b = 20.000007;
        b = a + b;

        boolean a1 = true;
        int k = a-- * a--;


        String k = "a =" + a1;
        System.out.println(k);

        myWindow = win;

        String name = "", outString = "";

        name = myWindow.readIn();
        outString = "Hello " + name + ", \nthe FIT1051 teaching team look forward to introducing you to " +
                "\nthe most popular programming language in the world. JAVA!!!";

        myWindow.clearOut();
        myWindow.writeOut(outString);
        myWindow.clearIn();
        myWindow.writeOut(b);


    }



    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}

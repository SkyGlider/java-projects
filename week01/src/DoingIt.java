/**
 * Created by shuxford on 25/12/2015.
 */
import java.util.ArrayList;

public class DoingIt {
    Window myWindow;

    public DoingIt() {
    }

    public void doIt(Window win){

        int[] test = {-3,2,3,4,5};
        int anothertest = countOdd(test);
        System.out.println(anothertest);

        int[] test1 = {1,2,3};
        int[] test2 = {4,5,6};

        System.out.println(addVectors(test1,test2)[2]);


        myWindow = win;

        String name = "", outString = "";

        name = myWindow.readIn();
        outString = "Hello " + name + ", \nthe FIT1051 teaching team look forward to introducing you to " +
                "\nthe most popular programming language in the world. JAVA!!!";

        myWindow.clearOut();
        myWindow.writeOut(outString);
        myWindow.clearIn();



    }

    private int countOdd(int[] myArray){
        int counter = 0;
        for (int i : myArray){
            if (i%2 !=0){
                counter++;
            }
        }
        return counter;
    }

    private int[] addVectors(int[] first,int[] another){
        int[] newArray = new int[first.length];

        if (first.length != another.length){
            return null;
        }
        else{
            for(int i = 0; i <first.length; i++){
                newArray[i] = first[i] + another[i];
            }
            return newArray;
        }
    }


    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}

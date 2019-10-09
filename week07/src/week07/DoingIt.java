package week07;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    //class level variables here

    public void doIt(Window win){
        myWindow = win;

        //whileForPaste01();
        //whileForPaste02();
        //whileForPaste03();
        //whileForPaste04();

        //forForPaste01();
        //enhancedForForPaste01();
        //videoWhileLoopInfiniteLoop01();

        //I'm leaving you to code and organise your Lab Exercise methods from now on
        myWindow.clearOut();
        lab1();
        lab2();
        lab3();
        lab4();
        lab5();
        lab6();
        lab7();


    }

    //LAB EXERCISES for you to code ===========================================

    private void lab1(){
        myWindow.writeOutLine("Lab 01 here");
        int d1 = -1;
        int d2 = -2;
        int counter = 0;
        while (d1 != d2){
            d1 = getRandom(1,6);
            d2 = getRandom(1,6);
            //myWindow.writeOutLine("1st dice: " + d1 + " 2nd dice: " + d2);
            counter++;
        }
        myWindow.writeOutLine("It took " + counter + " rolls");
    }
    private void lab2(){
        myWindow.writeOutLine("Lab 02 here");
        int[] myIntArray = {1,2,3,4,5};
        int sum = 0;
        int i = 0;
        while (i < myIntArray.length){
            sum += myIntArray[i];
            i++;
        }

        myWindow.writeOutLine("Sum of integers: " + sum);
    }

    private void lab3(){
        //counter controlled
        myWindow.writeOutLine("Lab 03 here");
        int[] myIntArray = {1,2,3,4,5,6};
        int i = 0;
        int sum = 0;

        while (i < myIntArray.length){
            sum += myIntArray[i];
            i++;
        }

        double average =  (double) sum/i;
        myWindow.writeOutLine("Avg of integers: " + average);
        //counter controlled, we have the i value, we know the array legnth
    }

    private void lab4(){
        myWindow.writeOutLine("Lab 04 here");
        int iters = 1000; //number of iterations
        int i = 0;
        int sum = 0;
        while (i < iters){

            int d1 = -1;
            int d2 = -2;
            int counter = 0;
            while (d1 != d2){
                d1 = getRandom(1,6);
                d2 = getRandom(1,6);
                //myWindow.writeOutLine("1st dice: " + d1 + " 2nd dice: " + d2);
                counter++;
            }
            myWindow.writeOutLine("It took " + counter + " rolls on the " + i + " iteration." );
            sum += counter;
            i++;
        }

        double average = (double) sum/iters;
        myWindow.writeOutLine("Average long term rolls: " + average );

        //we know the number of long term iterations
    }
    private void lab5(){

        myWindow.writeOutLine("Lab 05 here");
        String[] myStringArray = {"John","Cena","My Son","Nick","Cena"};
        String searchFor = "Cena";
        int index = -1;

        for (int i = myStringArray.length - 1; i >= 0; i--){

            if (myStringArray[i].equals(searchFor)){
                index = i;
            }
        }
        myWindow.writeOutLine("First occurrence of " + searchFor + " is found at index: " + index );



    }
    private void lab6() {
        myWindow.writeOutLine("Lab 06 here");
        String myString = "";
        int inLineCount = 1;
        int leapYearCount = 0;
        for (int year = 1752; year <= 3000; year++) {
            boolean leapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
            if (leapYear) {


                if (inLineCount == 10) {
                    myString += year;
                    myWindow.writeOutLine(myString);
                    myString = "";
                    inLineCount = 1;
                } else {

                    myString += year + ", ";
                    inLineCount++;
                }
                leapYearCount++;
            }
        }
        myWindow.writeOutLine(myString.substring(0,myString.length()-2));//remove the comma
        myWindow.writeOutLine("Total leap years in the range: " + leapYearCount);
    }

    private void lab7(){
        myWindow.writeOutLine("See other shell");

    }

    //I'm leaving you to code and organise your Lab Exercise methods from now on



    //WORKSHOP CODE for you to play with ======================================
    private void whileForPaste01(){
        int count = 0, total = 0;

        while (total < 1000){
            total += getRandom(1, 6); //see utility methods below
            count++;
        }

        myWindow.clearOut();
        myWindow.writeOutLine("Count: " + count);
    }

    private void whileForPaste02(){
        int counter;
        int limit = 100;
        final int SENTINEL = -1 + (int) (Math.random() * 12); //[-1 .. 10]
        int  value = 0;
        boolean condition = false;

        //use a for loop for best style
        counter = 0; // or 1 depending on statements in loop block
        while (counter <= limit){ //or < or >= or > (== and != are risky, they could be skipped over)

            //process

            counter++; //or some other incrementing/decrementing
        }

        //get initial value from source
        while(value != SENTINEL){ //!value.equals(SENTINEL) for Strings

            //process input

            //get next value from source
        }

        //perform potential condition changing calculations with initial values
        while (condition){

            //process

            //perform potential condition changing calculations with updated values
        }
    }

    private void whileForPaste03(){
        final int SENTINEL = -1;
        int input = -1 + (int) (Math.random() * 12);
        myWindow.clearOut();

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
        input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL) {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        };

        while (input != SENTINEL); {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        }
    }

    private void whileForPaste04(){
        int[] someArray = {1, 2, 3, 4, 5};
        int i;

        i = 0;
        while (i < someArray.length){   // takes care of an empty array
                                        //but not a null array
            // process the ith element using someArray[i] to access its value

            i++;
        }
    }


    private void forForPaste01(){
        final int MULTIPLIER = 7;
        int result;

        myWindow.clearOut();
        for (int i = 10; i >= 1; i--){
            result = i * MULTIPLIER;
            myWindow.writeOutLine("7 X " + i + " = " + result);
        }
    }

    private void enhancedForForPaste01(){
        int [] bigScreenTVMonthlyUnitsSold = {435, 151, 120, 134, 199, 201, 312, 147, 107, 127, 115, 258};
        int monthCount = 0;

        for (int elem : bigScreenTVMonthlyUnitsSold){
            if (elem >= 200)
                monthCount++;

        }

        myWindow.clearOut();
        myWindow.writeOutLine("Number of months: " + monthCount);
    }

    private void videoWhileLoopInfiniteLoop01(){

        int i = 1;

        while (i != 10){
            //process

            i = i + 2;
        }

    }


    //==========================================================================
    // UTILITIES ===============================================================
    //==========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}

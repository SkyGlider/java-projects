package week08;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {


    Window myWindow;

    //IMPORTANT - Window class refactored to instantiate 1 DoingIt object for all Do It button clicks
    //IMPORTANT - not instantiating 1 DoingIt object per Do It button click
    //IMPORTANT - This allows the class level variable "step" to persist between Do It button clicks

    int step = 1; //for method hierarchy example
    int goodCounter = 0; //for countExecutions example

    int counter = 0;

    public void doIt(Window win){
        myWindow = win;

        //caller();
        //AnotherCaller();

        myWindow.clearOut();
        lab01();
        lab02();
        lab03();
        lab04();

        //orchestratingMethod();



        //I'm leaving you to code and organise your Lab Exercise methods from now on
    }

    //LAB EXERCISES for you to code ============================================

    private void lab01(){

        myWindow.writeOutLine("Lab 01 here");
        int[] myIntArray = {1,2,3,4,5};
        int myInt = myIntArray[2];

        String nums = "";
        for(int i : myIntArray){
            nums += i+",";
        }

        myWindow.writeOutLine("The Array before calling = " + nums);
        myWindow.writeOutLine("The Int before calling = " + myInt);

        lab01called(myInt,myIntArray);

        nums = "";
        for(int i:myIntArray){
            nums += i+",";
        }

        myWindow.writeOutLine("The Array after calling = " + nums);
        myWindow.writeOutLine("The Int after calling = " + myInt);
    }

    private void lab01called(int myInt, int[] myIntArray){
        myInt = 67;
        myIntArray[3] = 205;

        String nums = "";
        for(int i:myIntArray){
            nums += i+",";

        }
        myWindow.writeOutLine("The Array during calling = " + nums);
        myWindow.writeOutLine("The Int during calling = " + myInt);
    }

    private void lab02(){

        myWindow.writeOutLine("Lab 02 here");
        int n1 = 25;
        int n2 =100;

        myWindow.writeOutLine("initially : n1 is = " + n1);
        myWindow.writeOutLine("initially : n2 is = " + n2);

        lab02called(n1,n2);
    }

    private void lab02called(int n2, int n1){

        myWindow.writeOutLine("in the called function : n1 is = " + n1);
        myWindow.writeOutLine("in the called function : n2 is = " + n2);

    }

    private void lab03(){

        myWindow.writeOutLine("Lab 03 here");
        for(int i = -1; i<=35; i++){
            String result = daySuffix(i+"");
            myWindow.writeOutLine( i + " : The date you entered is " + result);
        }

        String i2 = "John";
        String result2 = daySuffix(i2);
        myWindow.writeOutLine(i2 + " : The date you entered is " + result2);

        i2 = "@#!";
        result2 = daySuffix(i2);
        myWindow.writeOutLine(i2 + " : The date you entered is " + result2);

        i2 = "10^29";
        result2 = daySuffix(i2);
        myWindow.writeOutLine(i2 + " : The date you entered is " + result2);
    }

    private String daySuffix(String dateIn){

        String mystr = null;
        if (isNumeric(dateIn)){

            double d = Double.parseDouble(dateIn);
            int myInt = (int) Math.round(d);
            if (myInt == 1 || myInt == 21 || myInt == 31 ){
                mystr = myInt + "st";
            }
            else if (myInt == 2 || myInt == 22 ){
                mystr = myInt + "nd";
            }
            else if ( myInt == 3 || myInt == 23){
                mystr = myInt + "rd";
            }
            else if ( myInt >= 1 && myInt <= 31){
                mystr = myInt + "th";
            }
        }
        return mystr;
    }

    private void lab04(){

        myWindow.writeOutLine("Lab 04 here");
        for(int i = 1; i<=10; i++){
            callMe();
        }
    }

    private void callMe(){

        /*
        int insideCounter = 0;
        insideCounter++;
        myWindow.writeOutLine("callMe function is called "+ insideCounter + " times");
        */

        counter++;
        myWindow.writeOutLine("callMe function is called "+ counter + " times");
    }



    //WORKSHOP CODE for you to play with =======================================
    private void caller(){
        double number1 = 7.0;

        myWindow.clearOut();
        myWindow.writeOutLine("Before call to calledNoReturn()");
        calledNoReturn(number1 + 10.0, Math.pow(number1, 2));
        myWindow.writeOutLine("After call to calledNoReturn()");
    }

    private void calledNoReturn(double n1, double n2){
        double sum = 0;
        sum = n1 + n2;
        myWindow.writeOutLine("calledNoReturn begins executing");
        myWindow.writeOutLine("sum of formal parameters is: " + sum);
        myWindow.writeOutLine("calledNoReturn finishes executing");
    }

    private void AnotherCaller(){
        double number1 = 7.0;

        myWindow.clearOut();
        myWindow.writeOutLine("Before call to calledReturn()");
        myWindow.writeOutLine(100.0 + calledReturn(number1 + 10.0, Math.pow(number1, 2)));
        myWindow.writeOutLine("After call to calledReturn()");
    }

    private double calledReturn(double n1, double n2){
        double sum = 0;
        sum = n1 + n2;
        myWindow.writeOutLine("calledReturn begins executing");
        myWindow.writeOutLine("about to execute return statement");
        return sum;
        //myWindow.writeOutLine("calledReturn finishes executing"); unreachable statement
    }


    //==========================================================================
    //METHOD HIERARCHY - EXAMPLE
    private void orchestratingMethod(){ //no display dependency
        String instructions = "";
        instructions += "Enter a comma separated list like: \n";
        instructions += "start table, end table, start range, end range, multiplication symbol.\n";
        instructions += "Then click the Do It! button again.";


        if (step == 1) { //step is class level
            prompt(instructions);
            step = 2;
        }
        else if (step == 2) {
            displayOutput(process(getInput())); //call sequence 1. getInput 2. process 3. displayOutput
            step = -1; //end step sequence
        }
        else{
            //do nothing, step sequence has finished
        }
    }

    private void prompt(String promptToDisplay){
        myWindow.clearOut();
        myWindow.clearIn();

        myWindow.writeOutLine(promptToDisplay);
    }

    private String[] getInput(){
        return myWindow.readIn().split("\\s*,\\s*"); //splits into tokens
    }

    private String process(String[] splitInput){ //no display dependency
        int startTable, stopTable, from, to;
        String symbol;
        String result = "";

        //exception handling should start here
        startTable = Integer.parseInt(splitInput[0]);
        stopTable = Integer.parseInt(splitInput[1]);
        from = Integer.parseInt(splitInput[2]);
        to = Integer.parseInt(splitInput[3]);
        //exception handling should stop here

        symbol = splitInput[4];


        for (int i = startTable; i <= stopTable; i++){
            result += ">>>" + i + " times table\n";
            result += timesTable(i, from, to, symbol) + "\n";
        }

        return result;
    }

    private void displayOutput(String toDisplay){
        myWindow.clearOut();
        myWindow.writeOutLine(toDisplay);
    }

    private String timesTable(int tableNumber, int from, int to, String timesSymbol){
        return "1 x 2 = 2\n2 x 2 = 4\n"; //dummy code to give a dummy list
    }

    /*
    private String timesTable(int tableNumber, int from, int to, String timesSymbol){
        String table = "";

        for (int i = from; i <= to; i++){
            table += String.format("%3d %s %3d = %3d\n", i, timesSymbol, tableNumber, i * tableNumber);
        }

        return table;
    }

     */

    //==========================================================================


    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}

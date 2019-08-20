/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;
    int total;

    public void doIt(Window win){
        myWindow = win;


        //ex01();
        //ex02();
        //ex03();
        //ex04();

        //firstExample();
        //secondExample();
        //constants();
        //dataTypesExamples();
        //dataTypesConversions();
        //testing();
    }

    private void ex01(){
        //<<<Documentation for methods of the Window class>>>
        //that can be applied to the instance of Window referenced by the variable myWindow
        //myWindow.clearOut()               clears all text from the output text area
        //myWindow.readIn()                 returns as a String whatever text is in the input text area
        //myWindow.writeOut(someExp)        displays its expression parameter but does NOT throw a line
        //myWindow.writeOutLine(someExp)    displays its expression parameter but does throw a line

        //the two write methods will except any value of a primitive type and display the String version of the value
        //how this kind of flexibility is implemented and what is the String version of a non-String value
        //are topics for much later
        //<<<end>>>

        //YOUR CODE BELOW HERE
        String a = myWindow.readIn();

        myWindow.clearOut();
        myWindow.writeOut("There is no new line after this");
        myWindow.writeOutLine("There is a new line after this");
        myWindow.writeOutLine("You wrote : " + a);
        myWindow.writeOutLine(myWindow.readIn());

        //YOUR CODE ABOVE HERE
    }

    private void ex02(){
        //YOUR CODE BELOW HERE
        myWindow.clearOut();

        myWindow.writeOutLine(1);
        myWindow.writeOutLine(2);
        myWindow.writeOutLine(1+2);


        double num1 = 1;
        double num2 = 2;
        double sum1 = num1 + num2;

        myWindow.writeOutLine(num1);
        myWindow.writeOutLine(num2);
        myWindow.writeOutLine(sum1);


        double num3 = 1;
        double sum2 = num3;
        myWindow.writeOutLine(num3);
        num3 =2;
        myWindow.writeOutLine(num3);
        sum2 = sum2 + num3;
        myWindow.writeOutLine(sum2);


        myWindow.writeOutLine("ex02 here");
        //YOUR CODE ABOVE HERE
    }

    private void ex03(){
        //YOUR CODE BELOW HERE
        myWindow.clearOut();

        int numFloors =27;
        int numFloorsConst = 3;
        int userInput =  70;
        boolean doorLocked = true;
        int studentsEnrolled = 205;
        double myWeight = 70;
        double waterVolume = 1000;
        int postCode =  47500;
        String marketState = "bear";

        myWindow.writeOutLine("Number of Floors : " + numFloors);
        myWindow.writeOutLine("Number of Floors under construction : " + numFloorsConst);
        myWindow.writeOutLine("What you entered : " + userInput);

        if (doorLocked){
            myWindow.writeOutLine("Door is locked");
        }
        else{
            myWindow.writeOutLine("Door is unlocked");
        }

        myWindow.writeOutLine("Number of Students enrolled = " + studentsEnrolled);
        myWindow.writeOutLine("My weight is " + myWeight + "kg");
        myWindow.writeOutLine("Weight of 1 litre of water is " + waterVolume*1);
        myWindow.writeOutLine("My post code is " + postCode);
        myWindow.writeOutLine("The current market is " + marketState);

        myWindow.writeOutLine("ex03 here");
        //YOUR CODE ABOVE HERE
    }

    private void ex04(){
        //YOUR CODE BELOW HERE
        myWindow.clearOut();
        int a = 25;
        double b = 2.5;
        String c = "123";
        boolean d = true;

        a = b;
        a = (int) b;//cast, fractional part lost
        //a = c;
        //a = (int) c;
        //a = d;
        //a = (int) d;

        b = a; //automatic
        b = (double) a;
        //b = c;
        //b = (double) c;
        //b = d;
        //b = (double) d;

        //c = a;
        //c = (String) a;
        //c = b;
        //c = (String) b;
        c = c + a + b;
        //c = d;

        //d = a;
        //d = b;
        //d = c;

        myWindow.writeOutLine(c);
        myWindow.writeOutLine("ex04 here");
        //YOUR CODE ABOVE HERE
    }

    //SYNTAX TEMPLATES
    //dataType variableName [= dataValue][, variableName [= dataValue] ]…;
    //variableName = expression;
    //final dataType CONST_NAME [= dataValue][, CONST_NAME[= dataValue] ]…;

    //WORKSHOP CODE
    private void firstExample(){
        String firstName = "Stephen";   //declaration and initial assignment
        String lastName, fullName;      //declaration only

        myWindow.clearOut();            //clear display

        lastName = "Huxford";           //assignment of String literal

        fullName = firstName + " " + lastName;  //assignment of String expression

        myWindow.writeOutLine(fullName); //write to display
        //lastName = firstName;
        //firstName = lastName;
        //“Huxford” = lastName;
        //fullName = "Dear " + fullName;
    }

    private void secondExample(){
        int number1; //declarations first in a method
        int sum;

        myWindow.clearOut();

        //myWindow.writeOutLine(number); //error
        //myWindow.writeOutLine(number1); //error

        number1 = 7;
        myWindow.writeOutLine(number1);

        number1 = number1 + 1; //mathematical impossibility
        myWindow.writeOutLine(number1);

        myWindow.writeOutLine(number1 + 11); //bad style, calculate then display
        sum = number1 + 11;
        myWindow.writeOutLine(number1 + 11);

        myWindow.writeOutLine(number1); //variable value unchanged
    }

    private void constants(){
        final int NUMBER_OF_DEPARTMENTS = 39;

        //NUMBER_OF_DEPARTMENTS = 40; error
    }

    private void dataTypesExamples(){
        char myChar, firstInitial = 'S', fullStop = '.';
        int enrolledStudents = 100, total = 0;
        double weightInKilos, totalWeightInKilos = 0.0;
        boolean testResult = false;

        myWindow.clearOut();
        myWindow.writeOutLine("First initial is " + firstInitial + fullStop);
        myWindow.writeOutLine("Number of enrolled students: " + enrolledStudents + fullStop);
        myWindow.writeOutLine("Test result was " + testResult + fullStop);
    }

    private void dataTypesConversions(){
        float money;
        int dollars = 3; //IDE tells me this var is redundant

        money = dollars; //widening conversion OK, loss of accuracy

        double sum = 17.0, result;
        int count = 10;

        result = sum / count; //copy of count promoted to double

        double moreMoney = 5.67;
        int moreDollars = 3;

        //moreDollars = moreMoney; //type mismatch compiler error reported
        moreDollars = (int) moreMoney; //cast forces conversion with truncation

        String digitString = "123";
        int intTarget;

        //target = (int) "123"; // error inconvertible types

        boolean found = true;
        float floatTarget;

        //floatTarget = (float) found;

    }

    private void testing(){
        myWindow.clearOut();
//
//        double d = 0.1, result = 0.0;
//
//        for (int i = 0; i <=10000000; i++)
//            result += d;
//
//
//        myWindow.writeOutLine("10 million * 0.1 = " + result + " (whooops!!!)");

//        final int MINUTES_IN_AN_HOUR = 60;
//        final int HOURS_IN_A_DAY = 24;
//        final int DAYS_IN_FEBRUARY =29;
//
//        int minutesInMonth = MINUTES_IN_AN_HOUR * HOURS_IN_A_DAY * DAYS_IN_FEBRUARY;

    }


    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}

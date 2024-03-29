package week04;

/**
 * Created by shuxford
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;

        lab1();
        lab2();
        lab3();
        lab4();
        lab5();
        lab6();
        lab7();
        lab8();

//        assignmentIsAnOperator();
//        arithmeticOperations();
//        equalityRelationalOperators();
//        equalityRelationalOperators2();
//        logicalOperators();
//        redundantSyntax();
//        blockScopeTest();
    }

    //LAB EXERCISES for you to code
    private void lab1(){
        myWindow.clearOut();
        myWindow.writeOutLine("EX01");
        int n1 = 20;
        int n2 = 21;
        int n3 = -13;
        int n4 = -6;
        myWindow.writeOutLine(n1 + " is even : " + (n1%2 == 0));
        myWindow.writeOutLine(n2 + " is even : " + (n2%2 == 0));
        myWindow.writeOutLine(n3 + " is even : " + (n3%2 == 0));
        myWindow.writeOutLine(n4 + " is even : " + (n4%2 == 0));
    }

    private void lab2(){
        myWindow.writeOutLine("EX02");
        int n1 = 20;
        int n2 = 21;
        int n3 = -20;
        int n4 = -21;
        myWindow.writeOutLine(n1 + " is negative and odd : " + (n1%2 != 0 && n1<0));
        myWindow.writeOutLine(n2 + " is negative and odd : " + (n2%2 != 0 && n2<0));
        myWindow.writeOutLine(n3 + " is negative and odd : " + (n3%2 != 0 && n3<0));
        myWindow.writeOutLine(n4 + " is negative and odd : " + (n4%2 != 0 && n4<0));
    }

    private void lab3(){
        myWindow.writeOutLine("EX03");
        myWindow.writeOutLine("Number between 1 and 100, not even number between 40 to 50 inclusive");
        int n1 = 20;
        int n2 = 42;
        int n3 = 41;
        int n4 = 102;
        int n5 = -69;
        myWindow.writeOutLine(n1 + " meet the requirement : " + (n1 >= 0 && n1 <= 100 && !(n1 >= 40 && n1 <= 50 && n1%2 == 0)));
        myWindow.writeOutLine(n2 + " meet the requirement : " + (n2 >= 0 && n2 <= 100 && !(n2 >= 40 && n2 <= 50 && n2%2 == 0)));
        myWindow.writeOutLine(n3 + " meet the requirement : " + (n3 >= 0 && n3 <= 100 && !(n3 >= 40 && n3 <= 50 && n3%2 == 0)));
        myWindow.writeOutLine(n4 + " meet the requirement : " + (n4 >= 0 && n4 <= 100 && !(n4 >= 40 && n4 <= 50 && n4%2 == 0)));
        myWindow.writeOutLine(n5 + " meet the requirement : " + (n5 >= 0 && n5 <= 100 && !(n5 >= 40 && n5 <= 50 && n5%2 == 0)));
    }

    private void lab4(){
        myWindow.writeOutLine("EX04");
        myWindow.writeOutLine("Does the following word contain y, Y , n or N?");
        String userIn = "long";
        myWindow.writeOutLine(userIn + " : " + (userIn.contains("y") || userIn.contains("Y") || userIn.contains("n") || userIn.contains("N") ));
        userIn = "loNg";
        myWindow.writeOutLine(userIn +" : " + (userIn.contains("y") || userIn.contains("Y") || userIn.contains("n") || userIn.contains("N")) );
        userIn = "joy";
        myWindow.writeOutLine(userIn +" : " + (userIn.contains("y") || userIn.contains("Y") || userIn.contains("n") || userIn.contains("N")) );
        userIn = "joY";
        myWindow.writeOutLine(userIn +" : " + (userIn.contains("y") || userIn.contains("Y") || userIn.contains("n") || userIn.contains("N")) );
        userIn = "jho low";
        myWindow.writeOutLine(userIn +" : " + (userIn.contains("y") || userIn.contains("Y") || userIn.contains("n") || userIn.contains("N")) );

    }

    private void lab5(){
        myWindow.writeOutLine("EX05");
        String userIn = "lol  funny";
        myWindow.writeOutLine(userIn + " is not done : " +!(userIn.equals("done")));
        userIn = "not done";
        myWindow.writeOutLine(userIn + " is not done : " +!(userIn.equals("done")));
        userIn = "done";
        myWindow.writeOutLine(userIn + " is not done : " +!(userIn.equals("done")));

    }

    private void lab6(){
        myWindow.writeOutLine("EX06");
        int year = 2100;

        boolean b  = year % 4 ==0 && year % 100!=0 || year % 400==0;

        int year = 2100;
        myWindow.writeOutLine(year + " is leap year : " +( year%4 == 0 && !(year%100 == 0) || year%400 == 0) ;
         year = 2016;
        myWindow.writeOutLine(year + " is leap year : " + (year%4 == 0 && (!(year%100 == 0) || year%400 == 0)) );
         year = 2019;
        myWindow.writeOutLine(year + " is leap year : " + (year%4 == 0 && (!(year%100 == 0) || year%400 == 0)) );
         year = 2000;
        myWindow.writeOutLine(year + " is leap year : " + (year%4 == 0 && (!(year%100 == 0) || year%400 == 0)) );


    }

    private void lab7(){
        myWindow.writeOutLine("EX07");
        boolean a = true;
        boolean b = false;
        myWindow.writeOutLine("initial a : " + a);
        myWindow.writeOutLine("initial b : " + b);
        boolean c = a;
        a = b;
        b = c;
        myWindow.writeOutLine("final a : " + a);
        myWindow.writeOutLine("final b : " + b);
    }

    private void lab8(){
        myWindow.writeOutLine("EX08");
        double a = 2;
        double b = 3;
        double c = 1;
        myWindow.writeOutLine("The roots of " + a + "x^2 + " + b + "x + " + c + " are ");
        double dcmt = Math.pow(b,2) - 4*a*c;
        double numerator1 = -b + Math.sqrt(dcmt);
        double numerator2 = -b - Math.sqrt(dcmt);

        double root1 = numerator1/(2*a);
        double root2 = numerator2/(2*a);


        myWindow.writeOutLine("root 1 (expect -0.5) : " + root1);
        myWindow.writeOutLine("root 2 (expect -1): " + root2);
    }



    //WORKSHOP CODE for you to play with
    private void assignmentIsAnOperator(){
        int testInt;
        myWindow.clearOut();
        myWindow.writeOutLine(testInt = 123);
    }

    private void arithmeticOperations(){
        //using literals to keep things clear but could have used variables
        int i1, i2, i3; //these are reused multiple times for multiple uses in this method which is poor style in real code

        myWindow.clearOut();

        myWindow.writeOutLine(1.0 / 2.0);
        myWindow.writeOutLine(1 / 2);
        myWindow.writeOutLine((double) 1 / 2);

        myWindow.writeOutLine(7 % 3);
        myWindow.writeOutLine(7 % 8);

//        int counter = 0;
//        counter = counter + 1;
//        ++counter; //pre increment
//        counter++; //post increment
//
//        counter = counter - 1;
//        --counter; //pre decrement
//        counter--; //post decrement

        myWindow.writeOutLine("");
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + ++i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2++);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + --i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2--);

        double totalSales = 0, thisSale;
        thisSale = 5.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);
        thisSale = 7.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);

//        totalSales = totalSales + thisSale;
//        totalSales += thisSale;

        myWindow.writeOutLine("");
        double pi = Math.PI;                        //no parenthesis after PI ???
        myWindow.writeOutLine(Math.floor(pi));
        myWindow.writeOutLine(Math.pow(2.0, 20));   //1MByte
        //double calculations are inaccurate
        myWindow.writeOutLine(Math.sin(2.0 * pi));
        myWindow.writeOutLine(Math.abs(-pi));

        myWindow.writeOutLine("");

        i1 = 1; i2 = 2; i3 = 3;

        myWindow.writeOutLine(i1 + i2 * i3);
        myWindow.writeOutLine((i1 + i2) * i3);
    }

    private void equalityRelationalOperators(){
        double d1 = 1.23, d2 = 3.45;
        double delta = 0.00000001;
        String s1 = "dog", s2;

        s2 = myWindow.readIn(); //assume the string dog is input

        myWindow.clearOut();
        //remember floating points are stored inaccurately
        myWindow.writeOutLine("d1 == d2: " + (d1 == d2));   //false, maybe
        myWindow.writeOutLine("d1 != d2: " + (d1 != d2));   //true, maybe
        //inner parentheses essential in the next statement. Why?
        myWindow.writeOutLine("d1 < d2: " + (d1 < d2));     //true, maybe
        myWindow.writeOutLine("d1 <= d1: " + (d1 <= d1));   //true, maybe

        //allowing for floating point inaccuracy
        myWindow.writeOutLine((d2 - d1) < delta);

        myWindow.writeOutLine("s1 == s2: " + (s1 == s2));   //false, huh!!!


    }

    private void equalityRelationalOperators2(){

        String s1 = "dog", s2, s3 = "dOg", s4 = "dogs)";

        s2 = myWindow.readIn(); //the string dog is input

        myWindow.clearOut();
        myWindow.writeOutLine("s1.equals(s2): " + s1.equals(s2));   //hooray!
        myWindow.writeOutLine("!s1.equals(s2): " + !s1.equals(s2)); //
        myWindow.writeOutLine("s1.equals(s3): " + s1.equals(s3));   //case sensitive
        //next statement: true, case insensitive
        myWindow.writeOutLine("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));

        myWindow.writeOutLine("s1.compareTo(s4): " + s1.compareTo(s4));  // -ve
        myWindow.writeOutLine("s4.compareTo(s1): " + s4.compareTo(s1));  // +ve
        myWindow.writeOutLine("s1.compareTo(s2): " + s1.compareTo(s2));  // 0

        myWindow.writeOutLine("s1.compareTo(s3): " + s1.compareTo(s3));  // +ve
        //next statement: 0 i.e. s1 = s2
        myWindow.writeOutLine("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));

    }

    private void logicalOperators(){

        int low = 50, high = 100; //inclusive
        int testValue1 = 99, testValue2 = 101;
        boolean firstTest, secondTest;

        myWindow.clearOut();

        firstTest = testValue1 >= low && testValue1 <= high; //in test
        secondTest = testValue1 < low || testValue1 > high; //out test
        myWindow.writeOutLine("testValue1 in range: " + firstTest);
        myWindow.writeOutLine("testValue1 out of range: " + secondTest);

        myWindow.writeOutLine("");
        firstTest = testValue2 >= low && testValue2 <= high; //in test
        secondTest = testValue2 < low || testValue2 > high; //out test
        myWindow.writeOutLine("testValue2 in range: " + firstTest);
        myWindow.writeOutLine("testValue2 out of range: " + secondTest);

        //short circuiting
        int i = 0;
        myWindow.writeOutLine("");
        myWindow.writeOutLine(5 < 3 && (++i > 100));
        myWindow.writeOutLine(i);
    }

    private void redundantSyntax(){
        boolean myBoolean = true;
        boolean result;

        result = myBoolean = true;
        result = myBoolean != true;
    }

    private void blockScopeTest(){
        int outer = 1;

        myWindow.clearOut();

        myWindow.writeOutLine("outer: " + outer);
        //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
        //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope
        {
            int inner1 = 2;
            myWindow.writeOutLine("outer: " + outer);
            myWindow.writeOutLine("inner1: " + inner1);
            //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope

        }

        {
            int inner2 =3;
            myWindow.writeOutLine("outer: " + outer);
            //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
            myWindow.writeOutLine("inner2: " + inner2);
        }
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

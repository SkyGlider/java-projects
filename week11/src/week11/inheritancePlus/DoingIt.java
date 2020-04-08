package week11.inheritancePlus;


/**
 * Created by shuxford
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;

        //payrollSystemDriverTest();
        LabEx1Test();
    }

    private void payrollSystemDriverTest() {
        //INHERITANCE DEMO DRIVER CODE =================================================================================
        // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        myWindow.clearOut();
        myWindow.writeOutLine("Employees processed individually:\n");

        //objects are pointed at by a reference of the same class, the implicit toString of each subclass executes because of overriding
        myWindow.writeOutLine(String.format("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings()));
        myWindow.writeOutLine(String.format("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings()));
        myWindow.writeOutLine(String.format("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings()));
        myWindow.writeOutLine(String.format("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings()));
    }

    private void LabEx1Test(){
        double[] thisWeeksSchedule = {0.0, 0.0, 0.0, 4.0, 0.0, 0.0, 0.0, 2.0}; //0th index not used Monday is 1 etc.


        myWindow.clearOut();

        SalariedPlusOnCallEmployee salCallIn =
                new SalariedPlusOnCallEmployee("fName", "lName", "78787878", 2000.00, thisWeeksSchedule);

     //   salCallIn.setSchedule(new double[]{0.0, -1200.0, 0.0, 4.0, 0.0, 0.0, 0.0, 2.0});
     //   salCallIn.setSchedule(new double[]{0, 2000.0, 0.0, 4.0, 0.0, 0.0, 0.0, 2.0});
       // salCallIn.setSchedule(new double[]{0,0,1,2});
        //salCallIn.setSchedule(new double[]{});

        salCallIn.addWorkRecord(4.0, 100.0, 3);
        salCallIn.addWorkRecord(2.0, 200.0, 7);
        salCallIn.addWorkRecord(2.0, 200.0, 7);
//        salCallIn.addWorkRecord(60,200,1);
//        salCallIn.addWorkRecord(1,100,8);
//        salCallIn.addWorkRecord(2,1,3);


        myWindow.writeOutLine(salCallIn);

        if (salCallIn.checkWorkRecords())
            myWindow.writeOutLine("earnings: " + salCallIn.earnings());
        else
            myWindow.writeOutLine("E R R O R - Schedule violation");

    }



}

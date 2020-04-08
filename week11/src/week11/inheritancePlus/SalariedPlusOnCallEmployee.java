package week11.inheritancePlus;

import java.util.ArrayList;

public class SalariedPlusOnCallEmployee extends SalariedEmployee {



    private double[] schedule = {0,0,0,0,0,0,0,0};
    private ArrayList<WorkRecord> workRecordList;


    public SalariedPlusOnCallEmployee(String first, String last, String ssn, double salary,double[] schedule) {
        super(first, last, ssn, salary);
        setSchedule(schedule);
        workRecordList = new ArrayList<WorkRecord>();
    }

    public double[] getSchedule() {
        return schedule;
    }

    public boolean setSchedule(double[] schedule) {
        boolean success = false;
        if (schedule.length == 8){
            success = true;
            for(int i = 0; i < schedule.length; i++){
                if (schedule[i] > WorkRecord.maxWorkingHours || schedule[i] < 0){
                    success = false;

                }

            }
        }
        if(success){
            this.schedule = schedule;
        }else{
            System.out.println("Invalid schedule, previous schedule remained : " + scheduleToString());
        }
        return success;
    }

    public boolean addWorkRecord(double hours, double agreedHourlyRate, int dayCode){

        if ( hours > 1 && hours < WorkRecord.maxWorkingHours && dayCode >= 1 && dayCode <= 7 && agreedHourlyRate > WorkRecord.minimumWage){
            WorkRecord newRecord = new WorkRecord(hours,dayCode,agreedHourlyRate);
            workRecordList.add(newRecord);
            return true;
        }else{
            System.out.println("bad work record");
        }
        return false;
    }

    public boolean checkWorkRecords(){

        boolean valid = true;

        double[] tempArray = new double[8];
        for (int i = 0; i < schedule.length; i++) {
            tempArray[i] = schedule[i];
        }

        for (int i = 0; i < workRecordList.size(); i++) {
            WorkRecord theRecord = workRecordList.get(i);
            int theDay = theRecord.getDayCode();
            double theHoursWorked = theRecord.getHours();
            tempArray[theDay] -= theHoursWorked;
            if (tempArray[theDay] < 0){
                System.out.println(super.getFirstName() + " " + super.getLastName() + " exceeded the allowed call in hours on day code " + theDay);
                valid = false;
            }
        }
        return valid;
    }

    @Override
    public double earnings() {

        double totalOnCallEarnings = 0;

        for (int i = 0; i < workRecordList.size() ; i++) {
            WorkRecord theRecord = workRecordList.get(i);
            totalOnCallEarnings += theRecord.getHours() * theRecord.getAgreedHourlyRate();
        }
        return super.earnings() + totalOnCallEarnings;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + scheduleToString() + "\n" + workRecordToString() ;
    }

    public String workRecordToString(){
        String output =  "[ ";
        for (int i = 0; i < workRecordList.size(); i++) {
            output += workRecordList.get(i);
            if(i != workRecordList.size() -1){
                output += " , ";
            }
        }
        output += " ]";
        return output;
    }

    public String scheduleToString(){
        String output =  "[ ";
        for (int i = 1; i < schedule.length; i++) {
            output += "day " + i + " : " + schedule[i] + " hrs";
            if (i != schedule.length -1){
                output += ", ";
            }
        }
        output += " ]";
        return output;
    }


}

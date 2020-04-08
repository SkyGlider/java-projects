package week11.inheritancePlus;

public class WorkRecord {

    private double hours;
    private int dayCode;
    private double agreedHourlyRate;
    public static double minimumWage = 20;
    public static double maxWorkingHours = 15;

    public WorkRecord(double hours, int dayCode, double agreedHourlyRate) {
        setHours(hours);
        setDayCode(dayCode);
        setAgreedHourlyRate(agreedHourlyRate);
    }

    public WorkRecord(){
        setHours(1);
        setDayCode(1);
        setAgreedHourlyRate(200);
    }


    public double getHours() {
        return hours;
    }

    public boolean setHours(double hours) {

        boolean success = false;
        if( hours > 0 && hours < maxWorkingHours){
            this.hours = hours;
            success = true;
        }
        return success;
    }

    public int getDayCode() {
        return dayCode;
    }

    public boolean setDayCode(int dayCode) {
        boolean success = false;
        if(dayCode >= 1 && dayCode <= 7){
            this.dayCode = dayCode;
            success = true;
        }
        return success;
    }

    public double getAgreedHourlyRate() {
        return agreedHourlyRate;
    }

    public boolean setAgreedHourlyRate(double agreedHourlyRate) {
        boolean success = false;
        if(agreedHourlyRate > minimumWage ){
            this.agreedHourlyRate = agreedHourlyRate;
            success = true;
        }
        return success;
    }

    public double payOut(){
        return agreedHourlyRate * hours;
    }

    public String toString(){
        return "Hours:  " + this.hours +  ", Agreed rate: " +  this.agreedHourlyRate +  ", Day code: " + this.dayCode ;
    }


}

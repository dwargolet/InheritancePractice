package my.concrete;


public class HourlyEmployee extends Employee {

    private int avgWorkHours;
    //properties     
    public HourlyEmployee(String empName, String empNumber, String empContactNum) {
        super (empName, empNumber, empContactNum);
    }
    
    @Override
    public void earningMethod(){
        System.out.println("The employee is paid by the hour.");
    }
    //I realize this is a poor method to have, for the sake of this exercise I'm using
    //type of employment as a parent method that would differ between employees    
    @Override
    public void employeePartorFull(){
        System.out.println("The employee is part-time");
    }
    
    public int getAvgWorkHours(){
        return avgWorkHours;
    }
    
    public void setAvgWorkHours(int avgWorkHours){
        this.avgWorkHours = avgWorkHours;
    }
    
}

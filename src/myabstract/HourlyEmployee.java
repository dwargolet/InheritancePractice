package myabstract;

public class HourlyEmployee extends Employee{

    private int avgWorkHours;
    public HourlyEmployee(String empName, String empNumber, String empContactNum) {
        super (empName, empNumber, empContactNum);
    }

    public int getAvgWorkHours() {
        return avgWorkHours;
    }

    public void setAvgWorkHours(int avgWorkHours) {
        this.avgWorkHours = avgWorkHours;
    }
    
    @Override
    public void earningMethod(){
        System.out.println("The employee is paid by the hour.");
    }
    
    @Override
    public void employeePartorFull(){
        System.out.println("The employee is part-time");
    }
    
    
    
}

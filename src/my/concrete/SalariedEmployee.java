package my.concrete;

public class SalariedEmployee extends Employee {

    //for this purporse, thousand is assumed, only entering 50, 40 ect..    
    private int yearlySalary;
    
    public SalariedEmployee(String empName, String empNumber, String empContactNum) {
        super(empName, empNumber, empContactNum);
    }

    public int getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(int yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
    public void yearlyEarnings(){
        System.out.println("Yearly Salary: " + yearlySalary + "k a year.");
    }
    
    @Override
    public void earningMethod(){
        System.out.println("The employee is paid by salary.");
    }
    
    @Override
    public void employeePartorFull(){
        System.out.println("The employee is full time");
    }
    
        
}

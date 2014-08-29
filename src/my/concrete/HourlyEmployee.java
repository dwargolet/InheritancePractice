package my.concrete;


public class HourlyEmployee extends Employee {

        
    public HourlyEmployee(String empName, String empNumber, String empContactNum) {
        super (empName, empNumber, empContactNum);
    }
    
    @Override
    public void earningMethod(){
        System.out.println("The employee is paid by the hour.");
    }
    
    
}

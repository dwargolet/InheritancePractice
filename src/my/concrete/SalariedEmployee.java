package my.concrete;


public class SalariedEmployee extends Employee {

    public SalariedEmployee(String empName, String empNumber, String empContactNum) {
        super(empName, empNumber, empContactNum);
    }
    
    
    @Override
    public void earningMethod(){
        System.out.println("is paid by salary.");
    }
    
    
    
    
    
}

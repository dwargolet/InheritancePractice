package my.concrete;


public class Employee {
    
    private String empName = "";
    private String empNumber = "";
    private String empContactNum = "";

    public Employee(String empName, String empNumber, String empContactNum) {
        this.empName = empName;
        this.empNumber = empNumber;
        this.empContactNum = empContactNum;
    }

    public void earningMethod(){
        System.out.println("You work for free");
    }
    
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        
        //validates that the id adheres to the fictitious company standard
        if(empNumber.length() != 6){
            System.out.println("Employee ID must be 6 characters long");
        }
        
        this.empNumber = empNumber;
    }

    public String getEmpContactNum() {
        return empContactNum;
    }

    public void setEmpContactNum(String empContactNum) {
        
        //validates that the contact number is a valid united states phone number
        //includes the dashes for now
        if(empContactNum.length() != 12){
            System.out.println("Please enter a valid phone number");
        }
        
        this.empContactNum = empContactNum;
    }
    
    
    
    
    
}

package myabstract;

public abstract class Employee {
    
    private String empName = "";
    private String empNumber = "";
    private String empContactNum = "";

    public Employee(String empName, String empNumber, String empContactNum) {
        this.empName = empName;
        this.empNumber = empNumber;
        this.empContactNum = empContactNum;
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
        this.empNumber = empNumber;
    }

    public String getEmpContactNum() {
        return empContactNum;
    }

    public void setEmpContactNum(String empContactNum) {
        this.empContactNum = empContactNum;
    }
    
    public abstract void employeePartorFull();
    
    public abstract void earningMethod();
    
    public void generateReport(){
        System.out.println(" ");
        System.out.println("Employee number: " + empNumber);
        System.out.println(empName + " can be reached at "  + empContactNum);
    }
    
}

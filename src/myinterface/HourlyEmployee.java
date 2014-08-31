package myinterface;


public class HourlyEmployee implements Employee{

    private String empName = "";
    private String empNumber = "";
    private String empContactNum = "";
    private int avgWorkHours;
    public HourlyEmployee(String empName, String empNumber, String empContactNum) {
        this.empName = empName;
        this.empNumber = empNumber;
        this.empContactNum = empContactNum;
    }
    
    public int getAvgWorkHours() {
        return avgWorkHours;
    }

    public void setAvgWorkHours(int avgWorkHours) {
        this.avgWorkHours = avgWorkHours;
    }
    
    @Override
    public String getEmpName() {
        return empName;
    }
    @Override
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    @Override
    public String getEmpNumber() {
        return empNumber;
    }
    @Override
    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }
    @Override
    public String getEmpContactNum() {
        return empContactNum;
    }
    @Override
    public void setEmpContactNum(String empContactNum) {
        this.empContactNum = empContactNum;
    }
    
    @Override
    public void earningMethod(){
        System.out.println("The employee is paid by the hour.");
    }
    
    @Override
    public void employeePartorFull(){
        System.out.println("The employee is part-time");
    }
    
    public void generateReport(){
        System.out.println(" ");
        System.out.println("Employee number: " + empNumber);
        System.out.println(empName + " can be reached at "  + empContactNum);
    }

    
    
}

package myinterface;


public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    
    private int commissionPercent;
    public SalaryPlusCommissionEmployee(String empName, String empNumber, String empContactNum) {
        super(empName, empNumber, empContactNum);
    }
    
    public int getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(int commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public void empComissionPercent(){
        System.out.println("Percent earned on commission: " + commissionPercent
        + "%");
    }
    
    
    
}

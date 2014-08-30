package my.concrete;

/**
 *
 * @author Daniel
 */
public class Startup {
    
    public static void main(String[] args) {
    
    System.out.println("-Hourly Employee Data-");
    
    HourlyEmployee emp1 = new HourlyEmployee("Bruce Willis", "13456", 
            "262-968-6900");
    
    emp1.generateReport();
    emp1.employeePartorFull();
//sets the class specific property
    emp1.setAvgWorkHours(20);
    
//grabs the overridden method
    emp1.earningMethod();
    System.out.println("Average hours worked weekly: " + emp1.getAvgWorkHours());
    System.out.println(" ");
    System.out.println("-Salaried Employee Data-");
    
    SalariedEmployee sEmp = new SalariedEmployee("Denzel Washington", "98765", 
            "262-470-7500");
    
    sEmp.generateReport();
    sEmp.employeePartorFull();
    sEmp.earningMethod();
    sEmp.setYearlySalary(55);
    sEmp.yearlyEarnings();
    
    System.out.println(" ");
    System.out.println("-Salaried Employee + Commission Data-");
    
    SalaryPlusCommissionEmployee empSalCom = new SalaryPlusCommissionEmployee
        ("Sherlock Holmes", "85206", "800-141-5443");
    
    empSalCom.generateReport();
    empSalCom.employeePartorFull();
    empSalCom.earningMethod();
    empSalCom.setYearlySalary(60);
    empSalCom.yearlyEarnings();
    empSalCom.setCommissionPercent(5);
    empSalCom.empComissionPercent();
    
    
    }
}
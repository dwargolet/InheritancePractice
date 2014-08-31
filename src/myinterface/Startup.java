package myinterface;


public class Startup {
   
    public static void main(String[] args) {
    
        System.out.println("-Hourly Employee Data-");
        
        HourlyEmployee emp1 = new HourlyEmployee("Bob Hopkins", "78934", 
                "899-456-3698");
        
        emp1.generateReport();
        emp1.employeePartorFull();
        emp1.setAvgWorkHours(32);
        emp1.earningMethod();
        System.out.println("Average hours worked weekly: " + emp1.getAvgWorkHours());
        System.out.println(" ");    
        System.out.println("-Salaried Employee Data-");
        
        SalariedEmployee sEmp = new SalariedEmployee("Dave Chappelle", "48320", 
                "262-968-5335"){};


        sEmp.generateReport();
        sEmp.employeePartorFull();
        sEmp.earningMethod();
        sEmp.setYearlySalary(80);
        sEmp.yearlyEarnings();

        System.out.println(" ");
        System.out.println("-Salaried Employee + Commission Data-");     

        SalaryPlusCommissionEmployee empSalCom = new SalaryPlusCommissionEmployee
            ("Eddy Murphy", "68234", "800-472-7833");

        empSalCom.generateReport();
        empSalCom.employeePartorFull();
        empSalCom.earningMethod();
        empSalCom.setYearlySalary(42);
        empSalCom.yearlyEarnings();
        empSalCom.setCommissionPercent(9);
        empSalCom.empComissionPercent();
        
    }
}

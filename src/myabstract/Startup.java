package myabstract;


public class Startup {

     public static void main(String[] args) {
    
    System.out.println("-Hourly Employee Data-");
    HourlyEmployee emp1 = new HourlyEmployee("Joe Shark", "96348", 
            "262-698-4568");
    
    emp1.generateReport();
    emp1.employeePartorFull();
    emp1.setAvgWorkHours(32);
    emp1.earningMethod();
    System.out.println("Average hours worked weekly: " + emp1.getAvgWorkHours());
    System.out.println(" ");    
    System.out.println("-Salaried Employee Data-");
    
    
    SalariedEmployee sEmp = new SalariedEmployee("Matt Damon", "32567", 
            "262-871-0235"){};
    

    sEmp.generateReport();
    sEmp.employeePartorFull();
    sEmp.earningMethod();
    sEmp.setYearlySalary(45);
    sEmp.yearlyEarnings();
    
    System.out.println(" ");
    System.out.println("-Salaried Employee + Commission Data-");     
        
         
         
         
    }
   
}

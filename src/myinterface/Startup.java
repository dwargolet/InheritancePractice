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
        
        
        
        
    }
}

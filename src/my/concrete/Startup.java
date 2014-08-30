
package my.concrete;

/**
 *
 * @author Daniel
 */
public class Startup {
    
    public static void main(String[] args) {
        
    HourlyEmployee emp1 = new HourlyEmployee("Bruce Willis", "13456", 
            "262-968-6900");
    
    
    emp1.generateReport();
    
//sets the class specific property
    emp1.setAvgWorkHours(20);

    
//grabs the overridden method
    emp1.earningMethod();
    System.out.println("Average hours worked weekly: " + emp1.getAvgWorkHours());
    }
}
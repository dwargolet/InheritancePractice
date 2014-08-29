
package my.concrete;

/**
 *
 * @author Daniel
 */
public class Startup {
    
    public static void main(String[] args) {
        
    HourlyEmployee emp1 = new HourlyEmployee("Bruce Willis", "13456", 
            "262-968-6900");
    
//sets the class specific property
    emp1.setAvgWorkHours(20);
    
    System.out.println("The employee number " + emp1.getEmpNumber());
    System.out.println(emp1.getEmpName() + " can be reached at " + 
            emp1.getEmpContactNum());
    
//grabs the overridden method
    emp1.earningMethod();
    System.out.println("Average hours worked: " + emp1.getAvgWorkHours());
    }
}
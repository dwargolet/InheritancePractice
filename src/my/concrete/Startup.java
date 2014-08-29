/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Daniel
 */
public class Startup {
    
    public static void main(String[] args) {
        
   HourlyEmployee emp1 = new HourlyEmployee("Bruce Willis", "123456", "262-968-6900");
    
    System.out.println("work");

     
    emp1.earningMethod();
    }
}
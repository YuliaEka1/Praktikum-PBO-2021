/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme.Percobaan2;


/**
 *
 * @author LENOVO
 */
public class Tester2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500); 
      Employee e;
      e = pEmp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("-------------------");
        System.out.println(""+pEmp.getEmployeeInfo());
    }
    
}

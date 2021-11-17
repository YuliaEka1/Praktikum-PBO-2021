/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme.Percobaan3;

/**
 *
 * @author LENOVO
 */
public class Tester3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        KaryawanMagang iEmp = new KaryawanMagang("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        
        Employee e[] = {pEmp, iEmp};
        Payable p[] = {pEmp, eBill};
        Employee e2[] = {pEmp, iEmp, eBill};
    }
    
}

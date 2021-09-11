/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author lenovo
 */
public class TestLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lk1 = new Lingkaran(11, 3.14);
        
        lk1.hitungLuas();
        lk1.hitungKeliling();
        lk1.tampilLingkaran();
    }
    
}

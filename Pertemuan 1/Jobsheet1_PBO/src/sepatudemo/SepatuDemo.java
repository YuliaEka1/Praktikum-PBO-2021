/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepatudemo;

/**
 *
 * @author lenovo
 */
public class SepatuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objek
        Sepatu spt = new Sepatu();
        
        //memanggil method
        spt.setMerek("Adidas");
        spt.tambahUkuran(40);
        spt.kurangUkuran(3);
        spt.setWarna("Hitam");
        spt.cekStatus();
    }
    
}

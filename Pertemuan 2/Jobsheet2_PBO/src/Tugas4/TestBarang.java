/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author lenovo
 */
public class TestBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang brg1= new Barang();
        
        brg1.setBarang("Tas Ransel");
        brg1.setKode("B01");
        brg1.setHarga(75000);
        brg1.setDiskon(20);
        brg1.setHargaJual();
        brg1.tampilBarang();
    }
    
}

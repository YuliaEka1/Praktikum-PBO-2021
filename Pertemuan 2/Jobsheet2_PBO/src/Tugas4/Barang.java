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
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public int diskon;
    public int hargaJual;
    
    public void setKode(String newValue){
        kode = newValue;
    }
    public void setBarang(String newValue){
        namaBarang = newValue;
    }
    public int setHarga(int newValue){
        hargaDasar = newValue;
        return hargaDasar;
    }
    public int setDiskon(int newValue){
        diskon = newValue;
        return diskon;
    }
    public int setHargaJual(){
        hargaJual = hargaDasar-(hargaDasar*diskon/100);
        return hargaJual;
    }
    public void tampilBarang(){
        System.out.println("Kode Barang : " +kode);
        System.out.println("Nama Barang : " +namaBarang);
        System.out.println("Harga Dasar : " +hargaDasar);
        System.out.println("Diskon      : " +diskon + "%");
        System.out.println("Harga Jual  : " +hargaJual);
    }
    
}

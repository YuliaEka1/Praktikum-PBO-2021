/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractclass;

/**
 *
 * @author LENOVO
 */
public class Orang { //has a orang punya hewan
    private String nama;
    private Hewan hewanPeliharaan;
    
    Orang(String nama){
        this.nama = nama; //nilai dri parameter akan dimaksukkan ke atribut nama
        
    }
    public void peliharaanHewan(Hewan peliharaan){ //nilai peliharaan akan masuk ke hewanPeliharaan
        this.hewanPeliharaan = peliharaan;
        
    }
    public void ajakPeliharaanJalan(){
        System.out.println("Nama: " +nama);
        System.out.println("Hewan Peliharaanku bergerak dengan: " );
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------");
        
    }
}

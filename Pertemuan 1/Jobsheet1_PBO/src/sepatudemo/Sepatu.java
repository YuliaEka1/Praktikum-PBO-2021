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
public class Sepatu {
    private String merek;
    private int ukuran;
    private String warna;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void tambahUkuran(int increment){
        ukuran += increment;
    }
    public void kurangUkuran(int decrement){
        ukuran -= decrement;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    public void cekStatus(){
        System.out.println("Merek  : " + merek);
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Warna  : " + warna);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesinjahitdemo;

/**
 *
 * @author lenovo
 */
public class MesinJahit {
    private String merek;
    private String warnaBenang;
    private int pedal;
    private int tuasJarak;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setWarna(String newValue){
        warnaBenang = newValue;
    }
    public void tambahKec(int increment){
        pedal += increment;
    }
    public void kurangKec(int decrement){
        pedal -= decrement;
    }
    public void setJarak(int jarak){
        tuasJarak = jarak;
    } 
    public void cekStatus(){
        System.out.println("Merek       : " + merek);
        System.out.println("Warna Benang: " + warnaBenang);
        System.out.println("Pedal       : " + pedal + "jahitan/menit");
        System.out.println("Tuas Jarak  : " + tuasJarak);
        
    }
    
}

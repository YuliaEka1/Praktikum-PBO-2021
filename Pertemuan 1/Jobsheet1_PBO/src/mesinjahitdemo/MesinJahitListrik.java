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
public class MesinJahitListrik extends MesinJahit {
    private int pola;
    
    public void jumlahPola(int newValue){
        pola = newValue;
    }
    public void cekStatus(){
        super.cekStatus();
        System.out.println("Jumlah Pola : " + pola);
    }
    
}

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
public class MesinObras extends MesinJahit {
    private int benang;
    
    public void jumlahBenang(int newValue){
        benang = newValue;
    }
    public void cetakStatus(){
        super.cekStatus();
        System.out.println("Benang   : " + benang);
    }
    
}

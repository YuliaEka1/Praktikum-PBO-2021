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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan Lumba = new Ikan();
        
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");
        
        //mengeset orang u/ hewan peliharaan
        ani.peliharaanHewan(kucingKampung);
        budi.peliharaanHewan(Lumba);
        
        ani.ajakPeliharaanJalan();
        budi.ajakPeliharaanJalan();
    }
    
}

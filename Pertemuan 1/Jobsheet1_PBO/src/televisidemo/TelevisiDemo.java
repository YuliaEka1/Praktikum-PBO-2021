/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisidemo;

/**
 *
 * @author lenovo
 */
public class TelevisiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objek
        Televisi tv = new Televisi();
        
        //memanggil method
        tv.setMerek("Samsung");
        tv.setChannel("NET TV");
        tv.tambahVol(30);
        tv.tambahVol(5);
        tv.kurangVol(10);
        tv.cekStatus();
    }
    
}

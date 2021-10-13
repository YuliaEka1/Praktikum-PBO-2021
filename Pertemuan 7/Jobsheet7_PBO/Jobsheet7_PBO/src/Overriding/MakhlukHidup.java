/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author LENOVO
 */
public class MakhlukHidup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Manusia b = new Mahasiswa();
        Mahasiswa b1 = new Mahasiswa();
        Manusia c = new Dosen();
        Dosen c1 = new Dosen();
        
        a.bernafas();
        a.makan();
        b.makan();
        b1.tidur();
        c.makan();
        c1.lembur();
    }
    
}

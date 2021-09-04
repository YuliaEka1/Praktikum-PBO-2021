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
public class JahitDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objek
        MesinJahit mj = new MesinJahit();
        MesinObras mo = new MesinObras();
        MesinJahitListrik mjl = new MesinJahitListrik();
        
        //memanggil method di dalam objek
        mj.setMerek("Singer");
        mj.setWarna("Hitam");
        mj.setJarak(3);
        mj.tambahKec(2800);
        mj.kurangKec(200);
        mj.cekStatus();
        
        mo.setMerek("Singer");
        mo.setWarna("Putih");
        mo.setJarak(2);
        mo.tambahKec(3000);
        mo.jumlahBenang(3);
        mo.cetakStatus();
        
        mjl.setMerek("Singer");
        mjl.setWarna("Biru");
        mjl.setJarak(3);
        mjl.tambahKec(2550);
        mjl.kurangKec(1000);
        mjl.jumlahPola(6);
        mjl.cekStatus();
    }
    
}

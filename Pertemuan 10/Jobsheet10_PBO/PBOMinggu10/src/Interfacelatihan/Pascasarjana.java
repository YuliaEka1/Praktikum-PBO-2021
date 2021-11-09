/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacelatihan;

/**
 *
 * @author LENOVO
 */
public class Pascasarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
 
    Pascasarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus() {
        System.out.println("Nama Saya "+super.nama);
        System.out.println("Saya sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK saya lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
    
    
}

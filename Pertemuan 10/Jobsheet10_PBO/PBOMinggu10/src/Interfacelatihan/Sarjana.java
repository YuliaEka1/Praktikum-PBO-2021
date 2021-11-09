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
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi{

    Sarjana(String nama){
        super(nama); //dari konstruktor Mahasiwa
    }
    @Override
    public void lulus() {
        System.out.println("Nama Saya "+super.nama);
        System.out.println("Saya sudah menyelesaikan SKRIPSI!");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK saya lebih dari 3,51");
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

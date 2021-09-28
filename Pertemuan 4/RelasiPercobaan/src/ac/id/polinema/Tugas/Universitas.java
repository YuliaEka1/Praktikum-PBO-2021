/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.Tugas;

/**
 *
 * @author lenovo
 */
public class Universitas {
    private String nama;
    private String lokasi;
    
    Universitas(){
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    public void info(){
        System.out.println("Nama Universitas : " + nama);
        System.out.println("Lokasi Univeritas: " + lokasi +"\n");
    }

}


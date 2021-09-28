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
public class Mahasiswa {
    private String nama;
    private String noSiswa;
    private Profesor prof;
    private KeahlianSiswa ahli;
    
    Mahasiswa(){
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoSiswa() {
        return noSiswa;
    }

    public void setNoSiswa(String noSiswa) {
        this.noSiswa = noSiswa;
    }

    public Profesor getProf() {
        return prof;
    }

    public void setProf(Profesor prof) {
        this.prof = prof;
    }

    public KeahlianSiswa getAhli() {
        return ahli;
    }

    public void setAhli(KeahlianSiswa ahli) {
        this.ahli = ahli;
    }
    public void info(){
        prof.info();
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nomor Siswa   : " + noSiswa);
        System.out.println("Keahlian Siswa: " + ahli.getKeahlian());
        
    }
}

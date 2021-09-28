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
public class Profesor {
    private String nama;
    private String matkul;
    private String jam;
    private Universitas univ;
    private Jabatan jabatan;
    
    Profesor(){
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public Universitas getUniv() {
        return univ;
    }

    public void setUniv(Universitas univ) {
        this.univ = univ;
    }

    public Jabatan getJabatan() {
        return jabatan;
    }

    public void setJabatan(Jabatan jabatan) {
        this.jabatan = jabatan;
    }
    public void info(){
        univ.info();
        System.out.println("Nama Profesor : " + nama);
        System.out.println("Matakuliah    : " + matkul);
        System.out.println("Jam Kelas     : " + jam);
        System.out.println("Jabatan       : " + jabatan.getJabatan() + "\n");
        
    }
    
}

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
public class MainTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universitas u = new Universitas();
        u.setNama("Police University Faculty");
        u.setLokasi("Ansan");
        
        Jabatan j = new Jabatan();
        j.setJabatan("Mantan Detektif Cyber Criminal");
      
        Profesor p = new Profesor();
        p.setNama("Yo Dong-Man");
        p.setMatkul("Investigasi");
        p.setJam("08.00 - 11.00");
        p.setUniv(u);
        p.setJabatan(j);
        
        KeahlianSiswa k = new KeahlianSiswa();
        k.setKeahlian("Hacker");
        
        Mahasiswa m = new Mahasiswa();
        m.setNama("Kang Seon-ho");
        m.setNoSiswa("0012");
        m.setAhli(k);
        m.setProf(p);
        m.info();
        
    }
    
}

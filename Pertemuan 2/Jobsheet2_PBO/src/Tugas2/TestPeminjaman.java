/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author lenovo
 */
public class TestPeminjaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peminjaman pj1 = new Peminjaman();
        
        pj1.setId(201);
        pj1.setNama("Atha");
        pj1.setMember("M120");
        pj1.setNamaGame("Winning Elven");
        pj1.setHarga(10000);
        pj1.setLamaPinjam(3);
        pj1.harusBayar(10000, 3);
        pj1.tampilPeminjaman();
    }
    
}

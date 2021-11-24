/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota;
import backend.Peminjaman;
import backend.Buku;

/**
 *
 * @author LENOVO
 */
public class TestBackendPeminjaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anggota Pinta = new Anggota().getById(1);
        Anggota Atha = new Anggota().getById(2);
        Anggota Dinda = new Anggota().getById(3);
        Buku dokter = new Buku().getById(8);
        Buku fisika = new Buku().getById(9);
        Buku mafioso = new Buku().getById(10);
        Peminjaman pinjam1 = new Peminjaman(Pinta, dokter, "2020-12-26", "2020-12-29");
Peminjaman pinjam2 = new Peminjaman(Atha, fisika, "2020-12-25", "2020-12-28");
        Peminjaman pinjam3 = new Peminjaman(Dinda, mafioso, "2020-12-23", "2020-12-27");
        //test insert
        pinjam1.save();
        pinjam2.save();
        pinjam3.save();
        //test update
        pinjam2.setTanggalkembali("2020-12-25");
        pinjam1.save();
        //test delete
        pinjam3.delete();
        //test select all
        for (Peminjaman p : new Peminjaman().getAll()) {
            System.out.println("Nama: " + p.getAnggota().getNama() + ", Judul: "
                    + p.getBuku().getJudul()
                    + ", Tanggal Peminjaman: " + p.getTanggalpinjam() + ", Tanggal Kembali: "
                    + p.getTanggalkembali());
        }
        //test search
        for (Peminjaman p : new Peminjaman().search("25")) {
            System.out.println("Nama: " + p.getAnggota().getNama() + ", Judul: "
                    + p.getBuku().getJudul()
                    + ", Tanggal Peminjaman: " + p.getTanggalpinjam() + ", Tanggal Kembali: "
                    + p.getTanggalkembali());
        }
    }
}

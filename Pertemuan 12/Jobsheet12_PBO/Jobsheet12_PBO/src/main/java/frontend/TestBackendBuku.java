/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Kategori;
import backend.Buku;

/**
 *
 * @author LENOVO
 */
public class TestBackendBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kategori novel = new Kategori().getById(25);
        Kategori referensi = new Kategori().getById(26);
        Buku buku1 = new Buku(novel, "Dokter Alena", "Novel Toon", "Sinho");
        Buku buku2 = new Buku(referensi, "Fisika", "Vektor", "Zainal");
        Buku buku3 = new Buku(novel, "Mafioso In Action", "Novel Toon", "WiraBp");
        // test insert
        buku1.save();
        buku2.save();
        // test update
        buku2.setJudul("Aljabar Linier");
        buku2.save();
        // test delete
        buku3.delete();
        // test select all
        for (Buku b : new Buku().getAll()) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: "
                    + b.getJudul());
        }
        // test search
        for (Buku b : new Buku().search("timun")) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: "
                    + b.getJudul());
        }
    }
}

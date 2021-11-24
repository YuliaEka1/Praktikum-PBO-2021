/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota;

public class TestBackendAnggota {

    public static void main(String[] args) {

        Anggota agt1 = new Anggota("Pinta", "Batu", "03432");
        Anggota agt2 = new Anggota("Atha", "Jember", "03412");
        Anggota agt3 = new Anggota("Dinda", "Malang", "034122");
        

        // test insert
        agt1.save();
        agt2.save();
        agt3.save();
        // test update
        agt2.setTelepon("03412");
        agt2.save();
        // test delete
        agt3.delete();
        // test select all
        for (Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ",Telepon: " + a.getTelepon());
}
        // test search
        for (Anggota a : new Anggota().search("Malang")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ",Telepon: " + a.getTelepon());
    }
    
}
    
}

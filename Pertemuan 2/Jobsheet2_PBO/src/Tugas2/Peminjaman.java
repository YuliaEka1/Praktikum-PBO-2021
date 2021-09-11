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
public class Peminjaman {
    public int id;
    public String nama;
    public String member;
    public String namaGame;
    public int harga;
    public int lamaPinjam;
    public int bayar;
    
    public void setId(int newValue){
        id = newValue;
    }
    public void setNama(String newValue){
        nama = newValue;
    }
    public void setMember(String newValue){
        member = newValue;
    }
    public void setNamaGame(String newValue){
        namaGame = newValue;
    }
    public int setHarga(int newValue){
       harga = newValue;
       return harga;
    }
    public int setLamaPinjam(int newValue){
       lamaPinjam = newValue;
       return lamaPinjam;
    }
    public int harusBayar(int harga, int lamaPinjam){
        bayar = harga*lamaPinjam;
        return harga;
    }
    public void tampilPeminjaman(){
        System.out.println("ID                       : " +id);
        System.out.println("Nama                     : " +nama);
        System.out.println("Member                   : " +member);
        System.out.println("Nama Game                : " +namaGame);
        System.out.println("Harga                    : " +harga);
        System.out.println("Lama Sewa                : " +lamaPinjam +" hari");
        System.out.println("==================================");
        System.out.println("Harga Yang Harus Dibayar : " +bayar);
    }
    
    
}

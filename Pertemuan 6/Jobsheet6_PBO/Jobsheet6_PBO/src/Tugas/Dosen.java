/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    public void setTarif(int TARIF_SKS){
        this.TARIF_SKS = TARIF_SKS;
    }
    public int getGaji(){
        int gaji = jumlahSKS * TARIF_SKS;
        System.out.println("Gaji Dosen: " +gaji+ "\n");
        return gaji;
    }
   

    }
    


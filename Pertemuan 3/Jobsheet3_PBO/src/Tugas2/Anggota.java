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
public class Anggota {

    private int nomorKtp;
    private String nama;
    private float jumlahPinjaman;
    private float limitPinjaman;

    Anggota(int nomorKtp, String nama, float limit) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.jumlahPinjaman = 0;
        this.limitPinjaman = limit;
    }

    public int getNomorKtp() {
        return nomorKtp;
    }

    public void setNomorKtp(int nomorKtp) {
        this.nomorKtp = nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getLimitPinjaman() {
        return limitPinjaman;
    }

    public float getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void angsur(float uang) {

        if (uang < (jumlahPinjaman * 10 / 100)) {

            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= uang;
        }
    }

    public void pinjam(float uang) {
        if (uang > limitPinjaman) {
            jumlahPinjaman = 0;
            System.out.println("Maaf Jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += uang;
        }
    }

}

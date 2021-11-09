/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacelatihan;

/**
 *
 * @author LENOVO
 */
public class Direktur {

    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {

        System.out.println("--------------------------------------------------------");
        System.out.println("Saya Direktur Polinema, memberikan sertifikat cumlaude!");
        System.out.println("Silahkan memperkenalkan diri..");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("--------------------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Saya Direktur Polinema, memberikan sertifikat MAWAPRES!");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("--------------------------------------------------------");
    }
}

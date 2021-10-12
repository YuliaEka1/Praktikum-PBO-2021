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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pegawai pegawai = new Pegawai("192544", "Widyawati", "Jember");
        Dosen dosen = new Dosen("192543", "Diah", "Malang");
        DaftarGaji daftarGaji = new DaftarGaji(2);

        daftarGaji.addPegawai(pegawai);
        pegawai.getGaji(400000);

        daftarGaji.addPegawai(dosen);
        dosen.setSKS(24);
        dosen.setTarif(30000);
        dosen.getGaji();

        daftarGaji.printSemuaGaji();

    }

}

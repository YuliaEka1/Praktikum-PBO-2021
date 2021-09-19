/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class testKoperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Anggota donny = new Anggota(20199234, "Susanti", 5000000);
        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam Uang 10.000.000...");
        donny.pinjam(10000000);

        System.out.println("\nMeminjam Uang 4.000.000...");
        System.out.print("Meminjam : ");
        int pinjam = sc.nextInt();
        
        donny.pinjam(pinjam);
        System.out.printf("Jumlah pinjaman saat ini : " + "%.1f\n", donny.getJumlahPinjaman());

        System.out.println("\nMembayar Angsuran 1.000.000...");
        donny.angsur(100000);
        System.out.printf("Jumlah pinjaman saat ini : " + "%.1f\n", donny.getJumlahPinjaman());

        System.out.println("\nMembayar Angsuran 3.000.000...");
        System.out.print("Mengangsur : ");
        int angsur = sc.nextInt();
        
        donny.angsur(angsur);
        System.out.printf("Jumlah pinjaman saat ini : " + "%.1f\n", donny.getJumlahPinjaman());
        
        
       
        

    }

}

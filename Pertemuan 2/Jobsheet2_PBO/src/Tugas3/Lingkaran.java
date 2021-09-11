/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author lenovo
 */
public class Lingkaran {
    double r;
    double phi;
    double luas;
    double keliling;

    public Lingkaran(double jari, double p) {
        r = jari;
        phi = p;
    }

    public double hitungLuas() {
        luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling() {
        keliling = 2 * phi * r;
        return keliling;
    }

    public void tampilLingkaran() {
        System.out.println("phi      : " + phi);
        System.out.println("r        : " + r);
        System.out.println("_________________");
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);

    }
}

    


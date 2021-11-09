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
public class Keledai extends Binatang implements IHerbivora{

    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Ini termasuk hewan mamalia ");  
    }

    @Override
    public void displayMakan() {
        System.out.println("Hewan ini makan rumput, oleh karena itu dia adalah hewan herbivora");
    }
     public void displayData(){
        System.out.println("Nama hewan ini adalah "+super.nama);
        System.out.println(super.nama +" mempunyai " + super.jmlKaki + "kaki");
        System.out.println("Hewan ini suaranya "+suara);
        System.out.println("Dan warna bulunya "+warnaBulu);
        System.out.println("-----------------------------------");
    }
    
}

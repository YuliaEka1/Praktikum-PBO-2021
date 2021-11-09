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
public class MainBinatang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singa singa = new Singa("Singa",4,"Mengaung","Orange kecoklakatan");
        Keledai keledai = new Keledai("Keledai",4,"meringkik","abu-abu dan coklat");
        Gorilla gorilla = new Gorilla("Gorilla",2,"hu...huu","hitam");
        
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
        
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        
        gorilla.displayBinatang();
        gorilla.displayMakan();
        gorilla.displayData();
    }
    
}

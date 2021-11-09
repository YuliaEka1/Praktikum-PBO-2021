/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractclass;

/**
 *
 * @author LENOVO
 */
public class Kucing extends Hewan{ //errorr krn mengextends kelas abstract
//jadi harus implementasi kelas abtract
    
    @Override
    public void bergerak() {
        System.out.println("Kucing bergerak dengan kaki...tap..tap..tap");
    }
    
}

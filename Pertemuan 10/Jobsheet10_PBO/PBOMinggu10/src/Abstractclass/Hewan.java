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
public abstract class Hewan {
    private int umur;
    
    protected Hewan(){ //masih bisa dikonstruktor
        this.umur = 0;
    }
    public void bertambahUmur(){
        umur +=1;
    }
    public abstract void bergerak(); //method abstract
}

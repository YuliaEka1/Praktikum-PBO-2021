/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author LENOVO
 */
public class Manusia {
    
    public void nyalakanPerangkat(Elektronik perangkat){
        
        if(perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan televisi jadul dengan input: "+((TelevisiJadul)perangkat).getModelInput());
           
        }
        else if(perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan televisi jadul dengan input: "+((TelevisiModern)perangkat).getModelInput());
        }
        System.out.println("Voltase televisi: " + perangkat.voltase);
    }
}
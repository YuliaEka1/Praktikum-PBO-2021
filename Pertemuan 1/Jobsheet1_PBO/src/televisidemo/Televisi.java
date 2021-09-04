/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisidemo;

/**
 *
 * @author lenovo
 */
public class Televisi {
    private String merek;
    private String channel;
    private int volume;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setChannel(String newValue){
        channel = newValue;
    }
    public void tambahVol(int increment){
        volume += increment;
    }
    public void kurangVol(int decrement){
        volume -= decrement;
    }
    public void cekStatus(){
        System.out.println("Merek  : " + merek);
        System.out.println("Channel: " + channel);
        System.out.println("Volume : " + volume);
    }
    
}

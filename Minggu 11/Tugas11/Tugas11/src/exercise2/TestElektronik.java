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
public class TestElektronik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manusia indro = new Manusia();
        TelevisiJadul tvjadul = new TelevisiJadul(220,"DVI");
        TelevisiModern tvmodern = new TelevisiModern(220,"HDMI");
        
        indro.nyalakanPerangkat(tvjadul);
        indro.nyalakanPerangkat(tvmodern);
    }
    
}

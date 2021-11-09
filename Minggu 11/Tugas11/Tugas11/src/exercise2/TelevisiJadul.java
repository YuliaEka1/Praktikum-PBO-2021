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
public class TelevisiJadul extends Elektronik {
    private String modelInput;
    
    TelevisiJadul(int voltase, String modelInput){
            super(voltase);
            this.modelInput = modelInput;
    }

    public String getModelInput() {
        return modelInput;
    }
    
}

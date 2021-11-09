/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacelatihan;

/**
 *
 * @author LENOVO
 */
public class MahasiswaCumlaude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direktur DirekturPolinema = new Direktur();
        
        Mahasiswa mhs = new Mahasiswa("Charlie");
        Sarjana scmd = new Sarjana("Eni");
        Pascasarjana pcmd = new Pascasarjana("Dini");
        
        // DirekturPolinema.beriSertifikatCumlaude(mhs); // mhs tertolak, krn mhs tidak implements ICumlaude
        DirekturPolinema.beriSertifikatCumlaude(scmd);
        DirekturPolinema.beriSertifikatCumlaude(pcmd);
        
        DirekturPolinema.beriSertifikatMawapres(scmd); // tadi terdapat error, krn sarjana belum implements IBerprestasi
        DirekturPolinema.beriSertifikatMawapres(pcmd);
    }
    
}

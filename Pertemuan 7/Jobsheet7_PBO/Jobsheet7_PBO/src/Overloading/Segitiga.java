/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author LENOVO
 */
public class Segitiga {

    private int sudut;
    
    
    int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        System.out.println("Total Sudut: "+sudut);
        return sudut;
    }
    int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Total Sudut: "+sudut);
        return sudut;
    }
    int keliling(int sisiA, int sisiB, int sisiC){
       int keliling = sisiA + sisiB + sisiC;
       System.out.println("Keliling: "+keliling);
       return keliling;
    }
    double keliling(double sisiA, double sisiB){
       double keliling = Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
       System.out.println("Keliling: "+keliling);
        return keliling;
     }
    
    public static void main(String[] args) {
       Segitiga s = new Segitiga();
       s.totalSudut(90);
       s.totalSudut(60, 25);
       s.keliling(3, 3, 3);
       s.keliling(2.5, 4.0);
       
       
    }
    
}

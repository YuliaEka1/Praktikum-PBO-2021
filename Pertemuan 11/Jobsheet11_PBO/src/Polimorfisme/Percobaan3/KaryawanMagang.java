/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme.Percobaan3;

/**
 *
 * @author LENOVO
 */
public class KaryawanMagang extends Employee{
    private int length; 
    
    public KaryawanMagang(String nama, int length){
        this.length = length; //atribut length, nilai diambil dri parameter length
        super.name = nama; //name punyanya Employee
    }
    public int getLength(){
        return length;
             
        }
    public void setLength(int length) {
        this.length = length;
    }
    @Override
     public String getEmployeeInfo(){
        String info = super.getEmployeeInfo();
        info += "terdaftar sebagai karyawan untuk "+length+" month/s\n";
        return info;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author lenovo
 */
public class EncapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        EncapDemo encap1 = new EncapDemo();
        encap1.setName("Tina");
        encap1.setAge(17);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
        System.out.println("Name : " + encap1.getName());
        System.out.println("Age  : " + encap1.getAge());
    }

}

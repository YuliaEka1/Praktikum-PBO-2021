/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Plant {
    public void doDestroy(Destroyable d){
        if(d instanceof JumpingZombie){
             JumpingZombie jz = (JumpingZombie)d;
             jz.destroyed();
             jz.getZombieInfo();
 
        }
        else if(d instanceof WalkingZombie){
            WalkingZombie wz = (WalkingZombie)d;
            wz.destroyed();
            wz.getZombieInfo();
    }else if (d instanceof Barrier){
        Barrier br = (Barrier) d;
        br.destroyed();
    }
}}

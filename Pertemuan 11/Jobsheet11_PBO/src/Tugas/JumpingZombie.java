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
public class JumpingZombie extends Zombie{
    JumpingZombie(int health, int level){
         super.health = health;
        super.level = level;
    }
    @Override
    public void heal(){
        if(level == 1){
            health += 0.3;
        }else if(level == 2){
            health += 0.4;
        }else if(level == 3){
            health += 0.5;
        }else{
            System.out.println("health tetap");
        }
    }
    @Override
    public void destroyed(){
        health -= health * 0.095;
    }
    @Override
    public String getZombieInfo(){
        return "Jumping Zombie Data\n"
                + "Health= "+health+"\nLevel= "+level;
    }
}

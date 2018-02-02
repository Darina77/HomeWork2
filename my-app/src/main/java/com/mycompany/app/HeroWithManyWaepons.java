package com.mycompany.app;

import java.util.Collection;

public class HeroWithManyWaepons implements Hero{
    public HeroWithManyWaepons(){}
    public void fight(){
        for (Weapon weapon:weapons){
            weapon.use();
        }
    }
    private Collection<Weapon> weapons;
    public void setWeapons(Collection<Weapon> weapons){
        this.weapons = weapons;
    }
}


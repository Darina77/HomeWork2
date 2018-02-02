package com.mycompany.app;

import java.util.Collection;
import java.util.Map;

public class HeroWithManyWaeponsNew implements Hero{
    public HeroWithManyWaeponsNew(){}
    public void fight(){
        for (String key: weapons.keySet()){
            System.out.println(key);
            Weapon weapon = weapons.get(key);
            weapon.use();

        }
    }
    private Map<String, Weapon> weapons;
    public void setWeapons(Map<String, Weapon> weapons){
        this.weapons = weapons;
    }
}


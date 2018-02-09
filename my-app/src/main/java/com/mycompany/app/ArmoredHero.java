package com.mycompany.app;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArmoredHero implements Hero
{
    @Autowired
    @NotNull
    private Armor armor;
    private int strength = 2;
    @NotNull
    private String name;

    public  ArmoredHero() {
        name = "Noname";
    }

    public ArmoredHero(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public Armor getArmor(){
        return armor;
    }

    public void fight() {
        System.out.println(name + " use armor.");
        armor.wear();
        System.out.println("Fight with " + strength + " strength point.");
    }
}


package com.mycompany.app;

public class ArmoredHero implements Hero
{
    private Armor armor;
    private int strength = 2;
    private String name = "Noname";

    public ArmoredHero(Armor armor) { this.armor = armor;}

    public ArmoredHero(String name, int strength, Armor armor){
        this.name = name;
        this.strength = strength;
        this.armor = armor;
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


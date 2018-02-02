package com.mycompany.app;

public class StandartHero implements Hero{

    private int strength = 1;
    private String name = "Noname";

    public StandartHero(){}

    public StandartHero(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    public void fight() {
        System.out.println(name + " fight with " + strength + " strength point.");
    }

}


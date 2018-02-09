package com.mycompany.app;

import com.sun.istack.internal.NotNull;
import org.springframework.stereotype.Component;

@Component
public class StandartHero implements Hero{

    private int strength = 1;
    @NotNull
    private String name;

    public StandartHero(){
        name = "Noname";
    }

    public StandartHero(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    public void fight() {
        System.out.println(name + " fight with " + strength + " strength point.");
    }

}


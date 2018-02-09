package com.mycompany.app;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HeroWithWeapon extends StandartHero {

    @Autowired
    @Qualifier("sword")
    @NotNull
    private Weapon weapon;

    public HeroWithWeapon() {
        super();
    }

    public HeroWithWeapon(String name, int strength, Weapon weapon) {
        super(name, strength);
        this.weapon = weapon;
    }

    public void fight() {
        super.fight();
        System.out.println("Use weapon ...");
        weapon.use();
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }
}


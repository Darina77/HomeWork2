package com.mycompany.app;

public class HeroWithWeapon extends StandartHero {

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


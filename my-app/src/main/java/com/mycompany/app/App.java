package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Hero hero1 = (Hero)context.getBean("standartHero");
        hero1.fight();
        Hero hero2 = (Hero)context.getBean("armoredHero");
        hero2.fight();
        Hero hero3 = (Hero)context.getBean("heroWithWeapon");
        hero3.fight();
    }
}

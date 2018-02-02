package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Hero hero1 = (Hero)context.getBean("hero");
        hero1.fight();
        Hero hero2 = (Hero)context.getBean("hero2");
        hero2.fight();
        Hero hero3 = (Hero)context.getBean("hero3");
        hero3.fight();
        Hero hero4 = (Hero)context.getBean("hero4");
        hero4.fight();
        Hero hero5 = (Hero)context.getBean("hero5");
        hero5.fight();
        Hero hero6 = (Hero)context.getBean("hero6");
        hero6.fight();
        Hero hero7 = (Hero)context.getBean("hero7");
        hero7.fight();
    }
}

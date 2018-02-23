package com.mycompany.app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StandartMonster implements Monster
{
    @Pointcut("execution(* com.mycompany.app.Hero.fight(..))")
    public void fight(){}

    @After("fight()")
    public void attack()
    {
        System.out.println("Monster attack the hero.");
    }
}

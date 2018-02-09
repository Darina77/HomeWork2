package com.mycompany.app;

import org.springframework.stereotype.Component;

@Component
public class GoldArmor implements Armor{
    public GoldArmor(){}
    public void wear() {
        System.out.println("Use gold armor.");
    }
}

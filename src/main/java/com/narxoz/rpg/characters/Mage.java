package com.narxoz.rpg.characters;

public class Mage extends BaseCharacter {
    public Mage(String name) {
        super(name, 80, 120, 10, 50);
    }

    public void useSpecialAbility() {
        System.out.println(getName() + " casts a powerful fireball!");
    }

    
}

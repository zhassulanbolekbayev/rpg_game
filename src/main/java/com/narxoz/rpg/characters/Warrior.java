package com.narxoz.rpg.characters;

public class Warrior extends BaseCharacter {
    public Warrior(String name) {
        super(name, 150, 50, 20, 5);
    }

    public void useSpecialAbility() {
        System.out.println(getName() + " performs a powerful sword strike!");
    }

    
}
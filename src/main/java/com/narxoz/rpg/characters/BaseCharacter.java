package com.narxoz.rpg.characters;      

public abstract class BaseCharacter implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    protected BaseCharacter(String name, int health, int mana, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }
    

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void getStats(){
        System.out.println("Name: " + name + ", Health: " + health + ", Mana: " + mana + ", Strength: " + strength + ", Intelligence: " + intelligence);
    }

    @Override
    public abstract void useSpecialAbility();
}




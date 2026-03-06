package com.narxoz.rpg.characters;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public abstract class BaseCharacter implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

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

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " equipped: " + weapon.getWeaponInfo());
    }

    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(name + " equipped: " + armor.getArmorInfo());
    }

    public void getStats(){
        System.out.println("Name: " + name + ", Health: " + health + ", Mana: " + mana + ", Strength: " + strength + ", Intelligence: " + intelligence);
    }

    public void displayFullStats() {
        System.out.println("\n========== " + name + " (Statistics) ==========");
        System.out.println("Health:       " + health);
        System.out.println("Mana:         " + mana);
        System.out.println("Strength:     " + strength);
        System.out.println("Intelligence: " + intelligence);
        
        if (weapon != null) {
            System.out.println("Weapon:       " + weapon.getWeaponInfo());
        } else {
            System.out.println("Weapon:       None");
        }
        
        if (armor != null) {
            System.out.println("Armor:        " + armor.getArmorInfo());
        } else {
            System.out.println("Armor:        None");
        }
        System.out.println("=====================================\n");
    }

    @Override
    public abstract void useSpecialAbility();
}




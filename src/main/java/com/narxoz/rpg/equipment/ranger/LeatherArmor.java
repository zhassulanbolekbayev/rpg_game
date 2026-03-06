package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;

public final class LeatherArmor implements Armor {

    private static final int defense = 15;
    private static final int agility = 10;

    @Override
    public int getDefense() {
        return defense;
    }

    public int getAgility() {
        return agility;
    }

    @Override
    public String getArmorInfo() {
        return "Leather Armor: Defense = " + defense + ", Agility = " + agility;
    }

    
}
package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Armor;

public final class EnchantedRobes implements Armor {

    private final int defense = 10;
    private final int manaBoost = 25;

    @Override
    public int getDefense() {
        return defense;
    }   

    public int getManaBoost() {
        return manaBoost;
    }   

    @Override
    public String getArmorInfo() {
        return "Enchanted Robes: A mystical garment that provides magical protection and enhances mana.";
    }   


}

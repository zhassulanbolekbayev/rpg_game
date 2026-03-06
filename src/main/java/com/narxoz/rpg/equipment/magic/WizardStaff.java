package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Weapon;

public final class WizardStaff implements Weapon {

    private static final int damage = 15;
    private static final int manaBoost = 20;

    @Override
    public int getDamage() {
        return damage;
    }

    public int getManaBoost() {
        return manaBoost;
    }

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff: A powerful staff imbued with magical energy.";
    }
    
}

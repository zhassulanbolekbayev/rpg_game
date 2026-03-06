package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Weapon;

public final class IronSword implements Weapon {

    private static final int damage = 25;

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Iron Sword: Damage = " + damage;
    }

    @Override
    public int getManaBoost() {
        return 0;
    }

}

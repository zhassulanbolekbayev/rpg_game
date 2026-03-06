package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Weapon;

public final class Longbow implements Weapon {

    private final int damage = 30;
    private final Range range = Range.LONG;

    @Override
    public int getDamage() {
        return damage;
    }   

    public Range getRange() {
        return range;
    }   

    @Override
    public String getWeaponInfo() { 
        return "Longbow: Damage = " + damage + ", Range = " + range;
    }
    
    @Override
    public int getManaBoost() {
        return 0;
    }   
}

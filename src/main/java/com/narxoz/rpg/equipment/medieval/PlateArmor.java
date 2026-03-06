package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Armor;

public final class PlateArmor implements Armor {

    private static final int protection = 30;

    public int getProtection() {
        return protection;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor: Protection = " + protection;
    }

    @Override
    public int getDefense() {
        throw new UnsupportedOperationException("Unimplemented method 'getDefense'");
    }
    
}

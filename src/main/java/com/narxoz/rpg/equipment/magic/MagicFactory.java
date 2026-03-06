package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.factory.EquipmentFactory;

public final class MagicFactory implements EquipmentFactory {
    @Override
    public String themekey() {
        return "magic";
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }

    @Override
    public Armor createArmor() {
        return new EnchantedRobes();
    }
    
}

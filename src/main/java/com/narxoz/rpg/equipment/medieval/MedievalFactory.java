package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.factory.EquipmentFactory;


public final class MedievalFactory implements EquipmentFactory {

    @Override
    public String themekey() {
        return "medieval";
    }

    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
    
}

package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon; 
import com.narxoz.rpg.equipment.factory.EquipmentFactory;

public final class RangerFactory implements EquipmentFactory {
    @Override
    public String themekey() {
        return "ranger";
    }

    @Override
    public Weapon createWeapon() {
        return new Longbow();
    }

    public Armor createArmor() {
        return (Armor) new LeatherArmor();
    }
    
}
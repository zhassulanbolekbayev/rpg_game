package com.narxoz.rpg.equipment.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public interface EquipmentFactory {
    String themekey();
    Weapon createWeapon();
    Armor createArmor();
}

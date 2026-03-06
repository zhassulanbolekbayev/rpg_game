package com.narxoz.rpg;

import java.util.HashMap;
import com.narxoz.rpg.characters.BaseCharacter;
import com.narxoz.rpg.characters.factory.CharacterCreater;
import com.narxoz.rpg.characters.factory.WarriorFactory;
import com.narxoz.rpg.characters.factory.ArcherFactory;
import com.narxoz.rpg.characters.factory.MageFactory;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.factory.EquipmentCreater;
import com.narxoz.rpg.equipment.medieval.MedievalFactory;
import com.narxoz.rpg.equipment.ranger.RangerFactory;


public class Main {
    public static void main(String[] args) {
        System.out.println("===Welcome to the RPG Character and Equipment Factory!===");

        // Initialize character factory
        CharacterCreater characterCreater = new CharacterCreater();
        // Register character types
        characterCreater.register(new WarriorFactory());
        characterCreater.register(new ArcherFactory());
        characterCreater.register(new MageFactory());
        // Create a character
        System.out.println("Creating Warrior...");
        BaseCharacter warrior = (BaseCharacter) characterCreater.get("warrior").create("Aragorn");
        warrior.getStats();

        System.out.print("Special Ability: ");
        warrior.useSpecialAbility();
        System.out.println();
  
        System.out.println("===Character creation successful!===");


        System.out.println("\n===Welcome to the RPG Equipment Factory!===");

        // Initialize equipment factory
        EquipmentCreater equipmentCreater = new EquipmentCreater(new HashMap<>());


        // Register equipment types

        equipmentCreater.register(new MedievalFactory());
        equipmentCreater.register(new RangerFactory());

        Weapon w = equipmentCreater.get("medieval").createWeapon();
        Armor a = equipmentCreater.get("medieval").createArmor();
        
        warrior.equipWeapon(w);
        warrior.equipArmor(a);

        warrior.displayFullStats();

        System.out.println("===Equipment creation successful!===");

        



    }
}

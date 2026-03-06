package com.narxoz.rpg.characters.factory;

import com.narxoz.rpg.characters.Character;
import com.narxoz.rpg.characters.Archer;

public final class ArcherFactory implements CharacterFactory {

    public String key() {
        return "archer";
    }

    public Character create(String name) {
        return new Archer(name);
    }
    
}

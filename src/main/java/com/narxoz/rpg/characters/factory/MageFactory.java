package com.narxoz.rpg.characters.factory;

import com.narxoz.rpg.characters.Character;
import com.narxoz.rpg.characters.Mage;

public final class MageFactory implements CharacterFactory {

    public String key() {
        return "mage";
    }

    public Character create(String name) {
        return new Mage(name);
    }
}

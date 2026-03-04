package com.narxoz.rpg.characters.factory;

import com.narxoz.rpg.characters.Character;
import com.narxoz.rpg.characters.Warrior;

public final class WarriorFactory implements CharacterFactory {

    @Override
    public String key() {
        return "warrior";
    }

    @Override
    public Character create(String name) {
        return new Warrior(name);
    }
}

package com.narxoz.rpg.characters.factory;

import com.narxoz.rpg.characters.Character;

public interface CharacterFactory {
    String key();
    Character create(String name);
}
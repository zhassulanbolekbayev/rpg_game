package com.narxoz.rpg.characters.factory;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public final class CharacterCreater {
    private final Map<String, CharacterFactory> factories; 

    public CharacterCreater() {
        this.factories = new HashMap<>();
    }

    public void register(CharacterFactory factory) {
        factories.put(factory.key().toLowerCase(), factory);
    }   

    public CharacterFactory get(String type) {
        CharacterFactory factory = factories.get(type.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unknown character type: " + type);
        }
        return factory;
    }

    public Set<String> getAvailableTypes() {
        return factories.keySet();
    }
}

package com.narxoz.rpg.characters;

public interface Character {
    String getName();

    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();
    
    void getStats();
    void useSpecialAbility();
}


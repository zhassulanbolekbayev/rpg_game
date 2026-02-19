package main.java.com.narxoz.rpg.characters;      

public interface Character {
    String getName();
    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();
    void displayStats(Character target);
    void useSpeacialAbility(Character target);

}

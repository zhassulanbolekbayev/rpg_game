package main.java.com.narxoz.rpg.characters;

public class Archer extends BaseCharacter {
    public Archer(String name) {
        super(name, 100, 80, 15, 30);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " shoots a powerful arrow!");
    }

    
}
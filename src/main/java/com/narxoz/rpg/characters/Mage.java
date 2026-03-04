package main.java.com.narxoz.rpg.characters;

class Mage extends BaseCharacter {
    public Mage(String name) {
        super(name, 80, 120, 10, 50);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " casts a powerful fireball!");
    }

    
}

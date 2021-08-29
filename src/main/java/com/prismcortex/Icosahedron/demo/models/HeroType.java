package com.prismcortex.Icosahedron.demo.models;

public enum HeroType {

    CHAMPION("Champion", "A warrior infused with magical power to strike down rivals and heal allies", 42,
                3, 15, 3, 1, 1, new Weapon("Broadsword", "Slice and Stab", "D6")),

    MAVERICK("Maverick", "An archery expert quick on their feet, able to eliminate rivals from a distance. " +
            "Their intuition helps discover hidden traps and treasures", 35, 2, 14, 1, 3, 2,
            new Weapon("Longbow", "Range and Pierce", "D6")),

    SOULSEER("Soul Seer", "A being surging with psychic power, capable of inflicting torture and terror upon their rivals",
                29, 1, 12, 3, 2, 2, new Weapon("Mace", "Smash and Slam", "D6")),

    WHISPER("Whisper", "A dark figure that moves through the shadows, dispatching rivals with no sound above a whisper",
                31, 3, 14, 1, 2, 2, new Weapon("Bone Dagger", "Slice and Stab", "D6"));

    private final String role;
    private final String info;
    private final int life;
    private final int attack;
    private final int defense;
    private final int magic;
    private final int speed;
    private final int charm;
    private final Object weapon;

    HeroType(String role, String info, int life, int attack, int defense, int magic, int speed, int charm, Object weapon) {
        this.role = role; this.info = info; this.life=life; this.attack=attack; this.defense=defense;
        this.magic=magic; this.speed=speed; this.charm=charm; this.weapon=weapon;
    }
    public String getDisplayName() {
        return role;
    }

    public String getInfo() {
        return info;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getMagic() {
        return magic;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCharm() {
        return charm;
    }

    public Object getWeapon() {
        return weapon;
    }
}

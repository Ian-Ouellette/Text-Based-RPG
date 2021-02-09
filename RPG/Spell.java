package RPG;

public enum Spell {
    FIREBALL(100),
    ENCHANT_WEAPON(50),
    LIGHTNING_BOLT(75);

    private final int cost;

    private Spell(int cost){
        this.cost = cost;
    }
}

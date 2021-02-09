package Spells;

public class Spell {
    private final String name;
    private final String description;
    private final int cost;

    public Spell(String name, int cost) {
        this.name = name;
        this.description = name;
        this.cost = cost;
    }

    public int castSpell(){
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}

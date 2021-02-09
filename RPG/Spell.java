package RPG;

public class Spell {
    private final String name;
    private final String description;
    private final int cost;

    public Spell(String name, int cost) {
        this.name = name;
        this.description = name;
        this.cost = cost;
    }

    public int castSpell(RPG.Player target, int cost){
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

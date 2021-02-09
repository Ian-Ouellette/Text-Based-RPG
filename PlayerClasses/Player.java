package PlayerClasses;

public class Player {
    private final String name;
    private final int maxHp;
    private final int maxMana;
    private int currentHp;
    private int currentMana;
    private boolean isBurned = false;
    private boolean isPoisoned = false;

    public Player(String name, int maxHp, int maxMana){
        this.name = name;
        this.maxHp = maxHp;
        this.maxMana = maxMana;
        this.currentHp = maxHp;
        this.currentMana = maxMana;
    }

    public Attack attack(){
        return null;
    }

    public void TakeDamage(Attack attack, double resistance){
        for (int hits : attack.getHits()){
            currentHp -= (hits * resistance);
        }

        currentHp = currentHp > 0 ? currentHp : 0;
    }

    public void TakeDamage(Attack attack){
        TakeDamage(attack,1.0);
    }

    public boolean isAlive(){
        return currentHp > 0;
    }

    public boolean isBurned(){
        return isBurned;
    }

    public boolean isPoisoned(){
        return isPoisoned;
    }

    public void heal(int amount){
        currentHp += amount;
        currentHp = currentHp < maxHp ? currentHp : maxHp;
    }

    public void gainMana(int amount){
        currentMana += amount;
        currentMana = currentMana < maxMana ? currentMana : maxMana;
    }

    public void castSpell(Spells.Spell spell) {
        if (currentMana > spell.getCost()) {
            currentMana -= spell.getCost();
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + " - Current Hp = " + currentHp;
    }
}

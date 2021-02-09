package RPG;

public class Wizard extends Player{
    public Wizard(String name){
        super(name,100,200);
    }

    @Override
    public Attack attack(){
        if (isAlive()){
            int[] hits = {15};
            return new Attack("Staff",hits,DamageType.PHYSICAL);
        } else {
            System.out.println(super.getName() + " is defeated");
            int[] hits = {};
            return new Attack("Defeated", hits, DamageType.NONE);
        }
    }

    public Spell castFireball(){
        if (this.currentMana > 100)
    }
}

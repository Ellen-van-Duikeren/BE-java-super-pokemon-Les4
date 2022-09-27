
//4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2`private` variabelen, 1 constructor, 2 methodes, 1 `override` methode, 2 getters en 2 setters bevatten.


public class Water extends Pokemon {
    private String weakness;
    private int attack;

    public Water(String name, int level, int hp, double height, double weight, String weakness) {
        super(name, level, hp, height, weight);
        this.weakness = weakness;
        attack = 20;
    }

    //methods---------------------------------------------------------------------------------------------------------
    public void raiseAttack(int amountRaiseAttack) {
        System.out.print("The original attack is: " + attack + ".");
        attack += amountRaiseAttack;
        System.out.println(" After strengthening, attack is: " + attack);
    }

    //Thunder Punch deals damage and has a 10% chance of paralyzing the target.
    public void thunderPunch() {
        System.out.print("Time for thunderpunch. YEAH! >>>>>> ");
        double var = Math.random();
        if (var <= 0.1) {
            System.out.println("You are paralyzed.");
        } else {
            System.out.println("You have got damage.");
        }
    }

    @Override
    public void printFood() {
        System.out.println("Pokemon " + getName() + " eats cyclons.");
    }

    //gettersNsetters-------------------------------------------------------------------------------------------------
    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

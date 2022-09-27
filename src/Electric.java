
//4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2`private` variabelen, 1 constructor, 2 methodes, 1 `override` methode, 2 getters en 2 setters bevatten.


public class Electric extends Pokemon {
    private String popularity;
    private int speed;

    public Electric(String name, int level, int hp, double height, double weight, int speed) {
        super(name, level, hp, height, weight);
        this.popularity = "the most popular";
        this.speed = speed;
    }

    //methods---------------------------------------------------------------------------------------------------------
    public void raiseSpeed(int raisingSpeedWith) {
        System.out.print("My speed was: " + speed + ".");
        speed += raisingSpeedWith;
        System.out.println(" After raising, my speed is now: " + speed + ".");
    }

    public void populair() {
        System.out.println("I, " + getName() + ", am really " + popularity + " Pokemon in this world.");
    }

    @Override
    public void raindance() {
        System.out.println("Raindance: No, no raindance. I am electric you know.");
    }

    @Override
    public void printFood() {
        System.out.println("Pokemon " + getName() + " drinks water.");
    }

    //gettersNsetters-------------------------------------------------------------------------------------------------
    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

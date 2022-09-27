//Een Pokemon klasse waarvan minimaal 2 `private` variabelen, 1 constructor, 2 methodes, 2 getters en 2 setters;
//hp = hit points = how much damage a pokemon can receive (0-100%), if 0 than faint > needing: rest / potion / synthesis

//bonus abstracte class
public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private double height;
    private double weight;

    public Pokemon() {
    }

    public Pokemon(String name, int level, int hp, double height, double weight) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.height = height;
        this.weight = weight;
    }


    // methods ----------------------------------------------------------------------------------
    public void printAbility() {
        System.out.println("Pokemon " + name + " has the ability: blaze");
    }

    // bonus abstracte methode
    public abstract void printFood();


    //Rain Dance causes a rain shower that lasts for 5 turns, and induces these additional effects:
    //The power of Water-type moves increases by 50%.
    //The power of Fire-type moves, Solar Beam and Solar Blade decreases by 50%.
    public void raindance() {
        System.out.println("Raindance: your power has been increased bij 50%.");
    }

    // gettersNsetters -----------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

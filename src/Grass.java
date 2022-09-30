
//4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2`private` variabelen, 1 constructor, 2 methodes, 1 `override` methode, 2 getters en 2 setters bevatten.

public class Grass extends Pokemon {
    private String needOfWater;
    private String category;


    public Grass(String name, int level, int hp, double height, double weight, String needOfWater, String category) {
        super(name, level, hp, height, weight);
        this.needOfWater = needOfWater;
        this.category = category;
    }

    public Grass(String name, int level, int hp, double height, double weight, String needOfWater) {
        super(name, level, hp, height, weight);
        this.needOfWater = needOfWater;
    }

    //methods---------------------------------------------------------------------------------------------------------
    public void printNeedOfWater() {
        System.out.println("Pokemon " + getName() + " needs " + needOfWater + " water.");
    }

    public void printCategory(String category) {
        System.out.println("The category of Pokemon " + getName() + " is " + category + ".");
    }

    // bonus abstracte methode
    @Override
    public void printFood() {
        System.out.println("Pokemon " + getName() + " eats plantbased.");
    }

    @Override
    public void printAbility() {
        System.out.println("Pokemon " + getName() + " has the ability: overgrow.");
    }


    //gettersNsetters-------------------------------------------------------------------------------------------------
    public String getNeedOfWater() {
        return needOfWater;
    }

    public void setNeedOfWater(String needOfWater) {
        this.needOfWater = needOfWater;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
} //closing class

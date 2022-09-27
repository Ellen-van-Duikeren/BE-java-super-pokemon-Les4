
//4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2`private` variabelen, 1 constructor, 2 methodes, 1 `override` methode, 2 getters en 2 setters bevatten.

public class Fire extends Pokemon {
    private String gender;
    private String specialAttack;

    public Fire(String name, int level, int hp, double height, double weight, String gender, String specialAttack) {
        super(name, level, hp, height, weight);
        this.gender = gender;
        this.specialAttack = specialAttack;
    }


    //methods---------------------------------------------------------------------------------------------------------
    public void changeGender() {
        System.out.print("The gender of this Pokemon " + getName() + " is: " + gender + ".");
        if (gender.equals("male")) {
            gender = "female";
        } else {
            gender = "male";
        }
        System.out.println(" After transgendering, the gender of this Pokemon became: " + gender + ".");
    }

    //    The user strikes the target with a burning lash. This also lowers the target's Defense stat. (100% chance)
    //    When a Pokémon is holding Firium Z and uses its Z-Power, Fire Lash turns into Inferno Overdrive and has base power 160.
    public void fireLash(boolean FiriumZ) {
        if (FiriumZ) {
            System.out.println("Fire Lash turned into Inferno Overdrive and has base power 160.");
        } else {
            System.out.println("Pokemon " + getName() + " striked you with a burning lash. Your defense stat has been lowered now. Gotcha!");
        }
    }

    @Override
    public void raindance() {
        System.out.println("Raindance: your power has been decreased by 50%.");
    }

    @Override
    public void printFood() {
        System.out.println("Pokemon " + getName() + " eats thunders.");
    }

    //gettersNsetters-------------------------------------------------------------------------------------------------
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }
}

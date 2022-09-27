
//- In de `main`-methode worden vier verschillende Pokèmon-objecten van verschillende klassen geïnstantieerd- en gedeclareerd. Met behulp van deze objectnamen kunnen de methodes van de verschillende klassen worden uitgevoerd;
//Deze methodes mogen `void` teruggeven en een `system.out.println` uitvoeren.

import java.text.DecimalFormat;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        //bron: https://www.pokemon.com/nl/pokedex/

        //Grass--------------------------------------------------------------------------------------------------
        System.out.println("\nGrass Pokemon:");
        Grass bulbasaur = new Grass("Bulbasaur", 10, 20, 0.7, 6.9, "lots of");
        bulbasaur.printNeedOfWater();

        Grass ivysaur = new Grass("Ivysaur", 15, 27, 1.0, 13.0, "little");
        ivysaur.printNeedOfWater();

        bulbasaur.printAbility();
        bulbasaur.printFood();
        bulbasaur.printCategory("seed");
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(bulbasaur.getName() + " is " + df.format(abs(bulbasaur.getHeight() - ivysaur.getHeight())) + " meters smaller than " + ivysaur.getName() + ".");

        //Fire--------------------------------------------------------------------------------------------------
        System.out.println("\nFire Pokemon:");
        Fire charmeleon = new Fire("Charmeleon", 5, 27, 1.1, 19.0, "male", "blaze");
        charmeleon.changeGender();
        charmeleon.fireLash(true);
        charmeleon.raindance();
        System.out.println(charmeleon.getName() + " weighs " + df.format(abs(ivysaur.getWeight() - charmeleon.getWeight())) + " kilos more than " + ivysaur.getName() + ".");

        //Water--------------------------------------------------------------------------------------------------
        System.out.println("\nWater Pokemon:");
        Water squirtle = new Water("Squirtle", 20, 20, 0.5, 9.0, "grass");
        System.out.println("The weakness of Pokemon " + squirtle.getName() + " is: " + squirtle.getWeakness() + ".");
        squirtle.raiseAttack(4);
        squirtle.printFood();
        squirtle.thunderPunch();

        //Electric--------------------------------------------------------------------------------------------------
        System.out.println("\nElectric Pokemon:");
        Electric pikachu = new Electric("Pikachu", 45, 20, 0.4, 6.0, 43);
        pikachu.populair();
        pikachu.raiseSpeed(54);
        pikachu.raindance();
        pikachu.setName("Pikhatsjoe");
        System.out.println("My new name is: " + pikachu.getName() + ".");

        // bonus 3, manier A: 2 verschillende types in 1 pokemon > zie ook nieuwe class SuperClass
        System.out.println("\nBonusopdracht: pokemon met 2 classes op de ene manier:");
        SuperClass twoClassesPokemon = new SuperClass("TwoClassesPokemon", 25, 67, 1.3, 7.9, 45, 93);
        // methode uit electric
        twoClassesPokemon.populair();
        // methode uit water, echter in SuperClass gekopieerd (dus vals gespeeld ;) ) en gettersNsetters gemaakt voor attack en var attack in class opgenomen en in constructor benoemd
        twoClassesPokemon.raiseAttack(23);
        twoClassesPokemon.thunderPunch();
        // @override methode
        twoClassesPokemon.raindance();


        // bonus 3: manier B: 2 verschillende types in 1 pokemon op een andere manier opgelost > zie ook nieuwe class ElectricTwo = copy van Electric and extends Water ipv Pokemon (en uiteraard constructor ook ElectricTwo genoemd)
        System.out.println("\nBonusopdracht: pokemon met 2 classes op de andere manier:");
        ElectricTwo twoClassesPokemon2 = new ElectricTwo("TwoClassesPokemon2", 13, 56, 0.4, 3.9, "grass", "not so populair", 12);
        // methode uit electric
        twoClassesPokemon2.populair();
        // methode uit water
        twoClassesPokemon2.raiseAttack(34);
        twoClassesPokemon2.thunderPunch();
        // @override methode
        twoClassesPokemon2.raindance();
        twoClassesPokemon2.printFood();
    }

    //methods---------------------------------------------------------------------------------------------------------
    public void eat(String food) {
        System.out.println("I eat " + food);
    }

    public void work() {
        System.out.println("The person works.");
    }
}


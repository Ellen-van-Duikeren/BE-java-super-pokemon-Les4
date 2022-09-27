//Bonusopdracht 3: Probeer een manier te vinden waardoor één Pokèmon twee verschillende types tegelijk zou kunnen zijn. Kun je dit implementeren?
//Manier A: In eerste instantie kwam ik niet uit deze opdracht, dus ik heb Johan om advies gevraagd: "antwoord Johan:  is er een manier dat we een superklas kunnen maken die bijvoorbeeld electric extend en in deze klasse waterpokemon methodes zetten." Hieronder mijn interpretatie hiervan, waarbij ik letterlijk Electric extend en de methodes van Water hard copy hier in heb gezet.

public class SuperClass extends Electric {
    private int attack;

    public SuperClass(String name, int level, int hp, double height, double weight, int speed, int attack) {
        super(name, level, hp, height, weight, speed);
        this.attack = attack;
    }

    // methods gekopieerd uit water op advies van Johan -----------------------------------------------------------------------------------------------
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


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

}

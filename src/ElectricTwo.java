// bonus 3: manier B: 2 verschillende types in 1 pokemon op een andere manier opgelost. class ElectricTwo = copy van Electric and extends Water (en uiteraard constructor ook ElectricTwo genoemd)

public class ElectricTwo extends Water {
    private String popularity;
    private int speed;

    public ElectricTwo(String name, int level, int hp, double height, double weight, String weakness, String popularity, int speed) {
        super(name, level, hp, height, weight, weakness);
        this.popularity = popularity;
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


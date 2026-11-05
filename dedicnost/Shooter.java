public class Shooter extends Soldier {
    //zdedil jsem od Soldier (name, armor, power, hp)

    //dopiseme nove atributy
    private int accuracy;

    //konstruktor
    public Shooter(String name, int power, int armor, int hp, int accuracy) {
        //zavolame konstruktor predka
        super(name, power, armor, hp); 
        //vyresime jen nove parametry
        if((accuracy < 0) || (accuracy > 100)) {
            //neplatna presnost
            throw new IllegalArgumentException("Presnost musi byt 0-100");
        }
        //kdyz to dojde sem, presnost je ok
        this.accuracy = accuracy;
    }
}

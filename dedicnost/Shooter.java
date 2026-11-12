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

    //getter
    public int getAccuracy() {
        return accuracy;
    }

    //setter
    public void setAccuracy(int accuracy) {
        //kontrola
        if((accuracy >= 0) && (accuracy <= 100)) {
            //presnost je ok
            this.accuracy = accuracy;
        }
    }

    @Override 
    public String toString() {
        //vyuziju toString predka
        String vypis = super.toString();
        if(getHp() > 0) {
            //strelec zije
            vypis += " / acc: " + getAccuracy();
        }
        return vypis;
    }

    public void shoot(Soldier enemy, int accuracy) {
        if(getHp() > 0) {
            //jsem zivy mohu strilet
            //kontrola presnosti
            if(accuracy < getAccuracy()) {
                //zasah
            } else {
                //vedle
            }
        } else {
            //jsem mrtvy nestrilim
            System.out.println("Nelze strilet");
        }
    }
}

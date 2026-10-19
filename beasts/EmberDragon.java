package beasts;

public class EmberDragon {

    //atributy
    private int power;
    private int armor;
    private int mana;
    private int hp;

    //pomocne atributy
    //true - leti / false - neleti
    private boolean flying;

    //konstruktor
    public EmberDragon(int power, int armor, int mana, int hp) {
        //kontrola power, armor, mana
        if((power < 0) || (armor < 0) || (mana < 0)) {
            //neplatne parametry -> vyhodime vyjimku
            throw new IllegalArgumentException("power, armor a mana nesmi byt zaporne");
        }
        //kdyz to projde sem, tak power a armor a mana jsou 0 a vice
        this.power = power;
        this.armor = armor;
        this.mana = mana;
        //hp nekontroluju -> zkopiruju
        this.hp = hp;
        //kazdy novy drak bude zacinat jako na zemi / neleti
        flying = false;
    }

    //gettery
    public int getPower() {
        //var B - lepsi
        //pokud drak leti, ma polovicni power
        if(getFlying() == true) {
            return (power / 2);
        } else {
            return power;
        }
    }

    public int getArmor() {
        //var B - lepsi
        //jestli ze drak leti ma dvojnasobny armor
        if(getFlying() == true) {
            return (armor * 2);
        } else {
            return armor;
        }
    }

    public int getMana() {
        return mana;
    }

    public int getHp() {
        return hp;
    }

    public boolean getFlying() {
        return flying;
    }

    //settery var 1 - s vyjimkou
    public void setPower(int power) {
        if(power < 0) {
            //je to spatny power
            throw new IllegalArgumentException("Power nesmi byt zaporny");
        }
        //pokud to dojde sem, tak je power ok
        this.power = power;
    }

    //setter var 2 - bez vyjimky
    public void setArmor(int armor) {
        if(armor >= 0) {
            //armor je ok -> upravim ho
            this.armor = armor;
        }
    }

    public void setMana(int mana) {
        if(mana >= 0) {
            //mana je ok -> upravim ji
            this.mana = mana;
        }
    }

    //hp se nekontroluji
    public void setHp(int hp) {
        this.hp = hp;
    }

    //flying nekontroluju
    public void setFlying(boolean flying) {
        this.flying = flying;
    }
    
    //toString
    @Override 
    public String toString() {
        return "Ember Dragon - pwr: " + getPower() + " /arm: " + getArmor() + 
            " /mana: " + getMana() + " /hp: " + getHp();
    }

    //prepinani letani
    public void flying() {
        //kontrola jestli drak zije
        if(getHp() > 0) {
            //drak zije
            //kontrola aktualniho stavu
            if(getFlying() == true) {
                //aktualne leti -> pristavame
                setFlying(false);
                System.out.println("Drak pristal");
                /* var A - ne tak dobra */
                //setArmor(getArmor() / 2);
                //setPower(getPower() * 2);
            } else {
                //aktualne neleti -> vzletneme
                setFlying(true);
                System.out.println("Drak vzletl");
                /* var A - ne tak dobra */
                //setArmor(getArmor() * 2);
                //setPower(getPower() / 2);
            }
        } else {
            //drak je mrtvy
            System.out.println("Mrtvy drak neleta");
        }
    }

    public void ignite() {
        //kontrola zivotu
        if(getHp() > 0) {
            //drak je zivy
            if(getMana() >= 6) {
                //mam manu
                //vzplanu - var A
                //setArmor((int)(getArmor() * 1.25));
                //vzplanu - var B
                setArmor((getArmor() * 5) / 4);
                //snizim manu
                setMana(getMana() - 6);
                //vypis
                System.out.println("Zapaleno");
            } else {
                //nemam manu
                System.out.println("Nedostatek many");
            }
        } else {
            //drak je mrtvy
            System.out.println("Mrtvy drak uz nevzplane");
        }
    }
}

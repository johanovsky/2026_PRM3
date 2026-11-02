public class Soldier {
    //atributy
    private String name;
    private int power;
    private int armor;
    private int hp;

    //konstruktor
    public Soldier(String name, int power, int armor, int hp) {
        //jmeno nekontroluji
        this.name = name;
        //hp nekontroluju
        this.hp = hp;

        //armor a power nesmi byt zaporne
        if((power < 0) || (armor < 0)) {
            throw new IllegalArgumentException("Power a armor nesmi byt zaporny");
        }
        //kdyz to dojde sem, tak power a armor je ok
        this.power = power;
        this.armor = armor;
    }

    //gettery
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getArmor() {
        return armor;
    }

    public int getHp() {
        return hp;
    }

    //settery
    //jmeno nekontroluju
    public void setName(String name) {
        this.name = name;
    }

    //hp nekontroluju
    public void setHp(int hp) {
        this.hp = hp;
    }

    //power nesmi klesnout pod 0
    public void setPower(int power) {
        if(power >= 0) {
            this.power = power;
        }
    }

    //armor nesmi klesnout pod 0
    public void setArmor(int armor) {
        if(armor >= 0) {
            this.armor = armor;
        }
    }

    //toString
    @Override 
    public String toString() {
        String vypis = getName() + ": ";
        if(getHp() > 0) {
            //vojak zije -> vypisu vsechny stats
            vypis += "pwr: " + getPower() + 
                     " / arm: " + getArmor() + 
                     " / hp: "  + getHp();
        } else {
            //vojak nezije -> smutny vypis
            vypis += " je mrtvy";
        }
        //vratime vysledek
        return vypis;
    }

    /*
    public static void main(String[] args) {
        Soldier s1 = new Soldier("Svejk", 10, 10, 10);
        System.out.println(s1);
    }
    */

    public void fight(Soldier enemy) {
        //oba musi byt zivi
        if((getHp() > 0) && (enemy.getHp() > 0)) {
            //oba ziji bude se bojovat
            //spocitam dmg utocnika
            int dmg = getPower() - enemy.getArmor();
            if(dmg > 0) {
                //utocnik dal ranu
                enemy.setHp(enemy.getHp() - dmg);
                System.out.println("Utocnik dal zasah: " + dmg);
            }
            //spocitame dmg obrance
            dmg = enemy.getPower() - getArmor();
            if(dmg > 0) {
                //obrance vratil ranu
                setHp(getHp() - dmg);
                System.out.println("Obrance dal zasah: " + dmg);
            }
        } else {
            //alespon jeden nezije -> nebojuje se
            System.out.println("Nelze bojovat");
        }
    }
}

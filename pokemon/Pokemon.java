public class Pokemon {
    
    //atributy
    private int hp;
    private int attack;
    private int defense;

    //konstruktor
    public Pokemon(int hp, int attack, int defense) {
        if((hp <= 0) || (attack < 0) || (defense < 0)) {
            //neplatny pokemon
            throw new IllegalArgumentException("Neplatne parametry");
        }
        //kdyz to projde sem, tak jsou parametry ok
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    //gettery
    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    //settery
    public void setHp(int hp) {
        //hp nekontroluju
        this.hp = hp;
    }

    public void setAttack(int attack) {
        //nepripoustim zap. attack
        if(attack >= 0) {
            this.attack = attack;
        }
    }

    public void setDefense(int defense) {
        //nepripoustim zap. defense
        if(defense >= 0) {
            this.defense = defense;
        }
    }

    @Override 
    public String toString() {
        if(getHp() > 0) {
            //pokemon zije
            return "hp: " + getHp() 
            + " / att: " + getAttack() 
            + " / def: " + getDefense();
        } else {
            //pokemon nezije
            return "@.@";
        }
    }

    public void combat(Pokemon enemy) {
        if((getHp() > 0) && (enemy.getHp() > 0)) {
            //oba dva ziji
            if(this.equals(enemy)) {
                //utocim sam na sebe
                System.out.println("Nelze utocit sam na sebe");
            } else {
                //utocim na nekoho jineho a jsme oba zivi
                //souboj zuby + drapy
                //nejprve rana utocnika
                int dmg = getAttack() - enemy.getDefense();
                if(dmg > 0) {
                    //utocnik zasahl
                    System.out.println("Utocnik zasahl obrance");
                    enemy.setHp(enemy.getHp() - dmg);
                }
                //pote rana obrance
                dmg = enemy.getAttack() - getDefense();
                if(dmg > 0) {
                    //obrance zasahl
                    System.out.println("Obrance zasahl utocnika");
                    setHp(getHp() - dmg);
                }
            }
        } else {
            //alespon jeden nezije
            System.out.println("Nelze bojovat");
        }
    }
}

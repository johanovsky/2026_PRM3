package beasts;

public class EmberDragon {

    //atributy
    private int power;
    private int armor;
    private int mana;
    private int hp;

    //konstruktor
    public EmberDragon(int power, int armor, int mana, int hp) {
        //kontrola power
        if(power < 0) {
            //power je spatne -> default 0
            this.power = 0;
        } else {
            //power je ok -> zkopiruju
            this.power = power;
        }
        //kontrola armor
        if(armor < 0) {
            //armor je spatne -> default 0
            this.armor = 0;
        } else {
            //armor je ok -> zkopiruju
            this.armor = armor;
        }
        //kontrola mana
        if(mana < 0) {
            //mana je spatne -> default 0
            this.mana = 0;
        } else {
            //mana je ok -> zkopiruju
            this.mana = mana;
        }
        //hp nekontroluju -> zkopiruju
        this.hp = hp;
        
    }
}

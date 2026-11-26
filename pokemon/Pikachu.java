public class Pikachu extends Pokemon {
    //atributy navic
    private int electric;

    //konstruktor
    public Pikachu(int electric, int hp, int attack, int defense)  {
        //vyuzijeme konstruktor predka
        super(hp, attack, defense);
        //kontrola nove vlastnosti
        if(electric < 0) {
            throw new IllegalArgumentException("Electric nesmi byt zaporna");
        }
        //electric je ok
        this.electric = electric;
        //kontrolni vypis
        System.out.println("Volim si tebe Pikachu");
    }

    //getter a setter na electric
    public int getElectric() {
        return electric;
    }

    public void setElectric(int electric) {
        if(electric >= 0) {
            //electric je ok -> zmenim ho
            this.electric = electric;
        }
    }
}

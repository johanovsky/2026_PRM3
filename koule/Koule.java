package koule;

public class Koule {

    //atributy
    private double polomer;

    //konstruktor
    public Koule(double polomer) {
        //kontrola nuloveho, nebo zaporneho polomeru
        if(polomer <= 0) {
            //je to spatne -> default
            this.polomer = 1;
        } else {
            //polomer je spravne zadany -> zkopirujeme
            this.polomer = polomer;
        }
    }

    //getter
    public double getPolomer() {
        return polomer;
    }

    //setter
    //s kontrolou
    public void setPolomer(int polomer) {
        if(polomer > 0) {
            //je to spravne -> zmenim ho
            this.polomer = polomer;
        } else {
            //neni to spravne -> neudelam nic
        }
    }

    //toString
    @Override
    public String toString() {
        String vysl = "koule o polomeru: ";
        vysl += getPolomer();

        return vysl;
    }

    //dalsi metody
    public float povrch() {
        return (float)(4 * Math.PI * polomer * polomer);
    }

    public float objem() {
        return (float)((double)4 / 3 * Math.PI * polomer * polomer * polomer);
    }

    public float prumer() {
        return (float)(2 * getPolomer());
    }
}

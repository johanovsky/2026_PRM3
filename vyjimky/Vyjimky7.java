public class Vyjimky7 {
    
    //trida ma atribut
    private int hodnota;

    //konstruktor
    public Vyjimky7(int hodnota) {
        //akceptuji pouze kladne, nebo nulove hodnoty
        if(hodnota < 0) {
            //je zaporna -> spatne
            //zastavime konstruktor
            throw new IllegalArgumentException("Hodnota nesmi byt zaporna");
        }
        //pokud to dojde sem -> hodnota je v poradku
        this.hodnota = hodnota;
    }

    public static void main(String[] args) {
        Vyjimky7 a = null;
        try {
            a = new Vyjimky7(-10);
        } catch(IllegalArgumentException e) {
            System.out.println("Chycena vyjimka: ");
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }

}

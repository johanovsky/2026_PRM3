package koule;

public class TestKoule {
    public static void main(String[] args) {
        //test konstruktoru
        Koule k1 = new Koule(2.5);
        //vypis
        System.out.println(k1);
        //test rozbite koule
        Koule k2 = new Koule(-4);
        //vypis
        System.out.println(k2);
        //test getteru
        System.out.println("polomer koule je: " + k1.getPolomer());
        //test setteru
        k2.setPolomer(45);
        //vypis
        System.out.println(k2);
        //test povrchu
        System.out.println("Povrch koule o polomeru: " + k1.getPolomer() + " je: " + k1.povrch());

        //test objemu
        System.out.println("Objem koule o polomeru: " + k1.getPolomer() + " je: " + k1.objem());

        //test prumeru
        System.out.println("Prumer koule o polomeru: " + k1.getPolomer() + " je: " + k1.prumer());

    }
}

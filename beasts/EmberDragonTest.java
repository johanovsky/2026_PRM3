package beasts;

public class EmberDragonTest {
    public static void main(String[] args) {
        EmberDragon ed1 = null;
        try {
            ed1 = new EmberDragon(10, 5, 10, 20);
        } catch(IllegalArgumentException e) {
            System.out.println("Neplatny drak");
        }
        //test vzplanuti
        System.out.println(ed1);
        ed1.ignite();
        System.out.println(ed1);
        //test letani
        ed1.flying();
        System.out.println("Letici drak: " + ed1);
        ed1.flying();
        System.out.println("Sedici drak: " + ed1);

        //test plivani ohne
        //cvicny cil
        EmberDragon ed2 = new EmberDragon(15, 10, 5, 10);
        //kontrolni vypis
        System.out.println(ed1);
        System.out.println(ed2);
        //nepovedeny utok
        ed1.fireBreath(ed2);
        System.out.println(ed1);
        System.out.println(ed2);
        //dobiju manu
        ed1.setMana(10);
        ed1.fireBreath(ed2);
        System.out.println(ed1);
        System.out.println(ed2);
    }
}

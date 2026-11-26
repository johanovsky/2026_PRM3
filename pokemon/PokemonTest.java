public class PokemonTest {
    public static void main(String[] args) {
        //obecni cvicni pokemoni
        Pokemon p1 = new Pokemon(10, 15, 5);
        Pokemon p2 = new Pokemon(20, 10, 10);

        //kontrolni vypis
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        //test souboje
        p1.combat(p1);  // tohle je sebepozkozovani
        p1.combat(p2);  // tohle uz je norm. souboj

        //kontrolni vypis
        System.out.println("Po souboji");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        p2.combat(p1);
        System.out.println("Po souboji 2");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
    }
}

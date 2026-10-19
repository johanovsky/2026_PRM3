package beasts;

public class EmberDragonTest {
    public static void main(String[] args) {
        EmberDragon ed1 = null;
        try {
            ed1 = new EmberDragon(10, 5, 10, 20);
        } catch(IllegalArgumentException e) {
            System.out.println("Neplatny drak");
        }
        System.out.println(ed1);
        ed1.ignite();
        System.out.println(ed1);
    }
}

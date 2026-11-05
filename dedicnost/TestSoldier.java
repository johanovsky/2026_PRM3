public class TestSoldier {
    public static void main(String[] args) {
        Soldier s1 = new Soldier("Svejk", 10, 20, 20);
        System.out.println(s1);
        Soldier s2 = new Soldier("Lukas", 15, 10, 15);
        System.out.println(s2);

        s1.fight(s2);
        System.out.println("Po souboji:");
        System.out.println(s1);
        System.out.println(s2);

        Shooter s3 = new Shooter("Katz", 10, 10, 10, 10);
    }
}

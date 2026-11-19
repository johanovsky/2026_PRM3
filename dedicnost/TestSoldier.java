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

        Shooter s3 = new Shooter("Katz", 15, 10, 10, 10);
        System.out.println(s3);

        s3.fight(s2);
        System.out.println("Po souboji");
        System.out.println(s2);
        System.out.println(s3);

        s3.shoot(s2, 9);
        System.out.println("Po strelbe");
        System.out.println(s2);
        System.out.println(s3);

        Shooter s4 = new Shooter("Grünstein", 15, 10, 10, 50);

        s4.shoot(s3, 15);
        System.out.println("strleci po sobe strili");
        System.out.println(s3);
        System.out.println(s4);

        //ozivime Katze
        s3.setHp(5);
        s4.fight(s3);
        System.out.println("strleci se perou");
        System.out.println(s3);
        System.out.println(s4);

        //uspesny trenink
        s3.train(s4);

        //toto nepujde
        //s4.train(s1);

    }
}

package tridy;

public class TestStudent {
    public static void main(String[] args) {
        //vytvorime instanci studenta
        Student s1 = new Student("Franta", "Voprsalek", -18, true);
        //vypis atributu do konzole

        System.out.println("jmeno: " + s1.getName());
        System.out.println("prijmeni: " + s1.getSurname());
        System.out.println("vek: " + s1.getAge());
        System.out.println("pohlavi: " + s1.getSex());

        //predelame instanci
        s1.setName("Frantisek");
        s1.setSurname("Novak");
        s1.setAge(20);

        System.out.println("jmeno: " + s1.getName());
        System.out.println("prijmeni: " + s1.getSurname());
        System.out.println("vek: " + s1.getAge());
        System.out.println("pohlavi: " + s1.getSex());
    }
}
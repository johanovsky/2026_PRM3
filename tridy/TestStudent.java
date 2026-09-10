package tridy;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        //zapis do atributu instance
        s1.name = "Franta";
        s1.surname = "Voprsalek";
        //vypis atributu do konzole
        System.out.println(s1.surname);
    }
}
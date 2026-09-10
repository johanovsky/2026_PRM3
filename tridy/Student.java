package tridy;

public class Student {

    //vlastnosti / atributy / data / fields
    String name;
    String surname;
    int age;
    boolean sex;

    public static void main(String[] args) {

        //vytvoreni instance moji tridy
        Student s1 = new Student();
        //zapis do atributu instance
        s1.name = "Franta";
        s1.surname = "Voprsalek";
        //vypis atributu do konzole
        System.out.println(s1.surname);
    }
}
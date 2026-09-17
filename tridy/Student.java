package tridy;

public class Student {

    //vlastnosti / atributy / data / fields
    //modifikator pristupu (private / public / protected)
    private String name;
    private String surname;
    private int age;
    private boolean sex;

    //metody
    //konstruktor
    //naplnime data objektu, svymi hodnotami
    public Student(String name, String surname, int age, boolean sex) {
        this.name = name;
        this.surname = surname;
        if(age < 0) {
            //je to spatny vek -> dame default
            age = 0;
        } else {
            this.age = age;
        }
        this.sex = sex;
    }

    //metody pro precteni dat - gettery
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        if(sex == false) {
            return 18;
        } else {
            return age;
        }
    }

    public boolean getSex() {
        return sex;
    }

    //metody pro zmenu dat - settery
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if(age >= 0) {
            //tak to je v poradku
            this.age = age;
        }
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override 
    public String toString() {
        String vys = "Jmeno: " + getName() + ", prijmeni: " + getSurname() + 
        ", vek: " + getAge() + ", pohlavi: ";
        if(getSex() == true) {
            vys += "muz";
        } else {
            vys += "zena";
        }
        return vys;
    }

    /*
    public static void main(String[] args) {

        //vytvoreni instance moji tridy
        Student s1 = new Student();
        //zapis do atributu instance
        s1.name = "Franta";
        s1.surname = "Voprsalek";
        //vypis atributu do konzole
        System.out.println(s1.surname);
    }
    */
}
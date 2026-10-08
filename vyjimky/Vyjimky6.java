public class Vyjimky6 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } finally {
            System.out.println("Tohle se vzdy provede");
        }
        System.out.println("Tohle uz se nevypise");
    }
}

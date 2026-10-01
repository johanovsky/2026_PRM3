public class Vyjimky2 {
    //kod s osetrenim vyjimky
    public static void main(String[] args) {
        try {
            //nebezpecny kod
            int a = 10 / 0;
            System.out.println("Hodnota: " + a);
        } catch(ArithmeticException e) {
            //sem kod, ktery se ma spustit, kdyz vyjimka nastane
            System.out.println("Nastala aritm. vyjimka");
        }
        //program jede dal
        System.out.println("Tohle se vypise");
    }
}

public class Vyjimky3 {
    public static void main(String[] args) {
        //pomocna promenna
        int a;
        //pomocne pole
        int pole[] = new int[5];
        try {
            //nebezpecny kod - deleni nulou
            a = 10 / 1;
            System.out.println("Hodnota: " + a);
            //nebezpecny kod - pristup mimo pole
            pole[0] = 10;
        } catch(ArithmeticException e) {
            //sem kod, ktery se ma spustit, kdyz vyjimka nastane
            System.out.println("Nastala aritm. vyjimka");
        } catch(ArrayIndexOutOfBoundsException e) {
            //sem kod, ktery se ma spustit, kdyz vyjimka nastane
            System.out.println("Nastala vyjimka pristup mimo pole");
        }
        //program jede dal
        System.out.println("Tohle se vypise");
    }
}

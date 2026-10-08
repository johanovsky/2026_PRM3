import java.io.IOException;

public class Vyjimky4 {
    public static void main(String[] args) {
        //pomocna promenna
        int a;
        //pomocne pole
        int pole[] = new int[5];
        try {
            //nebezpecny kod - deleni nulou
            //a = 10 / 0;
            //System.out.println("Hodnota: " + a);
            //nebezpecny kod - pristup mimo pole
            pole[0] = 10;
            //vytvorime IO
            throw new IOException();
        //kdyz radime vyjimky za sebou, tak vzdy od nejpresnejsi po nejobecnejsi
        } catch(ArithmeticException e) {
            //sem kod, ktery se ma spustit, kdyz vyjimka nastane
            System.out.println("Nastala aritm. vyjimka");
        } catch(RuntimeException e) {
            //sem kod, ktery se ma spustit, kdyz vyjimka nastane
            System.out.println("Nastala vyjimka za behu");
        } catch(Exception e) {
            //sem kod, ktery se ma spustit, kdyz vyjimka nastane
            System.out.println("Nastala vyjimka");
        }
        //program jede dal
        System.out.println("Tohle se vypise");
    }
}

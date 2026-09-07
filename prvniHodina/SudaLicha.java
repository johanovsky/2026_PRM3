package prvniHodina;

import java.util.Scanner;

public class SudaLicha {
    public static void main(String[] args) {
        //vytvoreni instance Scanneru
        Scanner scan = new Scanner(System.in);
        //deklarace a inicializace celociselne promenne
        int cislo = 0;
        //kontrolni vypis
        System.out.println(cislo);
        //nacteme pomoci Scanneru cele cislo
        cislo = scan.nextInt();
        //kontrolni vypis
        System.out.println(cislo);
        //test sude / liche
        if((cislo % 2) == 1) {
            //je sude
            System.out.println("Cislo je liche");
        } else {
            //je liche
            System.out.println("Cislo je sude");
        }
    }
}
package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
            String vastaus = scanner.nextLine();
            KPSPeli peli = null;
            if (vastaus.endsWith("a")) {
                peli = KPSTehdas.getKaksinpeli(scanner);
            } else if (vastaus.endsWith("b")) {
                peli = KPSTehdas.getYksinpeli(scanner);
            } else if (vastaus.endsWith("c")) {
                peli = KPSTehdas.getVaikeaYksinpeli(scanner);
            }
            if (peli != null) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                peli.pelaa();
            } else break;
        }

    }

}

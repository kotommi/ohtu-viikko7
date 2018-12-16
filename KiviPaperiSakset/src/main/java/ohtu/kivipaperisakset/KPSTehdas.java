package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTehdas {

    public static KPSPeli getKaksinpeli(Scanner scanner) {
        return new KPSPelaajaVsPelaaja(scanner);
    }

    public static KPSPeli getYksinpeli(Scanner scanner) {
        return new KPSTekoaly(scanner, new Tekoaly());
    }

    public static KPSPeli getVaikeaYksinpeli(Scanner scanner) {
        return new KPSTekoaly(scanner, new TekoalyParannettu(20));
    }
}

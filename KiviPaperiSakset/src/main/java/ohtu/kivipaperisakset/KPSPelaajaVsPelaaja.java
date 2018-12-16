package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPSPeli {

    public KPSPelaajaVsPelaaja(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String tokanSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();
    }
}
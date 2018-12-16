package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPSPeli {

    private KPSAI tekoaly;

    public KPSTekoaly(Scanner scanner, KPSAI tekoaly) {
        super(scanner);
        this.tekoaly = tekoaly;
    }

    @Override
    public String tokanSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
        return tokanSiirto;
    }
}
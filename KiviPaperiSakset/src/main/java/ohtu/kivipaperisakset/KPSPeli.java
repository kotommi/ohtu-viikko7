package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSPeli {

    final protected Scanner scanner;
    final private Tuomari tuomari;
    protected String ekanSiirto;
    protected String tokanSiirto;

    protected KPSPeli(Scanner scanner) {
        this.scanner = scanner;
        this.tuomari = new Tuomari();
    }


    public void pelaa() {


        while (true) {

            ekanSiirto = ekanSiirto();
            tokanSiirto = tokanSiirto();

            if (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
                tuomaroi();
            } else break;
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    private void tuomaroi() {
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(tuomari);
        System.out.println();
    }

    private String ekanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    protected abstract String tokanSiirto();

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}

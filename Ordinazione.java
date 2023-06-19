import java.util.ArrayList;
import java.util.List;

public class Ordinazione {
    private ArrayList<Piatto> piattiOrdinati;

    public Ordinazione() {
        piattiOrdinati = new ArrayList<>();
    }

    public void aggiungiPiatto(Piatto piatto) {
        piattiOrdinati.add(piatto);
    }

    public double calcolaTotale() {
        double totale = 0.0;
        for (Piatto piatto : piattiOrdinati) {
            totale += piatto.getPrezzo();
        }
        return totale;
    }

    public void stampaOrdinazione() {
        System.out.println("Ha ordinato:");
        for (Piatto piatto : piattiOrdinati) {
            System.out.println("Piatto: " + piatto.getIngredienti());
            System.out.println("Chef: " + piatto.getChef());
            System.out.println("Prezzo: " + piatto.getPrezzo());
            System.out.println();
        }
    }
}

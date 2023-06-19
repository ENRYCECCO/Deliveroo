import java.util.ArrayList;
import java.util.List;


public class Menu {
    private ArrayList<Piatto> piatti;

    public Menu() {
        piatti = new ArrayList<>();
    }

    public void aggiungiPiatto(String ingredienti, double prezzo, String chef) {
        Piatto piatto = new Piatto(ingredienti, prezzo, chef);
        piatti.add(piatto);
    }

    public void stampaMenu() {
        int i = 1;
        for (Piatto piatto : piatti) {
            System.out.println(i + " : " );
            System.out.println("Ingredienti: " + piatto.getIngredienti());
            System.out.println("Prezzo: " + piatto.getPrezzo());
            System.out.println("Chef: " + piatto.getChef());
            System.out.println();
            i++;
        }
    }
}

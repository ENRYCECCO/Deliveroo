public class Piatto {
    private String ingredienti;
    private double prezzo;
    private String chef;

    public Piatto(String ingredienti, double prezzo, String chef) {
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
        this.chef = chef;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getChef() {
        return chef;
    }
}
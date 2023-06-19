import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ordinazione ordinazione = new Ordinazione();
        ArrayList<String> Utenti = new ArrayList<>();
        ArrayList<String> PassUtenti = new ArrayList<>();

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        Menu menu = new Menu();

        Piatto piatto1 = new Piatto("Spaghetti alla carbonara", 12.99, "Chef Mario");
        Piatto piatto2 = new Piatto("Tagliata di manzo", 24.99, "Chef Luigi");
        Piatto piatto3 = new Piatto("Tiramisù", 7.99, "Chef Maria");

        menu.aggiungiPiatto("Spaghetti alla carbonara", 12.99, "Chef Mario");
        menu.aggiungiPiatto("Tagliata di manzo", 24.99, "Chef Luigi");
        menu.aggiungiPiatto("Tiramisù", 7.99, "Chef Maria");

        System.out.println("Benvenuto!");
        int scelta = 0;
        boolean access = false;
        int log = 0;

        do {

            System.out.println("1. Registrazione");
            System.out.println("2. Login");
            System.out.println("3. Ordinare");
            System.out.println("4. Esci");

            System.out.print("Seleziona un'opzione: ");

            scelta = scannerInt.nextInt(); // scelta del menù

            switch (scelta) {
                case 1:

                    // Registrazione

                    System.out.println("Inserisci il tuo nome: ");
                    String nome = scannerString.nextLine();
                    System.out.println("Inserisci la password: ");
                    String pass = scannerString.nextLine();
                    Utenti.add(nome);
                    PassUtenti.add(pass);
                    break;

                case 2:

                    // Login

                    System.out.println("Login");
                    System.out.println("Inserisci il tuo nome: ");
                    String nomeL = scannerString.nextLine();
                    System.out.println("Inserisci la password: ");
                    String passL = scannerString.nextLine();

                    for (int i = 0; i < Utenti.size(); i++) {
                        String currentUsername = Utenti.get(i);
                        String currentPassword = PassUtenti.get(i);
                        if (nomeL.equals(currentUsername) && passL.equals(currentPassword)) {
                            System.out.println("Accesso consentito");
                            access = true;
                            log=i;
                            break;
                        } 
                      
                        if (access == false && i == Utenti.size()) {
                            System.out.println("Accesso non consentito");
                        }
                    }
                    break;

                case 3:

                    // Ordinare

                    int fine;
                    
                    if (access == true) {
                        do {
                            System.out.println("Cosa vuoi ordinare?");
                            menu.stampaMenu();
                            int s = scannerInt.nextInt();

                            if (s == 1) {
                                ordinazione.aggiungiPiatto(piatto1);
                            } else if (s == 2) {
                                ordinazione.aggiungiPiatto(piatto2);
                            } else if (s == 3) {
                                ordinazione.aggiungiPiatto(piatto3);
                            } else {
                                System.out.println("Nessuna piatto selezionata");
                            }
                            System.out.println("Vuoi aggiungere ordini?");
                            System.out.println("1. Si");
                            System.out.println("2. no");
                            fine = scannerInt.nextInt();
                        } while (fine != 2);

                        // Calcola il totale dell'ordinazione
                        System.out.println("Utete: " + Utenti.get(log));
                        ordinazione.stampaOrdinazione();
                        double totale = ordinazione.calcolaTotale();
                        System.out.println("Totale dell'ordinazione: " + totale);

                    } else {
                        System.out.println("Effettua il login");
                    }
                    break;
                case 4:
                    System.out.println("Grazie e arrivederci");
                    return;
                default:
                    System.out.println("Non hai inserito una scelta giusta");
                    break;
            }
        } while (scelta != 4);
    }
}

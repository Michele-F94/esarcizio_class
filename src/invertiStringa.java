
import java.util.Scanner;

public class invertiStringa {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci una stringa da invertire:");

        String parola = scan.nextLine(); // Legge la stringa dallo scanner
        String stringaInvertita = ""; // Inizializza la stringa invertita

        // Ciclo per invertire la stringa
        for (int i = parola.length() - 1; i >= 0; i--) {
            stringaInvertita += parola.charAt(i); // Aggiunge il carattere corrente alla stringa invertita
        }
        // Stampa la stringa invertita
        System.out.println("La stringa invertita è: " + stringaInvertita);
    }

}

public class sommaDegliElementi {

    public static void main(String[] args) {
        
        int[] numeri = {1, 2, 3, 4, 5}; // Array di numeri
        int somma = 0; // Variabile per la somma

        // Ciclo per sommare gli elementi dell'array
        for (int i = 0 ; i < numeri.length; i++) {
            somma += numeri[i]; // Aggiunge il numero corrente alla somma
        }

        // Stampa il risultato
        System.out.println("La somma degli elementi è: " + somma);
    }
}

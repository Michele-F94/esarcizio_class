public class trovaIlMinimo {
    public static void main(String[] args) {
        
        int[] numeri = {1, 2, 3, 4, 5}; // Array di numeri
        int numeroMinimo = numeri[0]; // Inizializza il massimo con il primo elemento

        // Ciclo per trovare il massimo
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] < numeroMinimo) {
                numeroMinimo = numeri[i]; // Aggiorna il massimo se l'elemento corrente è maggiore
            }
        }

        // Stampa il risultato
        System.out.println("Il numero minimo nell'array è: " + numeroMinimo);
    }

}


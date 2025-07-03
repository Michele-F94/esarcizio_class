public class invertiArray {
    public static void main(String[] args) {
        
        int []  numeri = {1, 2, 3, 4, 5}; // Array di numeri
        int []  numeriInvertiti = new int[numeri.length]; // Array per i numeri invertiti
        


        // Ciclo per invertire l'array
       for (int i = 0; i < numeri.length; i++) {
            numeriInvertiti[i] = numeri[numeri.length - 1 - i];
            System.out.print(numeriInvertiti[i] + " "); // Stampa ogni elemento dell'array invertito
        }

    }

}

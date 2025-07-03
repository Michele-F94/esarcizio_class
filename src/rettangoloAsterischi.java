public class rettangoloAsterischi {
    public static void main(String[] args) {
        
        int a = 4; // Numero di righe del rettangolo
        int b = 6; // Numero di colonne del rettangolo

        // Ciclo per ogni riga del rettangolo
        for (int i = 1; i <= a; i++) {

            // Stampa gli asterischi per la riga corrente
            for (int j = 1; j <= b; j++) {
                System.out.print(" * ");
            }
            // Vai a capo dopo aver stampato gli asterischi della riga corrente
            System.out.println();
        }
    }

}

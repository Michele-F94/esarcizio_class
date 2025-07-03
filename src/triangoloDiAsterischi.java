public class triangoloDiAsterischi {
    public static void main(String[] args) {
        
        int a = 5; // Numero di righe del triangolo

        // Ciclo per ogni riga del triangolo
        for (int i = 1; i <= a; i++) {

            // Stampa gli asterischi per la riga corrente

            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // Vai a capo dopo aver stampato gli asterischi della riga corrente
            System.out.println();
        }
    }

}

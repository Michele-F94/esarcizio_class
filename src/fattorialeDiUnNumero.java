
import java.util.Scanner;

public class fattorialeDiUnNumero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero per calcolarne il fattoriale:");
        int numero = scan.nextInt();
        int fattoriale = 1;

        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;
        }
        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
        
        
    }

}

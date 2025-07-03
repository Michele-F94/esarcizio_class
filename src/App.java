
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("quale numero vuoi stampare:");
        int numeroTabellina = scanner.nextInt();

        System.out.println("fino a che numero vuoi arrivare:");
        int numeroFineTabellina = scanner.nextInt();

        for (int i=0 ; i <= numeroFineTabellina; i++) {
           int risultato = numeroTabellina * i;
           System.out.println(numeroTabellina + " * " + i + " = " + risultato);

            
        }




    }
}

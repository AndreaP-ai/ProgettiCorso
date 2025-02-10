import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int sommaTot = somma(sn);
        int sottrazioneTot = sottrazione(sn);
        int divisioneTot = divisione(sn);
        int moltiplicaTot = moltiplica(sn);
        concatena(sommaTot, sottrazioneTot, divisioneTot, moltiplicaTot);

    }

    public static int somma(Scanner sn) {
        System.out.print("Dammi il primo numero: ");
        int val1 = Integer.parseInt(sn.nextLine());
        System.out.print("Dammi il secondo numero: ");
        int val2 = Integer.parseInt(sn.nextLine());
        int risultato1 = val1 + val2;
        return risultato1;
    }

    public static int sottrazione(Scanner sn) {
        System.out.print("Dammi il primo numero: ");
        int val1 = Integer.parseInt(sn.nextLine());
        System.out.print("Dammi il secondo numero: ");
        int val2 = Integer.parseInt(sn.nextLine());
        int risultato2 = val1 - val2;
        return risultato2;
    }

    public static int divisione(Scanner sn) {
        System.out.print("Dammi il primo numero: ");
        int val1 = Integer.parseInt(sn.nextLine());
        System.out.print("Dammi il secondo numero: ");
        int val2 = Integer.parseInt(sn.nextLine());
        int risultato3 = val1 / val2;
        return risultato3;
    }

    public static int moltiplica(Scanner sn) {
        System.out.print("Dammi il primo numero: ");
        int val1 = Integer.parseInt(sn.nextLine());
        System.out.print("Dammi il secondo numero: ");
        int val2 = Integer.parseInt(sn.nextLine());
        int risultato4 = val1 * val2;
        return risultato4;
    }

    public static void concatena(int num1, int num2, int num3, int num4) {
        System.out.println("Somma: " + num1 + " Sottrazione: " + num2
                + " Divisione: " + num3 + " Moltiplicazione: " + num4);
    }

}
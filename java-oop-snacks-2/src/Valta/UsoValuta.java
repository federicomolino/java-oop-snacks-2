package Valta;

import java.util.Scanner;

import static Valta.ConvertitoreValute.converti;

public class UsoValuta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dell'utente
        System.out.println("Inserisci la valuta di partenza (EUR, USD, GBP, JPY):");
        String valutaDa = scanner.nextLine();

        System.out.println("Inserisci la valuta di destinazione (EUR, USD, GBP, JPY):");
        String valutaA = scanner.nextLine();

        System.out.println("Inserisci l'importo da convertire:");
        double importo = scanner.nextDouble();

        // Conversione
        double risultato = converti(valutaDa, valutaA, importo);

        if (risultato != -1) {
            System.out.println("Importo convertito: " + risultato);
        }
    }
}

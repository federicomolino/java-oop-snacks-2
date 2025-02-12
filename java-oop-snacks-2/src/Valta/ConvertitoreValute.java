package Valta;

public class ConvertitoreValute {

    static final double[] valute = {1.00, 1.10, 0.85, 132.50};

    static final String [] inputValute = {"EUR", "USD", "GBP", "JPY"};

    private String daValuta;

    private String aValuta;


    static double converti(String daValuta, String aValuta, double importo) {
        if (!daValuta.equalsIgnoreCase("EUR") && !daValuta.equalsIgnoreCase("USD") && !daValuta.equalsIgnoreCase("GBP") && !daValuta.equalsIgnoreCase("JPY")) {
            System.out.println("Valuta non corretta.");
        }

        if (!aValuta.equalsIgnoreCase("EUR") && !aValuta.equalsIgnoreCase("USD") && !aValuta.equalsIgnoreCase("GBP") && !aValuta.equalsIgnoreCase("JPY")) {
            System.out.println("Valuta non corretta.");
        }

        int da = trovaIndiceValuta(daValuta);
        int a = trovaIndiceValuta(aValuta);

        // Conversione in EUR e poi alla valuta di destinazione
        double inEuro = importo / valute[da];
        return inEuro * valute[a];

    }

    //trovo l'indice della valuta inserita in input
    private static int trovaIndiceValuta(String valuta) {
        for (int i = 0; i < inputValute.length; i++) {
            if (inputValute[i].equalsIgnoreCase(valuta)) {
                return i;
            }
        }
        return -1; // Valuta non trovata
    }
}



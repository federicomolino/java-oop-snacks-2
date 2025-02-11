import Auto.Auto;

public class Main {
    public static void main(String[] args) {

        Auto a1 = new Auto("Mercedes");
        Auto a2 = new Auto("BMW");
        Auto a3 = new Auto("Audi");

        a1.Stampa();
        a2.Stampa();
        a3.Stampa();

        System.out.println("Il numero di auto create sono: " + Auto.getNumeroTotaleAuto());
    }
}
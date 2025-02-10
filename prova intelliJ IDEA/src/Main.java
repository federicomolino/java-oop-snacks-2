import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scuola Scuola1 = new Scuola("Belluzzi");
        Scuola1.setNumeroClassi(30);
        Scuola1.setMaxStudentiInClasse(27);
        Scuola1.Stampa();

        String [] studenti = new String [5];
        int count = 0;

        System.out.println("Quanti studenti vuoi?");
        Scanner scan = new Scanner(System.in);
        int studentiInput = scan.nextInt();

        for (int i = 0; i < studentiInput; i++) {
            System.out.println("Inserisci un studente: ");
            studenti[count] = scan.next();
            count++;
        }

        for (int i = 0; i < count; i++) {
                System.out.println("Studente: " + studenti[i]);
        }
        Studente mario = new Studente(null, "Rossi", 17,4,"Belluzzi");
        mario.Stampa();

    }
}
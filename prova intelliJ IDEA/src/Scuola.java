import java.util.Random;

public class Scuola {

    private int CodiceScuola;

    private String NomeIstituto;

    private int NumeroClassi;

    private int MaxStudentiInClasse;

    public Scuola(String NomeIstituto) {
        setCodiceScuola();
        this.NomeIstituto = NomeIstituto;
    }

    public int getNumeroClassi() {
        return NumeroClassi;
    }

    public int getCodiceScuola() {
        return CodiceScuola;
    }

    public void setNomeIstituto(String nomeIstituto) {
        NomeIstituto = nomeIstituto;
    }

    //Verifico numero classi nella scuola
    public void setNumeroClassi(int NumeroClassi) {
        if (NumeroClassi<= 0){
            System.out.println("All'interno della scuola deve esserci almeno una classe");
        }else {
            this.NumeroClassi = NumeroClassi;
        }
    }

    //verifico gli studenti che possono stare in una classe
    public void setMaxStudentiInClasse(int MaxStudentiInClasse) {
        if (MaxStudentiInClasse <= 0 || MaxStudentiInClasse > 30){
            System.out.println("La classe può essere composta di un minimo di 1 a un massimo di 30");
        }else {
            this.MaxStudentiInClasse = MaxStudentiInClasse;
        }
    }

    //genero codice scuola
    public int setCodiceScuola() {
        Random ran = new Random();
        int max = 10000;
        CodiceScuola = ran.nextInt(max);
        return this.CodiceScuola;
    }

    public String getNomeIstituto() {
        return NomeIstituto;
    }

    public int getMaxStudentiInClasse() {
        return MaxStudentiInClasse;
    }

    public void Stampa(){
        System.out.println("Il codice della scuola è: " + CodiceScuola
        + "\nIl nome: " + NomeIstituto
        + "\nIl numero di classi presenti sono: " + NumeroClassi
        + "\nIl numero massimo di studenti in Classe: " + MaxStudentiInClasse);
    }
}

public class Studente extends Scuola {

    private String NomeStudente;

    private String Cognome;

    private int Eta;

    private String NomeScuola;

    private int Classe;

    public Studente(String NomeStudente, String Cognome, int Eta, int Classe, String NomeIstituto) {
        super(NomeIstituto);
        if (NomeStudente == null){
            System.out.println("Nome Studente non valido");
        }else if (Cognome == null){
            System.out.println("Cognome Studente non valido");
        }else {
            this.NomeStudente = NomeStudente;
            this.Cognome = Cognome;
        }

        if (Eta == 0){
            System.out.println("Eta non valido");
        }else {
            this.Eta = Eta;
        }

        if (Classe <= 0 || Classe >= 6){
            System.out.println("Classe non valido");
        }else {
            this.Classe = Classe;
        }

    }

    public String getNomeStudente() {
        return NomeStudente;
    }


    public String getNomeScuola() {
        return NomeScuola;
    }

    public void setNomeScuola(String nomeScuola) {
        NomeScuola = nomeScuola;
    }

    public int getClasse() {
        return Classe;
    }

    public void setNomeStudente(String nomeStudente) {
        NomeStudente = nomeStudente;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public void setEta(int eta) {
        Eta = eta;
    }

    public void setClasse(int classe) {
        Classe = classe;
    }

    public String getCognome() {
        return Cognome;
    }

    public int getEta() {
        return Eta;
    }

    @Override
    public void Stampa() {
        System.out.println("Nome Studente: " +  NomeStudente
                + "\nCognome Studente: " + Cognome
                + "\nL'età dello studente : " + Eta
                + "\nLa classe frequentata: " + Classe);
    }
}

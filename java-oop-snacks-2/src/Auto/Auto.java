package Auto;

import java.util.Random;

public class Auto {

     private final int numeroTelaio;

     static int contatoreAuto =0;

     private final String modello;

     public Auto(String modello) {
         // incremento il contatore
         contatoreAuto++;
         // assegno il numero del talio
         //this.numeroTelaio = contatoreAuto * 100 / 2;
         Random ran = new Random();
         int max = 5000;
         this.numeroTelaio = ran.nextInt(max);
         this.modello = modello;
     }

     public static int getNumeroTotaleAuto(){
         return contatoreAuto;
     }

    public void Stampa(){
        System.out.println("Numero telaio: " + numeroTelaio + " modello: " + modello);
    }

}

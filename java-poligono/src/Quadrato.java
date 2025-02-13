public class Quadrato implements Poligono{

    private final double lato;

    public Quadrato(double lato) {
        this.lato = lato;
        calcolaArea();
        calcolaPerimetro();
    }

    @Override
    public void calcolaPerimetro() {
        double risultatoPerimetro = lato * 4;
        System.out.println("Perimetro del quadrato: " + risultatoPerimetro);
    }

    @Override
    public void calcolaArea() {
        double risultatoArea = lato * lato;
        System.out.println("Area del quadrato: " + risultatoArea);
    }

    public double getLato() {
        return lato;
    }
}

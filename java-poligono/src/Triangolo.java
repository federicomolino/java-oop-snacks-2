public class Triangolo implements Poligono{

    private double base;

    private double altezza;

    private double lato1;

    private double lato2;

    private double lato3;

    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        calcolaArea();
        calcolaPerimetro();
    }

    @Override
    public void calcolaArea() {
        if (base == 0 || altezza == 0){
            System.out.println("I valori di base e altezza non possono essere 0");
        }
        double risultatoArea = base*altezza / 2;
        System.out.println("Calcola area " + risultatoArea);
    }

    @Override
    public void calcolaPerimetro() {
        if (lato1 == 0 || lato2 == 0 || lato3 == 0) {
            System.out.println("Il valore dei lati non può essere 0");
        }else {
            double risultatoPerimetro = lato1 + lato2 + lato3;
            System.out.println("Calcola perimetro " + risultatoPerimetro);
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }
}

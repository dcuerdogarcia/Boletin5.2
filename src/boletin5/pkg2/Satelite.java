package boletin5.pkg2;

public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite(){
        meridiano = 0;
        paralelo = 0;
        distanciaTerra = 0;
    }

    public Satelite(double m, double p, double d){
        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
    }

    public String verPosicion(){
        return ("O satelite atopase no paralelo " + paralelo + " e no meridiano " + meridiano + " distancia da terra " + distanciaTerra); 
    }
}
package Polimorfismo.Forma;

public class Rectangulo extends Forma{

    private double longitud;
    private double ancho;


    //Constructor
    public Rectangulo (String nombre, double longitud, double ancho){
        super("Rectangulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }


    //Métodos

    @Override
    public double getArea() {
        double area = this.longitud * this.ancho;
        return(area);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "longitud=" + longitud +
                ", ancho=" + ancho +
                '}';
    }

    //Getters and Setters

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}

package Polimorfismo.Forma;

public class Pintura {

    private double cobertura;


    //Constructor

    public Pintura(double cobertura){
        this.cobertura = cobertura;
    }


    //Métodos

    public double cantidadPintura (Forma forma){

        double pintura = forma.getArea() / this.cobertura;

        return(pintura);
    }

    @Override
    public String toString() {
        return "Pintura{" +
                "cobertura=" + cobertura +
                '}';
    }

    //Getters and Setters

    public double getCobertura() {
        return cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }
}

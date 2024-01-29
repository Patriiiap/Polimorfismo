package Polimorfismo.Forma;

public class Esfera extends Forma{

    private double radio;


    //Constructor

    public Esfera(String nombre, double radio){
        super("Esfera");
        this.radio = radio;
    }

    //Métodos

    @Override
    public double getArea() {
        double area = 4 * Math.PI * Math.pow(this.radio, 2);
        return(area);
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }


    //Getters and Setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

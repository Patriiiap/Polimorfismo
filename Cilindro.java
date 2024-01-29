package Polimorfismo.Forma;

public class Cilindro extends Forma{

    private double radio;
    private double altura;


    //Constructor

    public Cilindro (String nombre, double radio, double altura){
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }


    //Métodos

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(this.radio, 2) * this.altura;
        return(area);
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "radio=" + radio +
                ", altura=" + altura +
                '}';
    }

    //Getters and Setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

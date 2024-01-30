package Polimorfismo.Forma;

public class Forma {

    private String nombre;


    //Constructor

    public Forma(){
        this.nombre = nombre;
    }

    public Forma(String nombre){
        this.nombre = nombre;
    }

    //Métodos

    public double getArea(){
        return(0);
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

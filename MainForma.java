package Polimorfismo.Forma;

import java.util.Scanner;

public class MainForma {

    public static void main(String[] args) {

        //El polimorfismo está en que dependiendo del objeto que llame a un mismo método (en este caso area) cada uno nos da un resultado diferente en base a ese objeto

        //Prueba de enunciado

        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo("", 20, 35);
        Esfera esfera = new Esfera("", 15);
        Cilindro cilindro = new Cilindro("", 10, 30);

        System.out.println("Pintura necesaria para rellenar " + rectangulo.getNombre() + ": " + pintura.cantidadPintura(rectangulo));
        System.out.println("Pintura necesaria para rellenar " + esfera.getNombre() + ": " + pintura.cantidadPintura(esfera));
        System.out.println("Pintura necesaria para rellenar " + cilindro.getNombre() + ": " + pintura.cantidadPintura(cilindro));

        System.out.println("-----------------------------------------------------------------------------");


        //Otras pruebas

        boolean salirBol = true;

        do {

            System.out.println("¿De que forma quieres saber la cantidad de pintura necesaria para cubrir su superficie?");
            System.out.println("Selecciona: 1 - Rectángulo      2 - Esfera     3 - Cilindro");

            int seleccion = 0;

            do {
                seleccion = CapturaExcepcionesInts();
                if(seleccion < 1 || seleccion > 3){
                    System.out.println("Sólo se puede introducir 1(Rectángulo), 2(Esfera), 3(Cilindro)");
                }
            } while (seleccion < 1 || seleccion > 3);

            switch (seleccion){
                case 1:
                    System.out.println("Has seleccionado Rectángulo");
                    System.out.println("Inserta la lóngitud de tu Rectángulo: ");
                    double longitud = CapturaExcepcionesDouble();
                    System.out.println("Inserta el ancho de tu Rectángulo: ");
                    double ancho = CapturaExcepcionesDouble();

                    Rectangulo rectangulo1 = new Rectangulo("", longitud, ancho);

                    System.out.println("Inserta la cobertura que necesitas cubrir para saber la cantidad de pintura necesaria: ");
                    double cobertura = CapturaExcepcionesDouble();

                    Pintura pintura1 = new Pintura(cobertura);

                    System.out.println("Pintura necesaria para rellenar tu " + rectangulo1.getNombre() + ": " + pintura1.cantidadPintura(rectangulo1));

                    break;

                case 2:
                    System.out.println("Has seleccionado Esfera");
                    System.out.println("Inserta el radio de tu Esfera: ");
                    double radio = CapturaExcepcionesDouble();

                    Esfera esfera1 = new Esfera("", radio);

                    System.out.println("Inserta la cobertura que necesitas cubrir para saber la cantidad de pintura necesaria: ");
                    double cobertura1 = CapturaExcepcionesDouble();

                    Pintura pintura2 = new Pintura(cobertura1);

                    System.out.println("Pintura necesaria para rellenar tu " + esfera1.getNombre() + ": " + pintura2.cantidadPintura(esfera1));
                    break;

                case 3:
                    System.out.println("Has seleccionado Cilindro");
                    System.out.println("Inserta el radio de tu Cilindro: ");
                    double radioCil = CapturaExcepcionesDouble();
                    System.out.println("Inserta la altura de tu Cilindro: ");
                    double altura = CapturaExcepcionesDouble();

                    Cilindro cilindro1 = new Cilindro("", radioCil, altura);

                    System.out.println("Inserta la cobertura que necesitas cubrir para saber la cantidad de pintura necesaria: ");
                    double cobertura2 = CapturaExcepcionesDouble();

                    Pintura pintura3 = new Pintura(cobertura2);

                    System.out.println("Pintura necesaria para rellenar tu " + cilindro1.getNombre() + ": " + pintura3.cantidadPintura(cilindro1));
                    break;
            }

            System.out.println("-----------------------------------------------------------------------------");

            System.out.println("Pulsa 1 si quieres Calcular otra forma, pulsa 2 si quieres salir");

            int salir = 0;

            do {
                salir = CapturaExcepcionesInts();

                if(salir < 1 || salir > 2){
                    System.out.println("Solo puedes insertar 1(seguir calculando) o 2(salir)");
                }
                if(salir == 1){
                    salirBol = false;
                }
                else {
                    salirBol = true;
                }
            }
            while (salir < 1 || salir > 2);

        }
        while(salirBol == false);



    }

    //Función para insertar solo doubles

    public static double CapturaExcepcionesDouble(){

        Scanner sc = new Scanner(System.in);
        double numeroAComprobar = 0;
        boolean salir = true;

        do {
            try{
                numeroAComprobar = sc.nextDouble();
                salir = true;
            }
            catch(Exception e){
                System.out.println("Sólo se pueden introducir carácteres numéricos");
                salir = false;
                sc.next();
            }
        } while (salir == false);

        return(numeroAComprobar);
    }


    //Función para insertar solo ints

    public static int CapturaExcepcionesInts(){

        Scanner sc = new Scanner(System.in);
        int numeroAComprobar = 0;
        boolean salir = true;

        do {
            try{
                numeroAComprobar = sc.nextInt();
                salir = true;
            }
            catch(Exception e){
                System.out.println("Sólo se pueden introducir carácteres numéricos");
                salir = false;
                sc.next();
            }
        } while (salir == false);

        return(numeroAComprobar);
    }
}

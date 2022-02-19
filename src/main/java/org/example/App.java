package org.example;

import org.example.objetos.Calculo;
import org.example.objetos.Validador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class App 
{
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main( String[] args ) throws IOException, InterruptedException
    {
        int opc;
        boolean noSalir = true;

        do {
            mostrarMenu();
            opc = leerOpcion();
            noSalir = ejecutarAccion(opc);
        } while (noSalir);
        imprimirIntegrantes();
    }

    static void imprimirIntegrantes(){
        out.println("Desarrollado por:");
        out.println("Gabriel Calvo Vargas");
        out.println("Manuel Alvarado Solis");
        out.println("");
        out.println("Curso BISOFT-32 Calidad, Verificación y Validación de Software ST04");
        out.println("**********************************");

    }

    static int leerOpcion() throws java.io.IOException {

        int opcion;

        out.print("Seleccione su opción: ");
        String lectura = in.readLine();

        if (Validador.validarEsNumeroEntero(lectura)) {
            opcion = Integer.parseInt(lectura);
        } else{
            opcion = -1;
        }

        out.println();
        return opcion;
    }

    static void mostrarMenu() {

        out.println();
        out.println("Oprima la opción que desee:");
        out.println("********************************");
        out.println("1.  Averiguar si es año es bisiesto");
        out.println("0.  Salir");
        out.println("********************************");
        out.println();
    }

    static boolean ejecutarAccion(int popcion) {

        boolean noSalir = true;

        switch (popcion) {

            case 1:
                procesarAnho();
                break;

            case 0:
                noSalir = false;
                out.println("********************************");
                out.println("Gracias por usar el sistema");
                out.println("********************************");
                out.println();
                break;

            default:
                out.println("************************");
                out.println("Opción invalida");
                out.println();
                break;
        }
        return noSalir;
    }

    public static void procesarAnho(){

        try {
            Calculo help = new Calculo();
            out.println("Ingrese el año:");
            String lectura = in.readLine();

            if (Validador.validarEsNumeroEntero(lectura)){
                boolean esBisiesto = help.esBisiesto(Integer.parseInt(lectura));
                out.printf("El dato ingresado fue: %s. ", lectura);
                if(esBisiesto){
                    out.println("El año es bisiesto!");
                } else {
                    out.println("El año no es bisiesto!");
                }
            } else{
                out.println("El dato ingresado no es un número. Corrija y vuelva a intentar");
            }
        } catch (IOException e) {
            out.println("Hubo un error procesando su solicitud.");
        }
    }
}

package org.example.objetos;

public class Validador {

    public static boolean validarEsNumeroEntero(String input){
        return input.matches("^-?[0-9]+");
    }
}

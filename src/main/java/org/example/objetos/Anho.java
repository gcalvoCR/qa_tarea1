package org.example.objetos;

public class Anho {

    public Anho() {}

    public String esBisiesto(int anio) {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            return "El año es bisiesto!";
        } else {
            return "El año NO es bisiesto!";
        }
    }
}

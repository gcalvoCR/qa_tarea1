package org.example.objetos;

public class Calculo {

    public Calculo() {}

    public boolean esBisiesto(int anio) {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            return true;
        } else {
            return false;
        }
    }
}

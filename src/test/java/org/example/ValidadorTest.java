package org.example;


import org.example.objetos.Validador;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;


/**
 * Unit test Anho.
 */
public class ValidadorTest {

    String texto;
    String numero;

    @BeforeTest
    public void setearCaracteres() {
        Random r = new Random();

        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        String numeros = "0123456789";
        texto = Character.toString(alfabeto.charAt(r.nextInt(alfabeto.length())));
        numero = Character.toString(numeros.charAt(r.nextInt(numeros.length())));
    }

    @Test
    public void validarEntradaNoNumerica() {
        Assert.assertFalse(Validador.validarEsNumeroEntero(texto), "Este método debió de devolver 'false' para la letra " + texto);
    }

    @Test
    public void validarEntradaDecimales() {
        Assert.assertFalse(Validador.validarEsNumeroEntero(texto + ".2"), "Este método debió de devolver 'false' para la el numero decimal " + texto + ".2");
    }

    @Test
    public void validarEntradaNumerosNegativo() {
        Assert.assertFalse(Validador.validarEsNumeroEntero("-" + numero), "Este método debió de devolver 'true' para la el número negativo -" + numero);
    }

    @Test
    public void validarEntradaNumerica() {
        Assert.assertTrue(Validador.validarEsNumeroEntero(numero), "Este metodo debió de devolver 'false' para la letra " + numero);
    }

}

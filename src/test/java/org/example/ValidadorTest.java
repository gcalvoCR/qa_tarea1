package org.example;




import org.example.objetos.Anho;
import org.example.objetos.Validador;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;


/**
 * Unit test Anho.
 */
public class ValidadorTest
{

    String texto;
    String numero;

    @BeforeTest
    public void setearCaracteres(){
        Random r = new Random();

        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        String numeros = "0123456789";
        for (int i = 0; i < 50; i++) {
            texto = Character.toString(alfabeto.charAt(r.nextInt(alfabeto.length())));
            numero = Character.toString(numeros.charAt(r.nextInt(numeros.length())));
        }
    }

    @Test
    public void validarEntradaNoNumerica()
    {
        Assert.assertFalse(Validador.validarEsNumero(texto), "Este metodo debió de devolver 'false' para la letra "+texto);
    }

    @Test
    public void validarEntradaNumerica()
    {
        Assert.assertTrue(Validador.validarEsNumero(numero), "Este metodo debió de devolver 'false' para la letra "+numero);
    }

}

package org.example;

import org.example.objetos.Anho;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Unit test para Anho.
 */
public class AnhoTest
{

    @DataProvider(name="anhosBisiestos")
    public Object[][] getAnhosBisiestos(){
        return new Object[][]
                {
                        { 2020 },
                        { 2024 },
                        { 2028 }
                };
    }

    @DataProvider(name="anhosNoBisiestos")
    public Object[][] getAnhosNoBisiestos(){
        return new Object[][]
                {
                        { 2021 },
                        { 2022 },
                        { 2023 }
                };
    }

    @Test(dataProvider="anhosBisiestos")
    public void validarEsBisiesto(int numero)
    {
        Anho anho = new Anho();
        Assert.assertTrue(anho.esBisiesto(numero), "Este metodo debió de devolver 'true' para el año "+numero);
    }

    @Test(dataProvider="anhosNoBisiestos")
    public void validarNoEsBisiesto(int numero)
    {
        Anho anho = new Anho();
        Assert.assertFalse(anho.esBisiesto(numero), "Este metodo debió de devolver 'false' para el año "+numero);
    }

}

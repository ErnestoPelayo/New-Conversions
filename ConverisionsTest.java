package packageConversions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConverisionsTest {

    double resul, esperado;

    Fahrenheit obj1 = new Fahrenheit();
    Celsius obj2 = new Celsius();
    Kelvin obj3 = new Kelvin();


    @Test
    public void testFahrenheitToCelsius() {
        esperado = 0;
        resul = obj1.FahrenheitToCelsius(32);
        assertEquals(esperado, resul, 0);
    }

    @Test
    public void testFahrenheitToKelvin() {
        esperado = 273.15;
        resul = obj1.FahrenheitToKelvin(32);
        assertEquals(esperado, resul, 0);
    }

    @Test
    public void testCelsiusToKelvin() {
        esperado = 0;
        resul = obj2.CelsiusToKelvin(-273.15);
        assertEquals(esperado, resul, 0);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        esperado = 32;
        resul = obj2.CelsiusToFahrenheit(0);
        assertEquals(esperado, resul, 0);
    }

    @Test
    public void testKelvinToCelsius() {
        esperado = -273.15;
        resul = obj3.KelvinToCelsius(0);
        assertEquals(esperado, resul, 0);
    }

    @Test
    public void testKelvinToFahrenheit() {
        esperado = 32;
        resul = obj3.KelvinToFahrenheit(273.15);
        assertEquals(esperado, resul, .01);// tolerance is added by desimals
    }


}

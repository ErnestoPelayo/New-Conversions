package packageConversions;

public class Kelvin implements MethodsKelvin {

    double resultado;
    Fahrenheit o = new Fahrenheit();

    @Override
    public double KelvinToCelsius(double e) {
        double aux;
        resultado = KelvinToFahrenheit(e);
        return aux = o.FahrenheitToCelsius(resultado);
    }

    @Override
    public double KelvinToFahrenheit(double f) {
        resultado = (9 * (f - 273.15) / 5) + 32;
        return resultado;
    }
}

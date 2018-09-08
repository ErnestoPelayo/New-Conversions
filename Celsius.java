package packageConversions;

public class Celsius implements MethodsCelsius {


    double resultado;

    @Override
    public double CelsiusToFahrenheit(double c) {
        resultado = (c * 1.8) + 32;
        return resultado;
    }

    @Override
    public double CelsiusToKelvin(double d) {
        resultado = d + 273.15;
        return resultado;
    }

}

package packageConversions;

public class Fahrenheit implements MethodsFahrenheit{
    double resultado;

    @Override
    public double FahrenheitToCelsius(double a) {
        resultado=((a-32)/1.8);
        return resultado;
    }

    @Override
    public double FahrenheitToKelvin(double b) {
        resultado=((b+459.67)/1.8);
        return resultado;
    }

}

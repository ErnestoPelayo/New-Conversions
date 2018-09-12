package packageConversions;

public class Kelvin implements MethodsKelvin {

    double resultado;


    @Override
    public double KelvinToCelsius(double e) {
        double aux;
        resultado =(9 * (e - 273.15) / 5) + 32;;
        return aux = ((resultado-32)/1.8);
    }

    @Override
    public double KelvinToFahrenheit(double f) {
        resultado = (9 * (f - 273.15) / 5) + 32;
        return resultado;
    }
}

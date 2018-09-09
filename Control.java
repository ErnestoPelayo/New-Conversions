package packageConversions;

import java.util.Scanner;

public class Control {


    View vw=new View();
    Celsius obj1=new Celsius();
    Fahrenheit obj2=new Fahrenheit();
    Kelvin obj3=new Kelvin();

    public Control() {
        int opc;
        double res;
        Scanner s = new Scanner(System.in);

        do {
            vw.Menu();
            opc = s.nextInt();
            if (opc == 1) {
                vw.CtoF();
                res = s.nextDouble();
                System.out.println("Fahrenheit: " + obj1.CelsiusToFahrenheit(res) + "°");
            }
            if (opc == 2) {
                vw.CtoK();
                res = s.nextDouble();
                System.out.println("Kelvin: " + obj1.CelsiusToKelvin(res));
            }
            if (opc == 3) {
                vw.FtoC();
                res = s.nextDouble();
                System.out.println("Celsius: " + obj2.FahrenheitToCelsius(res) + "°");
            }
            if (opc == 4) {
                vw.FtoK();
                res = s.nextDouble();
                System.out.println("Kelvin: " + obj2.FahrenheitToKelvin(res));
            }
            if (opc == 5) {
                vw.KtoC();
                res = s.nextDouble();
                System.out.println("Celsius: " + obj3.KelvinToCelsius(res) + "°");
            }
            if (opc == 6) {
                vw.KtoF();
                res = s.nextDouble();
                System.out.println("Fahrenheit: " + obj3.KelvinToFahrenheit(res) + "°");
            }

            if (opc > 7 || opc < 1) {
                System.out.println("your option is wrong!, try again ");
            }

        } while (opc != 7);


    }




}

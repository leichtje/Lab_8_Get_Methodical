import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        double degreesCelsius = -100;
        double degreesFahrenheit = 0;


        System.out.printf("%5s %25s%n", "Degrees Celsius", "Degrees Fahrenheit");
        for (degreesCelsius = -100; degreesCelsius <= 100; degreesCelsius++) {
            degreesFahrenheit = CtoF(degreesCelsius);
            System.out.printf("%5.2f %25.2f%n", degreesCelsius, degreesFahrenheit);


        }
    }
    public static double CtoF(double degreesCelsius) {
        double degreesFahrenheit = 0;
        degreesFahrenheit = degreesCelsius * 1.8 + 32;

    return degreesFahrenheit;
    }
}


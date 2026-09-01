package org.example;

public class Uppg11 {
    static void main() {

        int inputFahrenheit = Integer.parseInt(IO.readln("Fahrenheit to Celsius converter: "));
        System.out.println(temperatureConverter(inputFahrenheit));
    }

    static double temperatureConverter(int fahrenheit) {
        return (1.0*(fahrenheit - 32) * 5 / 9);
    }

}

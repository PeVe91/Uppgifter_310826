package org.example;

public class Uppg10 {
    static void main() {

        int inputCelsius = Integer.parseInt(IO.readln("Celsius to Fahrenheit converter: "));

        System.out.println(temperatureConverter(inputCelsius));
    }
    static double temperatureConverter (int celsius) {
        return celsius * 1.8 + 32;
    }
}

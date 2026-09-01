package org.example;

public class Uppg10 {
    static void main() {

        int inputCelcius = Integer.parseInt(IO.readln("Celcius to Farenheit converter: "));

        System.out.println(temperatureConverter(inputCelcius));
    }
    static double temperatureConverter (int celcius) {
        double farenheit = celcius * 1.8 + 32;
        return farenheit;
    }
}

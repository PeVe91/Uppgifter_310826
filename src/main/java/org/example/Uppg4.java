package org.example;

public class Uppg4 {
    static void main() {
        System.out.println("Enter two numbers.");

        int number1 = Integer.parseInt(IO.readln());
        int number2 = Integer.parseInt(IO.readln());

        double mean = 1.0*(number1 + number2) / 2;
        int largestNumber = 0;

        if (number1 >= number2) {
            largestNumber = number1;
        } else {
            largestNumber = number2;
        }
        /*
        Alt: ((tal1 >= tal2) ? tal 1 : tal2));
         */

        System.out.println("Largest number: " + largestNumber);
        System.out.println("Mean: " + mean);
    }
}

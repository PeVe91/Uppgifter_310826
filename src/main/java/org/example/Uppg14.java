package org.example;

public class Uppg14 {
    static void main() {

        int inputNumber = Integer.parseInt(IO.readln("Enter a number: "));

        System.out.println(fizzBuzz(inputNumber));

    }

    static String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return "FizzBuzz";
        }  else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "";
            //Alt. return null;
        }
    }
}

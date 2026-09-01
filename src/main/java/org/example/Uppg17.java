package org.example;

public class Uppg17 {
    static void main() {

        int inputNumber1 = Integer.parseInt(IO.readln("Enter a number: "));
        int inputNumber2 = Integer.parseInt(IO.readln("Enter a number: "));
        System.out.println(addSubMultiDiv(inputNumber1, inputNumber2));
    }
    static String addSubMultiDiv (int number1, int number2) {
        int sumAdd = number1 + number2;
        int sumSub = number1 - number2;
        int sumMulti = number1 * number2;
        int sumDiv = number1 / number2;

        if (sumAdd == 24) {
            return "added";
        } else if (sumSub == 24) {
            return "subtracted";
        } else if (sumMulti == 24) {
            return "multiplied";
        } else if (sumDiv == 24) {
            return "divided";
        } else  {
            return "none";
        }
    }
}

package org.example;

public class Uppg15 {
    static void main() {

        int number1 = Integer.parseInt(IO.readln("Enter a number: "));
        int number2 = Integer.parseInt(IO.readln("Enter a number: "));

        System.out.println(makesTen(number1, number2));

    }
    static boolean makesTen (int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }
}

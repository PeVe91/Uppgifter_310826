package org.example;

public class Uppg13 {
    static void main() {
        int inputNumber = Integer.parseInt(IO.readln("Enter a number: "));
        System.out.println(divisibleByFive(inputNumber));
    }
    static boolean divisibleByFive(int numerator) {
        //Alternativ för mindre kod: return numerator % 5 == 0;
        if (numerator % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

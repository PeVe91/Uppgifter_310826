package org.example;

public class Uppg7 {
    public static void main(String[] args) {

        int number;

        while (true) {
            number = Integer.parseInt(IO.readln("Enter a number: "));

            if (number == 0) {
                System.out.println("Input number must not be zero. Try again.");
            } else {
                break;
            }
        }

        if (number % 2 == 0) {
            System.out.println("Input number is even.");
        } else {
            System.out.println("Input number is odd.");
        }
    }
}

package org.example;

public class Uppg6 {
    static void main() {

        int number = Integer.parseInt(IO.readln("Enter a number: "));

        if (number == 0){
            System.out.println("Input number is zero.");
        } else if (number < 0) {
            System.out.println("Input number is negative.");
        } else {
            System.out.println("Input number is positive.");
        }
    }
}

package org.example;

public class Uppg12 {
    static void main() {

        String string1 = IO.readln("Enter a string or an integer: ");
        String string2 = IO.readln("Enter a string or an integer: ");

        System.out.println(ifTrue(string1, string2));

    }
    static boolean ifTrue (String a, String b) {
        return a.equals(b);
    }
}

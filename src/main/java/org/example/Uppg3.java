package org.example;

public class Uppg3 {
    static void main() {
        int age = 12;

        if (age >= 18) {
            System.out.println("Du är gammal nog att ta körkort");
        } else {
            System.out.println("Du behöver vänta i " + (18 - age) + " år till.");
        }
    }
}

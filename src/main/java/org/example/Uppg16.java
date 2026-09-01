package org.example;

public class Uppg16 {
    static void main() {

        int totalSlices = 800;
        int noRecipients = 4;
        int slicesEach = 2;

        if (equalSlices(totalSlices, noRecipients, slicesEach)) {
            System.out.println("Divisible!");
        } else {
            System.out.println("Not divisible!");
        }

    }
    static boolean equalSlices (int totalSlices, int noRecipients, int slicesEach) {
        if (totalSlices % noRecipients == 0) {
            return true;
        } else {
            return false;
        }
    }
}

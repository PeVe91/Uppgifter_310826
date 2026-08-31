package org.example;

import java.util.ArrayList;

public class Uppg5 {
    static void main() {
        System.out.println("Enter three numbers.");

        ArrayList<Integer> inputs = new ArrayList<>();
        int index = 0;

        while(index < 3){
            inputs.add(Integer.parseInt(IO.readln("Enter number " + (index +1) + ": ")));
            index++;
        }

        double mean = 1.0* (inputs.get(0) + inputs.get(1) + inputs.get(2)) / inputs.size();

        int greatestNumber = inputs.get(0);

        for (int i = 0; i < inputs.size(); i++){
            if (inputs.get(i) > greatestNumber){
                greatestNumber = inputs.get(i);
            }
        }
        System.out.println("Mean: " + mean);
        System.out.println("Greatest Number: " + greatestNumber);
    }
}

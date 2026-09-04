package org.example;

/*
Två spelare kastar varsin tärning (värden mellan 1–6).
För slumpmässiga värden använd Math.random().

Programmet ska avgöra vem som vinner — men med en twist:

Om spelare 1 har högre värde → spelare 1 vinner.
Om spelare 2 har högre värde → spelare 2 vinner.

Om lika:
Om talet är udda → spelare 1 vinner (turbonus).
Om talet är jämnt → spelare 2 vinner (stabilitetsbonus).
*/

public class Uppg18 {
    static void main() {

        int diePlayer1 = (int)(Math.random() * 6) + 1;
        int diePlayer2 = (int)(Math.random() * 6) + 1;

        IO.println("Spelare 1 kastar: " + diePlayer1 +
                "\nSpelare 2 kastar: " + diePlayer2);

        IO.println(result(diePlayer1, diePlayer2));

    }

    static String result (int die1, int die2) {
        if (die1 > die2)
            return "Spelare 1 vinner";
        if (die2 > die1)
            return "Spelare 2 vinner";
        if (die1 % 2 != 0)
            return "Spelare 1 vinner";

        return "Spelare 2 vinner";
    }

}

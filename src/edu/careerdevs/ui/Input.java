package edu.careerdevs.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    private static final Scanner input = new Scanner(System.in);
    private static final List<Integer> rerollDice = new ArrayList<>();

    public static List<Integer> DiceInput(int amount) {

        String userInput = input.nextLine();

        // If the user inputs more than 5 numbers, take the first 5 numbers from string.
        if (userInput.length() > 5)
            userInput.substring(0, 5);

        String[] arrayOutput = userInput.split("");

        reroll(amount, arrayOutput);
        return rerollDice;
    }

    private static void reroll(int amount, String[] arrayOutput) {
        for (String strNumber : arrayOutput) {
            int intNumber = Integer.parseInt(strNumber);
            if (intNumber >= amount + 1 || intNumber < 0) {
                System.out.println("Error - keeping roll");
            } else {
                rerollDice.add(intNumber - 1);
            }
        }
    }
}

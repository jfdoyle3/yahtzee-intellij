package edu.careerdevs.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Console {

    private static final Scanner input = new Scanner(System.in);

    public static List<Integer> DiceInput(int amount) {

        String userInput = input.nextLine();

        // If the user inputs more than 5 numbers, take the first 5 numbers from string.
        if (userInput.length() > 5)
            userInput.substring(0, 5);

        String[] arrayOutput = userInput.split("");
        List<Integer> intList = new ArrayList<>();

        if (userInput.length() == 1 && userInput.equals("0")) {
            System.out.println("tally score");
            return null;
        } else {
            for (String strNumber : arrayOutput) {
                int intNumber = Integer.parseInt(strNumber);
                if (intNumber >= amount + 1 || intNumber < 0) {
                    System.out.println("Error - keep roll");
                } else {
                    intList.add(intNumber - 1);

                }
            }
            return intList;
        }

    }

    public static void DisplayDice(List<Die> dice) {
        System.out.print("Roll: ");
        for (Die cube : dice) {
            System.out.printf("%d ", cube.getFaceUp());
        }
        System.out.println();
    }

    public static void displayScoreSheet(ScoreSheet scoreSheet) {
        System.out.println(scoreSheet.getClass());
    }

    public static void inputDirections(List<Die> dice){
        System.out.printf("Enter a die number(s) between 1 - %d.\nex. 134 will roll die 1,3,4\n0 to end turn. : ", (dice.size()) - 1);
    }

}

package edu.careerdevs.objects;

import java.util.List;

public class Game {

    public static void playGame() {
        System.out.println("Playing Game");
        ScoreSheet scoreSheet=new ScoreSheet();
        System.out.println(scoreSheet.toString());
        List<Die> dice = Dice.set(5, 6);
        int rounds = 3;
        Dice.rollDice(dice);
        Console.DisplayDice(dice);
        for (int turn = 0; turn < rounds; turn++) {
            turn(dice);
            Console.DisplayDice(dice);
            boolean endGame = win(dice);
            if (endGame) {
                System.out.println("Yahtzee!!  :)");
                break;
            }
        }
    }

    public static void turn(List<Die> dice) {
        System.out.printf("Enter a number(s) between 1 - %d. ex. 0123  ", (dice.size()) - 1);
        List<Integer> userDieChoice = Console.DiceInput(dice.size());
        for (int die : userDieChoice) {
            Dice.roll(die);
        }
    }

    public static boolean win(List<Die> dice) {
        boolean isWon = false;
        int firstDie = dice.get(0).getFaceUp();
        int matching = 0;
        for (int idx = 1; idx < dice.size(); idx++) {
            if (firstDie == dice.get(idx).getFaceUp()) {
                matching++;
            }
        }
        if (matching == dice.size() - 1) {
            isWon = true;
        }
        return isWon;
    }
}

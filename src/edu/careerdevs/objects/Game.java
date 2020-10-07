package edu.careerdevs.objects;

import java.util.List;

public class Game {

    public static void playGame() {
        System.out.println("Playing Game");
        List<Die> dice = Dice.Set(5, 6);
        int rounds = 3;
        Dice.RollDice(dice);
        Console.DisplayDice(dice);
        for (int turn = 0; turn < rounds; turn++) {
            Turn(dice);
            Console.DisplayDice(dice);
            boolean endGame = Win(dice);
            if (endGame) {
                System.out.println("Yahtzee!!  :)");
                break;
            }
        }
    }

    public static void Turn(List<Die> dice) {
        System.out.printf("Enter a number(s) between 1 - %d. ex. 0123  ", (dice.size()) - 1);
        List<Integer> userDieChoice = Console.DiceInput(dice.size());
        for (int die : userDieChoice) {
            Dice.Roll(die);
        }
    }

    public static boolean Win(List<Die> dice) {
        boolean win = false;
        int firstDie = dice.get(0).getFaceUp();
        int matching = 0;
        for (int idx = 1; idx < dice.size(); idx++) {
            if (firstDie == dice.get(idx).getFaceUp()) {
                matching++;
            }
        }
        if (matching == dice.size() - 1) {
            win = true;
        }
        return win;
    }
}

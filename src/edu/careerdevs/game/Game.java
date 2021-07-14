package edu.careerdevs.game;

import edu.careerdevs.objects.Dice;
import edu.careerdevs.objects.Die;
import edu.careerdevs.objects.Player;
import edu.careerdevs.ui.Console;
import edu.careerdevs.ui.Input;

import java.util.List;

public class Game {

    public static void playGame() {
        Player player=new Player("Jim");
        System.out.println("Playing Game");

        createScoreCard(player);

        List<Die> dice = Dice.set(5, 6);
        int rounds = 3;
        Dice.rollDice(dice);
        Console.dicePic(dice);
        for (int turn = 0; turn < rounds; turn++) {
            turn(dice);
            Console.altDicePic(dice);
        }
        tallyScore(dice);
    }
    // TODO: Fix how to exit turn and tally score
    public static void turn(List<Die> dice) {
        Console.inputDirections(dice);
        List<Integer> userDieChoice = Input.DiceInput(dice.size());
        if(userDieChoice==null)
            System.out.println("null- tally me score up!!");
        else {
            for (int die : userDieChoice) {
                Dice.roll(die);
            }
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

    public static void createScoreCard(Player player){
        ScoreSheet scoreSheet=new YathzeeeScoreCard("Yahtzeee",player.getName(),1);
        scoreSheet.addItem("Ones", 0);
        Console.displayScoreSheet(scoreSheet);
    }

    public static void tallyScore(List<Die> Dice){



    }
}

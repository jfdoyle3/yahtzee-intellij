package edu.careerdevs.game;

import edu.careerdevs.MapDice;
import edu.careerdevs.scoresheet.HashCard;
import edu.careerdevs.scoresheet.ScoreSheet;
import edu.careerdevs.objects.Dice;
import edu.careerdevs.objects.Die;
import edu.careerdevs.objects.Player;
import edu.careerdevs.scoresheet.TallyScore;
import edu.careerdevs.scoresheet.yatzhee.YathzeeeScoreCard;
import edu.careerdevs.ui.Console;
import edu.careerdevs.ui.Input;

import java.util.LinkedHashMap;
import java.util.List;

public class Game {

    public static void playGame() {

        // Setup Player and card
        Player player = new Player("Jim");
        System.out.println("Playing Game");
        LinkedHashMap<String, Integer> card=HashCard.cardTop();

        System.out.println("score card:");
        Console.simpleDisplayCard(card);
//        ScoreSheet scoreSheet = createScoreCard(player);
//        ScoreSheet scoreSheet = new YathzeeeScoreCard("Yahtzeee", player.getName(), 1);
        //       scoreSheet.addItem("Ones", 0);

        // System.out.println(scoreSheet);
        //       ScoreSheet.displayCard();
        List<Die> dice = Dice.set(5, 6);
        int rounds = 3;

        // start of turn
        // roll
        Dice.rollDice(dice);

        // display dice
        Console.dicePic(dice);
        // get input
        Console.turnDirections(dice);

       List<Integer> userDieChoice = Input.DiceInput(dice.size());
       for(int choice : userDieChoice)
           System.out.println(choice);
        if(userDieChoice.get(0)==0){
            System.out.println("Which die to score");


        }



//        if (userDieChoice == null) {
//            System.out.println("null- tally me score up!!");
//            TallyScore.scoreDice(dice);
//
//        } else {
//            for (int die : userDieChoice)
//                Dice.roll(die);
       //}
       //     Console.dicePic(dice);
        //    rounds++;
//        }
//        while (rounds<3);
 //       tallyScore(dice);
    }

    // TODO: Rewrite turn method - write out long way, then turn back into a method
    public static void turn(List<Die> dice) {

        Console.turnDirections(dice);
        List<Integer> userDieChoice = Input.DiceInput(dice.size());

        if (userDieChoice == null) {
            System.out.println("null- tally me score up!!");
            TallyScore.scoreDice(dice);

        } else {
            for (int die : userDieChoice) {
                Dice.roll(die);
            }
        }
    }


    //   public static ScoreSheet createScoreCard(Player player) {
//   //     ScoreSheet scoreSheet = new YathzeeeScoreCard("Yahtzeee", player.getName(), player.getPlayerNumber());
//   //     scoreSheet.addItem("Ones", 0);
//
//        return scoreSheet;
//    }

    public static void tallyScore(List<Die> Dice) {


    }
}

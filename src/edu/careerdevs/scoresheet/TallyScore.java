package edu.careerdevs.scoresheet;

import edu.careerdevs.objects.Dice;
import edu.careerdevs.objects.Die;
import edu.careerdevs.scoresheet.ScoreSheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TallyScore extends ScoreSheet {

    private int points;
    private int totalScore;

    public TallyScore(String gameName, String name, int playerNumber, int points, int totalScore) {
        super(gameName, name, playerNumber);
        this.points = points;
        this.totalScore = totalScore;
    }



    public static void fullHouse(List<Die> dice){
        // Think maybe have: boolean hasFullHouse
        // Map size must be the size of 2 and have values of 3 & 2
        List<Integer> diceSet= Dice.scoreDice(dice);
        Dice.groupDice(diceSet);




    }
    
}
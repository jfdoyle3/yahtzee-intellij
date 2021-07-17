package edu.careerdevs.scoresheet;

import edu.careerdevs.objects.Player;
import edu.careerdevs.scoresheet.yatzhee.YathzeeeScoreCard;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class BasicHashCard {

    public HashMap<String, Integer> scoreSheet = new HashMap<>();

    public static LinkedHashMap <String, Integer> cardTop() {
        LinkedHashMap<String, Integer> topOfCard = new LinkedHashMap<>();

        topOfCard.put("Ones       ", 0);
        topOfCard.put("Twos       ", 0);
        topOfCard.put("Threes     ", 0);
        topOfCard.put("Fours      ", 0);
        topOfCard.put("Fives      ", 0);
        topOfCard.put("Sixes      ", 0);
        topOfCard.put("Total Score",0);
        topOfCard.put("Bonus      ",0);
        topOfCard.put("Total      ",0);

        System.out.println(topOfCard);
        return topOfCard;
    }

    public static LinkedHashMap <String, Integer> cardBottom() {
        LinkedHashMap<String, Integer> bottomOfCard = new LinkedHashMap<>();

        bottomOfCard.put("3 of a kind", 0);
        bottomOfCard.put("4 of a kind", 0);
        bottomOfCard.put("Sm. Straight", 0);
        bottomOfCard.put("Lg. Straight", 0);
        bottomOfCard.put("Yahtzee", 0);
        bottomOfCard.put("Chance", 0);
        bottomOfCard.put("Yahtzee Bonus", 0);
        bottomOfCard.put("Yahtzee Bonus2", 0);
        bottomOfCard.put("Total lower",0);
        bottomOfCard.put("Total upper",0);
        bottomOfCard.put("Grand Total",0);

        System.out.println(bottomOfCard);

        return bottomOfCard;

    }
}

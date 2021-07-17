package edu.careerdevs.scoresheet.yatzhee;

import edu.careerdevs.scoresheet.ScoreSheet;

import java.util.LinkedHashMap;

public class YathzeeeScoreCard extends ScoreSheet {

    private LinkedHashMap<String, Integer> topCard=new LinkedHashMap<>();
    private LinkedHashMap<String, Integer> bottomCard=new LinkedHashMap<>();


    public YathzeeeScoreCard(String gameName, String name, int playerNumber, LinkedHashMap<String, Integer> topCard, LinkedHashMap<String, Integer> bottomCard) {
        super(gameName, name, playerNumber);
        this.topCard = topCard;
        this.bottomCard = bottomCard;
    }
}

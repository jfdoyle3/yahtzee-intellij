package edu.careerdevs.objects;

import java.util.HashMap;

public class ScoreSheet {

    private HashMap<String, Integer> scoreSheet;

    public ScoreSheet() {
        scoreSheet=new HashMap<>();
        scoreSheet.put("Ones",0);
        scoreSheet.put("Twos",0);
        scoreSheet.put("Threes",0);
        scoreSheet.put("Fours",0);
        scoreSheet.put("Fives",0);
        scoreSheet.put("Sixes",0);
    }

    @Override
    public String toString() {
        return "ScoreSheet{" +
                "scoreSheet=" + scoreSheet +
                '}';
    }
}

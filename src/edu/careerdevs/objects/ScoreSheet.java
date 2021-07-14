package edu.careerdevs.objects;

import java.util.HashMap;

public class ScoreSheet {

    private HashMap<String, Integer> scoreSheet;

    public ScoreSheet() {
        scoreSheet=new HashMap<>();

    }

    public void addItem(String item, int score){
        scoreSheet.put(item,score);
    }

    @Override
    public String toString() {
        return "ScoreSheet{" +
                "scoreSheet=" + scoreSheet +
                '}';
    }

}

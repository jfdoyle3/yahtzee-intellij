package edu.careerdevs.objects;

import java.util.HashMap;

public class ScoreSheet extends Player {

    private String gameName;
    private HashMap<String, Integer> scoreSheet;

    public ScoreSheet(String gameName, String name, int playerNumber) {
        super(name, playerNumber);
        this.gameName=gameName;
        scoreSheet=new HashMap<>();
    }



    public void addItem(String item, int score){
        scoreSheet.put(item,score);
    }



    public String toString() {
        return "ScoreSheet{" +
                "gameName='" + gameName + '\'' +
                ", scoreSheet=" + scoreSheet +
                '}';
    }
}

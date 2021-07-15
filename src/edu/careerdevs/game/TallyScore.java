package edu.careerdevs.game;

import edu.careerdevs.base_classes.ScoreSheet;

public class TallyScore extends ScoreSheet {

    private int points;
    private int totalScore;

    public TallyScore(String gameName, String name, int playerNumber, int points, int totalScore) {
        super(gameName, name, playerNumber);
        this.points = points;
        this.totalScore = totalScore;
    }
    
}

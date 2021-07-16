package edu.careerdevs.scoresheet;

import edu.careerdevs.objects.Player;

import java.util.HashMap;
import java.util.Map;

public abstract class ScoreSheet extends Player {

    private String gameName;
    private Map<String, Long> scoreSheet;

    public ScoreSheet(String gameName, String name, int playerNumber) {
        super(name, playerNumber);
        this.gameName = gameName;
        scoreSheet = new HashMap<>();
    }


    public void addItem(String item, long score) {
        scoreSheet.put(item, score);
    }

  //  public static void displayItem(String item){
//        System.out.println(scoreSheet.get(item));
//    }

//    public static void displayCard(ScoreSheet scoreCard.){
//        for (Map.Entry<String,Long> entry : scoreCard.entrySet())
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
//    }

    public String toString() {
        return "ScoreSheet{" +
                "gameName='" + gameName + '\'' +
                ", scoreSheet=" + scoreSheet +
                '}';
    }
}

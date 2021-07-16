package edu.careerdevs.scoresheet;

import edu.careerdevs.objects.Player;
import edu.careerdevs.scoresheet.yatzhee.YathzeeeScoreCard;

public class BuildScoreCard {


    public static void buildCard(){

        Player player = new Player("Jim");
        System.out.println("Playing Game");

//        ScoreSheet scoreSheet = createScoreCard(player);
        ScoreSheet scoreSheet = new YathzeeeScoreCard("Yahtzeee", player.getName(), 1);
        scoreSheet.addItem("Ones", 0);
        scoreSheet.addItem("Twos", 0);
        scoreSheet.addItem("Threes", 0);
        scoreSheet.addItem("Fours", 0);
        scoreSheet.addItem("Fives", 0);
        scoreSheet.addItem("Sixes", 0);


        System.out.println(scoreSheet);


    }
}

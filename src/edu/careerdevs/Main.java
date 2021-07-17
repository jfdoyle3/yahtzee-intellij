package edu.careerdevs;

import edu.careerdevs.scoresheet.HashCard;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

       // Game.playGame();
        LinkedHashMap<String, Integer> topCard= HashCard.cardTop();
        LinkedHashMap<String, Integer> bottomCard= HashCard.cardBottom();

        String key = "Ones       ";
        int value = 5;

        // update score on card/ update Linked Hashmap value
        topCard.replace(key,topCard.get(key),value);


   //     altViewTopCard(topCard);

        viewTopCard(topCard);
        //  System.out.printf("└─────────────┴───┘");
        topCard.replace(key,topCard.get(key),10);
        viewTopCard(topCard);
   //     altViewBottomCard(bottomCard);
        //  viewBottomCard(bottomCard);

    }


    private static void altViewTopCard(LinkedHashMap<String, Integer> topCard) {
        System.out.println("-----------------------");
        for (Map.Entry<String,Integer> entry : topCard.entrySet()) {
            System.out.printf("| %s     | %d |\n", entry.getKey(), entry.getValue());
            System.out.println("-----------------------");
        }
    }

    private static void altViewBottomCard(LinkedHashMap<String, Integer> bottomCard) {
        System.out.println("--------------------");
        for (Map.Entry<String,Integer> entry : bottomCard.entrySet())
            System.out.printf("| %s     | %d |\n",entry.getKey(), entry.getValue());

        System.out.println("--------------------");
    }

    private static void viewBottomCard(LinkedHashMap<String, Integer> bottomCard) {
        System.out.printf("┌────────────────┬───┐\n");
        for (Map.Entry<String,Integer> entry : bottomCard.entrySet()) {
            System.out.printf("│ %s│ %d │\n", entry.getKey(), entry.getValue());
            System.out.printf("├────────────────┼───┤\n");
        }
    }



    private static void viewTopCard(LinkedHashMap<String, Integer> topCard) {
        System.out.printf("┌─────────────┬───┐\n");
        for (Map.Entry<String,Integer> entry : topCard.entrySet()) {
            System.out.printf("│ %s │ %d │\n", entry.getKey(), entry.getValue());
            System.out.printf("├─────────────┼───┤\n");
        }
    }


}
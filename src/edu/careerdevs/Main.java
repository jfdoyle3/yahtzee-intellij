package edu.careerdevs;

import edu.careerdevs.scoresheet.BasicHashCard;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

       // Game.playGame();
        LinkedHashMap<String, Integer> topCard=BasicHashCard.cardTop();
        LinkedHashMap<String, Integer> bottomCard=BasicHashCard.cardBottom();

        String key="Ones";
        int value=5;

        topCard.put(key,value);


        System.out.println("--------------------");
        for (Map.Entry<String,Integer> entry : topCard.entrySet())
            System.out.printf("| %s     |%d|\n",entry.getKey(), entry.getValue());

        System.out.println("--------------------");

        System.out.println("--------------------");
        for (Map.Entry<String,Integer> entry : bottomCard.entrySet())
            System.out.printf("| %s     |%d|\n",entry.getKey(), entry.getValue());

        System.out.println("--------------------");


    }

}
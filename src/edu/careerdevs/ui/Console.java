package edu.careerdevs.ui;

import edu.careerdevs.objects.Die;
import edu.careerdevs.game.ScoreSheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {



    public static void DisplayDice(List<Die> dice) {
        System.out.print("Roll: ");
        for (Die cube : dice) {
            System.out.printf("%d ", cube.getFaceUp());
        }
        System.out.println();
    }

    public static void displayScoreSheet(ScoreSheet scoreSheet) {
        System.out.println(scoreSheet.getClass());
    }

    public static void inputDirections(List<Die> dice){
        System.out.println("_______________________________________________________________");
        System.out.printf("Enter a die number(s) between 1 - %d no spaces between numbers.\n0 to end turn. : ", (dice.size()));
       // System.out.println("\nex. 134 will roll die 1,3,4");
    }


    public static void dicePic(List<Die> dice){
        System.out.println("\t┌───┐  ┌───┐  ┌───┐  ┌───┐  ┌───┐");
        System.out.printf("\t│ %d │  │ %d │  │ %d │  │ %d │  │ %d │\n",dice.get(0).getFaceUp(),dice.get(1).getFaceUp(),dice.get(2).getFaceUp(),dice.get(3).getFaceUp(),dice.get(4).getFaceUp());
        System.out.println("\t└───┘  └───┘  └───┘  └───┘  └───┘");
        System.out.println("Die:  1      2      3      4      5");
    }

    public static void altDicePic(List<Die> dice){
        System.out.println("\t-----  -----  -----  -----  -----");
        System.out.printf("\t| %d |  | %d |  | %d |  | %d |  | %d |\n",dice.get(0).getFaceUp(),dice.get(1).getFaceUp(),dice.get(2).getFaceUp(),dice.get(3).getFaceUp(),dice.get(4).getFaceUp());
        System.out.println("\t-----  -----  -----  -----  -----");
        System.out.println("Die:  1      2      3      4      5");
    }

}

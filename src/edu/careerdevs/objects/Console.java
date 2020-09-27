package edu.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {

    private static Scanner input=new Scanner(System.in);

    public static List<Integer> DiceInput() {
        String userInput=input.nextLine();
        String[] arrayOutput=userInput.split("");
        List<Integer> intList=new ArrayList<>();
        for (String strNumber : arrayOutput) {
            int intNumber = Integer.parseInt(strNumber);
            if (intNumber > arrayOutput.length) {
                System.out.println("Keep roll - no change");
            } else {
                intList.add(intNumber);
            }
        }
        return intList;
    }

    public static void DisplayDice(List<Die> dice){
        System.out.print("Roll: ");
        for (Die cube : dice) {
            System.out.printf("%d ",cube.getFaceUp());
        }
        System.out.println();
    }

}

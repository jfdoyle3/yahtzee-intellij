package edu.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    private static Scanner input=new Scanner(System.in);

    public static List<Integer> UserInput(String inputText) {

        System.out.printf("%s\n",inputText);
        String userInput=input.nextLine();
        String[] arrayOutput=userInput.split("");
        List<Integer> intList=new ArrayList<>();
        for (String strNumber : arrayOutput) {
            int intNumber = Integer.parseInt(strNumber);
            intList.add(intNumber);
        }
        return intList;
    }


}

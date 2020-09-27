package edu.careerdevs.objects;

import java.util.List;

public class Game {

    public static void playGame() {
        System.out.println("Playing Game");
        List<Die> dice2 = Dice.Set(5, 6);
        List<Integer> userNumber=Input.UserInput("Enter number(s) from 1 to 5 dice number to reroll");
        for (int die=0; die<userNumber.size(); die++) {
            Dice.Roll(userNumber.get(die));
        }

        for (Die cube : dice2) {
            System.out.print(cube.getFaceUp() + " ");
        }


    }
}

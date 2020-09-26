package edu.careerdevs.objects;

import java.util.List;

public class Game {

    public static void playGame() {
        System.out.println("Playing Game");

        System.out.println("Die - works");
        Die die = new Die(6);
        System.out.println(die.getFaceUp());

        System.out.println("Die 2 - rolled - works");
//        Die die2 = new Die(6);
//        die2.Roll();
//        System.out.println(die2.getFaceUp())
 //      int user= Input.UserInput();
   //    System.out.println("user typed --------------> "+user);

//       System.out.println("Set");
//        List<Die> dice = Dice.Set(5, 6);
//        for (Die cube : dice) {
//            System.out.print(cube.getFaceUp() + " ");
//        }

//        System.out.println("\nRolled 1 pos:0");
//        List<Die> dice2 = Dice.Set(5, 6);
//        Dice.Roll(0);
//        for (Die cube : dice2) {
//            System.out.print(cube.getFaceUp() + " ");
//        }


    }
}


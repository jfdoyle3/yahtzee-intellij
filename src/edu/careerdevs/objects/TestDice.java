package edu.careerdevs.objects;

import java.util.List;

public class TestDice {


    public static void TestingDice() {
        System.out.println("Playing Game");

        System.out.println("Die - works");
        Die die = new Die(6);
        System.out.println(die.getFaceUp());

        System.out.println("Die 2 - rolled - works");
        Die die2 = new Die(6);
        die2.Roll();
        System.out.println(die2.getFaceUp());


        System.out.println("Set");
        List<Die> dice = Dice.Set(5, 6);
        for (Die cube : dice) {
            System.out.print(cube.getFaceUp() + " ");
        }

        int pos = 3;
        int[] intArray = new int[]{4, 0, 2};
        System.out.println("\nRolled 1 pos: " + pos);
        List<Die> dice2 = Dice.Set(5, 6);
        for(int idx=0; idx<3; idx++) {
            for (int i : intArray) {
                Dice.Roll(i);
            }
            }
        for (Die cube : dice2) {
                System.out.print(cube.getFaceUp() + " ");

        }
    }
}

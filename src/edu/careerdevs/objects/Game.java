package edu.careerdevs.objects;

import java.util.List;

public class Game {

    public static void playGame() {
        System.out.println("Playing Game");

        Die die=new Die(6);
        die.Roll();
        System.out.println(die.getFaceUp());

        List<Die> dice=Dice.Set(6,5);
        for(Die cube : dice){
            System.out.print(die.getFaceUp()+",");
        }





}


}

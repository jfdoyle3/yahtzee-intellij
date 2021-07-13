package edu.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

public class Dice {
   private static List<Die> diceSet;

    public static List<Die> set(int quantity, int faces) {
     diceSet = new ArrayList<>();
        for (int idx = 0; idx < quantity; idx++)
            diceSet.add(new Die(faces));
      return diceSet;
    }
    public static void roll(int dieNumber){
       Die rollDie=diceSet.get(dieNumber);
       rollDie.roll();
    }
    public static void rollDice(List<Die> dice){
        for (int idx=0; idx<dice.size(); idx++){
           roll(idx);
        }

    }

}

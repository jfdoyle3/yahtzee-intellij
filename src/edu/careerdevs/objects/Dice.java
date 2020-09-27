package edu.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

public class Dice {
   private static List<Die> set;

    public static List<Die> Set(int quantity, int faces) {
     set = new ArrayList<>();
        for (int idx = 0; idx < quantity; idx++)
            set.add(new Die(faces));
      return set;
    }
    public static int Roll(int dieNumber){
       Die rollDie=set.get(dieNumber);
       rollDie.Roll();
       return rollDie.getFaceUp();
    }

}

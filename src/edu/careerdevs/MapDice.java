package edu.careerdevs;

import edu.careerdevs.objects.Dice;
import edu.careerdevs.objects.Die;

import java.util.List;
import java.util.Map;

public class MapDice {

    public static void mapDice(List<Die> dice) {
        // Think maybe have: boolean hasFullHouse
        // Map size must be the size of 2 and have values of 3 & 2
        List<Integer> diceSet = Dice.scoreDice(dice);
        Map<Integer, Long> diceMap=Dice.groupDice(diceSet);

        int[] fullHouse={2,3,2};

        // don't need array for one - sixes

        int diceMapSize=diceMap.size();
        System.out.println(diceMapSize);
    }
}

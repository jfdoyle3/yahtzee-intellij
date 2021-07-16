package edu.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dice {
    private static List<Die> diceSet;

    public static List<Die> set(int quantity, int faces) {
        diceSet = new ArrayList<>();
        for (int idx = 0; idx < quantity; idx++)
            diceSet.add(new Die(faces));
        return diceSet;
    }

    public static void roll(int dieNumber) {
        Die rollDie = diceSet.get(dieNumber);
        rollDie.roll();
    }

    public static void rollDice(List<Die> dice) {
        for (int idx = 0; idx < dice.size(); idx++) {
            roll(idx);
        }
    }

    public static List<Integer> scoreDice(List<Die> dice) {
        List<Integer> diceList = new ArrayList<>();
        for (Die die : dice) {
            diceList.add(die.getFaceUp());
        }
        return diceList;
    }

    public static Map<Integer,Long> groupDice(List<Integer> dice) {
        Map<Integer, Long> occurrenceMap = dice.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("occurrenceMap:: " + occurrenceMap);

        return occurrenceMap;
    }

}

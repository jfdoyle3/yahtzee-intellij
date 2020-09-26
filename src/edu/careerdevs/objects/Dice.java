package edu.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

public class Dice {



    public static List<Die> Set(int quantity, int faces) {
        List<Die> set = new ArrayList<Die>();
        for (int idx = 0; idx < quantity; idx++) {
            Die die = new Die(faces);
            set.add(die);
        }
        return set;
    }
}

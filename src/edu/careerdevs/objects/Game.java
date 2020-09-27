package edu.careerdevs.objects;

import java.util.List;

public class Game {



    public static void playGame() {
        System.out.println("Playing Game");
        List<Die> dice = Dice.Set(5, 6);
        int rounds=3;
        Console.DisplayDice(dice);
        for (int turn=0; turn<rounds; turn++) {
            Turn(dice);
            Console.DisplayDice(dice);
            boolean endGame = Win(dice);
            System.out.println(endGame);
            if (endGame) {
                System.out.println("Yahtzee!!  :)");
                break;
            } else {
                System.out.println("No Yahtzee.. :(");
            }
        }

    }

    public static void Turn(List<Die> dice) {
        System.out.printf("Enter a number(s) between 0 - %d. Greater than %d to keep roll.  ",(dice.size()-1),(dice.size()-1));
        List<Integer> userChoice=Console.DiceInput();
        for (int die=0; die<userChoice.size(); die++) {
            Dice.Roll(userChoice.get(die));
        }
    }

    public static boolean Win(List<Die> dice){
        boolean win = false;
        int firstDie=dice.get(0).getFaceUp();
        int matching=0;
        for (int idx=1; idx<dice.size(); idx++){
            if (firstDie==dice.get(idx).getFaceUp()){
                matching++;
            }
        }
        if (matching==dice.size()-1){
            win=true;
        } 
        return win;
    }

}

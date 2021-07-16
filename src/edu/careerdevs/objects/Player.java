package edu.careerdevs.objects;

public class Player {

    private String name;
    private int playerNumber;


    public Player(String name, int playerNumber) {
        this.name = name;
        this.playerNumber=playerNumber;
    }

    public Player(String name){
        this.name=name;
        playerNumber=1;
    }

    public String getName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }



    public String toString() {
        return "Player:" +
                "\nname:'" + name + '\'' +
                "\nplayerNumber: " + playerNumber;
    }
}

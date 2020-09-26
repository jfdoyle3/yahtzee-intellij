package edu.careerdevs.objects;

import java.util.Random;

public class Die {

    private int faces;
    private int faceUp;

    public Die(int faces){
        Random rand=new Random();
        this.faces=faces;
        this.faceUp= rand.nextInt(faces)+1;
    }

}

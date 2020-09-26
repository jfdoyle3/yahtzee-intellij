package edu.careerdevs.objects;


import java.util.Random;

public class Die {

    private int faces;
    private int faceUp;
    private Random random=new Random();


    public Die (int faces){
        this.faces=faces;
        this.faceUp=random.nextInt(faces)+1;
    }
//    public Die (int faces, int faceUp){
//        this.faces=faces;
//        this.faceUp=faceUp;
//    }
    public void Roll(){
        this.faceUp =random.nextInt(faces)+1;
    }

    public int getFaceUp(){
        return faceUp;
    }


}
package edu.careerdevs.objects;


import java.util.Random;

public class Die {

    private int faces;
    private int faceUp;
    private Random random=new Random();


    public Die (){
        faceUp=1;
    }
    public Die (int faces){
        this.faces=faces;
    }
    public void Roll(){
       this.faceUp= random.nextInt(faces)+1;

    }

    public int getFaceUp(){
        return faceUp;
    }

    public int getFaces(){return faces;}


}
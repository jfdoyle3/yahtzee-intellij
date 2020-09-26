package edu.careerdevs.objects;

import java.util.Scanner;

public class Input {

    public static int UserInput() {
        Scanner input=new Scanner(System.in);
        System.out.println("Input something");

        return input.nextInt();

    }
}

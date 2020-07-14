package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int randomNumber=(int)(Math.random()*100) + 1;
        boolean hasWon=false;
        System.out.println("I have selected a number between 1-100");
        System.out.println("try to guess it?");
        Scanner scanner=new Scanner(System.in);
        for (int i=10;i>0;i--){
            System.out.println("number of guesses left"+i+".Choose again");
            int guess=scanner.nextInt();

            if (randomNumber > guess){
                System.out.println("randomNUmber is greater than"+guess);
            }
            if (randomNumber < guess){
                System.out.println("randomNUmber is less than"+guess);
            }
            if (randomNumber == guess){
                hasWon=true;
                break;
                //System.out.println("You win the Game!!! the random number is"+randomNumber+"Your guees is"+guess);
            }
        }
        if (hasWon==true){
            System.out.println("CORRECT YOU WON THE GAME!!!");
        }
            else {
                System.out.println("GAME OVER ....YOU LOST THE GAME");
                System.out.println("The number was"+randomNumber);
        }

    }
}

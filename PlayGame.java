package com.company;
import java.util.Scanner;

class Game {
    private boolean gameOver ;
    final int secretNumber;
    private int numberOfGuesses ;
    public Game(){
        gameOver = false ;
        secretNumber = (int) (Math.random()*100 + 1);
        numberOfGuesses = 0 ;
    }
    public Game(int range){
        gameOver = false ;
        secretNumber = (int)(Math.random() * range + 1);
        numberOfGuesses = 0 ;
    }
    public boolean isGameOver(){
        return gameOver;
    }
    public void guess (int n){
        if (gameOver){
            System.out.println("The game is over ." + "You cannot guess again");
        }
        else if (n == secretNumber){
            System.out.println("You guessed right number");
            gameOver = true ;
        }
        else{
            if (n < secretNumber){
                System.out.println("Your guess is too low");
            }
            else{
                System.out.println("Your guess is too high..");
            }
            numberOfGuesses++;
            if (numberOfGuesses == 10){
                System.out.println("You have used up all of your chances");
                gameOver = true ;
            }
        }

    }
}
public class PlayGame{

    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game theGame = new Game();
        while(!theGame.isGameOver()){
            System.out.println("Guess a number between 1 to 100:");
            int n = input.nextInt();
            theGame.guess(n);
        }
    }
}


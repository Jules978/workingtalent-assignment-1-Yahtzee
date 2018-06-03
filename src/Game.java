/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdrunen
 */
import java.util.Arrays;
import java.util.Scanner;

public class Game {

    Player player;
    Dice dice;
    ScoreCalculator scoreCalculator;
    int[] diceArray = new int[5];

    Game() {
        
        this.player = new Player();
        this.dice = new Dice();
        this.scoreCalculator = new ScoreCalculator();
        this.player = new Player();
    }

    public void newTurn() {
        
        Scanner reader = new Scanner(System.in);
        this.diceArray = dice.roll5();
        int rerollsLeft = 3;
        
        
        for (int i = 0; i < this.diceArray.length; i++) {
            System.out.println("D1 =" + diceArray[i]);
        }

        while (rerollsLeft > 0) {
            
            System.out.println("You have " + rerollsLeft + " rerolls left");
            System.out.println("Do you want to reroll? yes/no");
            String answer = reader.nextLine();
           
            if (answer.equals("yes")) {
                this.reroll();
                System.out.println("Your dice:");
                dice.printDice();
                rerollsLeft--;
            } else {
                break;
            }

        }

        int score = scoreCalculator.addition(this.diceArray);
        player.setScore(score);
        System.out.println("you now have " + score + " points!");
    }

    public void reroll() {
        
        Scanner reader = new Scanner(System.in);
        int[] rerolledDice = new int[5];
        
        for (int i = 0; i < rerolledDice.length; i++) {

            System.out.print("Which die do you want to reroll? 1-5 to choose a die, enter 6 or higher to continue ");
            int number = Integer.parseInt(reader.nextLine());
            
            if (number > 0 && number < 6) {
                number--;
                rerolledDice[i] = number;
                
                for (int counter = 0; counter < rerolledDice.length; counter++){
                    
                    int rerolledDiceVar = rerolledDice[counter];
                    
                    if(rerolledDice[counter] != 0) {
                        rerolledDiceVar = rerolledDice[counter]+1;
                    }
                    
                    System.out.println("D: " + rerolledDiceVar );
                }
                
                
            } else {
                break; //probably not needed, but whatever
            }

        }
         this.diceArray = dice.reroll(rerolledDice);
         dice.printDice();

    }

}

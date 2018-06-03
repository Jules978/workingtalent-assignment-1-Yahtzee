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

public class Game {

    Player player;
    Dice dice;
    ScoreCalculator scoreCalculator;
    int[] diceArray = new int[5];

    Game() {
        this.player = player;
        this.dice = new Dice();
        this.scoreCalculator = new ScoreCalculator();
        this.player = new Player();

    }

    public void newTurn() {

        this.diceArray = dice.roll5();
        int rerollsLeft = 3;
        boolean wantsToReroll = true;
        for (int i = 0; i < this.diceArray.length; i++) {
            System.out.println("D1 =" + diceArray[i]);
        }

        while (rerollsLeft > 0) {
            System.out.println("Do you want to reroll?");
            
            if (wantsToReroll) {
                this.reroll();
                System.out.println("Your dice:");
                dice.printDice();
                rerollsLeft --;
            } else {break;}
            

        }

        int score = scoreCalculator.addition(this.diceArray);
        player.setScore(score);
        System.out.println("you now have " + score + " points!" );
    }

    public void reroll() {

        int[] rerolledDice = new int[5];
        // array or array list with 5 dice rolls;

        System.out.println("Which dice do you want to reroll?");
      

        for (int i = 0; i < rerolledDice.length; i++) {
            //which number? 1-6
            //if number > 0 && <7
            // number -1 
            //add number to rerolledDice[i];

            //if number = 0, continue (?)
        }

        //   this.diceArray = dice.reroll(rolled dice, diceToBeRerolled )   
    }

}

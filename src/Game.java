/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdrunen
 */
public class Game {

    Player player;
    Dice dice;
    ScoreCalculator scoreCalculator;
    int turnsLeft;

    Game(Player player) {
        this.player = player;
        this.dice = new Dice();
        this.scoreCalculator = new ScoreCalculator();
        this.turnsLeft = 10; //or how many turns there are in a yahtzee game;

    }

    public void newTurn() {

        this.turnsLeft--;
        dice.roll5(); //dice array = this return value;
        //print dice
        System.out.println("Do you want to reroll? Y/N");
        //if(reroll equals("Y"){
        //this.reroll(dice array);
        //}
        // dice array = this return value (of the rerolled dice)

    }

    public void reroll() {
        int rerollsLeft = 3;
        // array or array list with 5 dice rolls;

        while (rerollsLeft > 0) {
            System.out.println("Which dice do you want to reroll?");
            //   while reroll is true (break on 0, 6, 7, 8, 9) add numbers to array or arraylist
            //   dice.reroll(rolled dice, diceToBeRerolled )   
            //  
        }
        //int points = scoreCalculator.addition(dice array);
        //player.addToScore(points);
    }

}

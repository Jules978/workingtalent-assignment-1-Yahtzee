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
    int[] diceArray = new int[5];
    

    Game() {
        this.player = player;
        this.dice = new Dice();
        this.scoreCalculator = new ScoreCalculator();
        this.player = new Player();
       

    }

    public void newTurn() {

       
        this.diceArray = dice.roll5(); 
        for (int i = 0; i< this.diceArray.length; i++) {
            System.out.println("D1 =" +diceArray[i]);
        }
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

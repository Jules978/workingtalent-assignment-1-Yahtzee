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
    int turnsLeft;
    int rerollsLeft;
    
    Game(Player player) {
        this.player = player;
        this.dice = new Dice();
        this.turnsLeft = 10; //or how many turns there are in a yahtzee game;
        this.rerollsLeft = 3; //decreases after a reroll, resets during a new turn
        
        }
    
    public void newTurn(){
    this.rerollsLeft = 3;
    this.turnsLeft --;
    dice.roll5(); //dice array = this return value;
    //print dice
        System.out.println("Do you want to reroll? Y/N");
        //if(reroll equals("Y"){
        //  System.out.println("Which dice do you want to reroll?");
        //  while reroll is true (break on 0, 6, 7, 8, 9) add numbers to array or arraylist
       //}
    
    }
    
}

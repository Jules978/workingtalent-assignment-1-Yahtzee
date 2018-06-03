/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdrunen
 */
import java.util.Random;

public class Dice {

    int[] diceArray = new int[5];
    private Random random;

    public Dice() {
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(6) + 1;
    }

    //method to generate first array or arraylist of 5 integers
    public int[] roll5() {
        int[] dice = {this.roll(), this.roll(), this.roll(), this.roll(), this.roll()};
        this.diceArray = dice;
        return dice;
    }

    public int[] reroll(int[] rerolledDice) {
        
        for (int i = 0; i < this.diceArray.length; i++) {
            
            if (this.rerollCheck(rerolledDice, i)) {
                this.diceArray[i] = this.roll();
            } 
        }
        
        return this.diceArray;
    }
    
    public void printDice(){
        
        for(int i=0; i<this.diceArray.length;i++) {
            int diceNumber = i+1;
            System.out.println("D"+ diceNumber +": " + this.diceArray[i]);
        }
    
    }
    
    public boolean rerollCheck(int[] arr, int number) {
      for (int n : arr) {
         if (number == n) {
            return true;
         }
      }
      return false;
   }
}

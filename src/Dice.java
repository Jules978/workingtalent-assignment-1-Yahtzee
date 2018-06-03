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
        int[] reroll = rerolledDice;
        boolean rerollCheck = true;
        for (int i = 0; i < this.diceArray.length; i++) {
            //first check whether dice has to be rerolled
            for (int x = 0; x < reroll.length; x++) {
                if (reroll[x] == i) {
                    rerollCheck = true;
                } else {
                    rerollCheck = false;
                }
            }

            // if the rerollCheck is true; reroll the dice;
            if (rerollCheck) {
                this.diceArray[i] = this.roll();
            }
        }

        return this.diceArray;
    }
}

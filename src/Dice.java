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
        return dice;
    }

    //method to reroll dice
    //public void reroll(array or arraylist) {
    //}
}

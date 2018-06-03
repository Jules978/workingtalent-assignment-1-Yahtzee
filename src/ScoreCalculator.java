/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdrunen
 */
public class ScoreCalculator {

    int totalScore;

    public int addition(int[] diceArray) {
        int score = 0;
        for (int i = 0; i < diceArray.length; i++) {
            score += diceArray[i];
        }
        this.totalScore += score;
        
        return totalScore;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdrunen
 * 
 * 
 */
public class Player {
    
    private int score;
    private String name;
    
    Player (String newName) {
        this.score = 0;
        this.name = newName;
    }
    
    public int score() {
    return this.score;
    }
    
    public void addToScore(int points) {
        this.score += points;
    }
        
}

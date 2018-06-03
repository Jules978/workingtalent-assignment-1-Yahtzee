/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdrunen
 * 
 * this class is currently a bit unnecessary, but may become useful when multiple players can play against each other.
 * 
 */
public class Player {
    
    public int score;
    //private String name;
    
    Player() {
        this.score = 0;
        //this.name = newName;
    }
    
    public int score() {
    return this.score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jdrunen
 */
public class Yahtzee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Game game = new Game();
      int turnsLeft = 10;
      
      for (int i=0; i<turnsLeft; i++){
          game.newTurn();
      }
    }
    
}

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
      
        System.out.println("hello, let's roll some dice!");
        System.out.println("You have 10 rounds to get as many points as possible,");
        System.out.println("only the value on the dice is counted, so no bonus points for fullhouse etc.");
        System.out.println("Let's go!");
      
      for (int i=0; i<turnsLeft; i++){
          int round = i+1;
          System.out.println("Round " + round );
          game.newTurn();
      }
    }
    
}

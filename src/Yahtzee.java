/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdrunen
 */
import java.util.Scanner;

public class Yahtzee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Game game = new Game();
        int turnsLeft = 10;
        Scanner reader = new Scanner(System.in);

        System.out.println("hello, let's roll some dice!");
        System.out.println("You have 10 rounds to get as many points as possible,");
        System.out.println("only the value on the dice is counted, so no bonus points for fullhouse etc.");

        System.out.println("Start? yes/no");
        String text = reader.nextLine();

        if (text.equals("yes")) {

            for (int i = 0; i < turnsLeft; i++) {

                int round = i + 1;
                System.out.println("Round " + round);
                game.newTurn();
            }

            System.out.println("YOUR FINAL SCORE IS: " + game.player.score());
            System.out.println("THANK YOU FOR PLAYING!");

        } else {
            System.out.println("ok, bye!");
        }
    }

}

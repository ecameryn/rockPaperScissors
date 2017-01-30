/*
 * This program implements the game of rock, paper, scissors. 
 */
package rockpaperscissors;

/**
 *
 * @author Cameryn
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player usrHand  ;
        Player compHand ;
        
        System.out.println("Welcome to a classic game of Rock/ Paper/ Scissors!\n"
                           + "Please enter your choice of rock, paper, or scissors..");
        
        String input = (new Scanner(System.in)).next();
        
        if (input.equalsIgnoreCase("rock")) 
        {
            usrHand = new Player(1);
        } else if (input.equalsIgnoreCase("paper")) 
        {
            usrHand = new Player(2);
        } else if (input.equalsIgnoreCase("scissors")) 
        {
            usrHand = new Player(3);
        }
        else usrHand = new Player(); 

        compHand = new Player(ThreadLocalRandom.current().nextInt(1, 3 + 1));
        
        
        //compHand = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        
        System.out.println("User: " + usrHand.getHand() + " Vs. Computer: " + compHand.getHand());
        
        /*1>3; 1<2; 2<3
          1=rock; 2=paper; 3=scissors*/
        switch(usrHand.getNumValue())
        {
            case 1:
                if(compHand.getNumValue() == 1) System.out.println("Tie");
                else if(compHand.getNumValue() == 2) System.out.println("Computer Won");
                else if(compHand.getNumValue() == 3) System.out.println("You Win!");
                break;
            case 2:
                if(compHand.getNumValue() == 1) System.out.println("You Win!");
                else if(compHand.getNumValue() == 2) System.out.println("Tie");
                else if(compHand.getNumValue() == 3) System.out.println("Computer Won");
                break;
            case 3:
                if(compHand.getNumValue() == 1) System.out.println("Computer Won");
                else if(compHand.getNumValue() == 2) System.out.println("You Win!");
                else if(compHand.getNumValue() == 3) System.out.println("Tie");
                break;
        }
        
    }
    
}

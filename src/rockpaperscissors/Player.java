/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author Cameryn
 */
public class Player {
    
    String hand;
    int numValOfHand;
    
    public Player()
    {
        setHand("Busy hands");
    }
    
    public Player (int hand)
    {
        if(hand == 1) {setHand("rock"); setNumValue(1);}
        if(hand == 2) {setHand("paper"); setNumValue(2);}
        if(hand == 3) {setHand("scissors"); setNumValue(3);}
    }
    
    public Player (String hand)
    {
        if(hand.equalsIgnoreCase("rock")) {setHand("rock"); setNumValue(1);}
        if(hand.equalsIgnoreCase("paper")) {setHand("paper"); setNumValue(2);}
        if(hand.equalsIgnoreCase("scissors")) {setHand("scissors"); setNumValue(3);}
    }
    
    public void setHand(String hand)
    {
        this.hand = hand;
    } 
    
    public void setNumValue(int value)
    {
        this.numValOfHand = value;
    }
    
    public String getHand()
    {
        return hand;
    }
    
    public int getNumValue()
    {
        return numValOfHand;
    }
}

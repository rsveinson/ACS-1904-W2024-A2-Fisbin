
import java.util.ArrayList;
/** 
 * ACS-1904 Assignment 2
 * @Sveinson 
 * 
 * play one hand of the made-up card game Fisbin
*/

public class Fisbin{
    public static void main(String[] args){
        
        // create the deck of cards
        Deck deck = new Deck();
        
        // shuffle the deck
        deck.shuffle();
        //System.out.println(deck);
        
        // create 3 hands with the no-arg constructor
        Hand p1 = new Hand();
        Hand p2 =  new Hand();
        Hand p3 = new Hand();
        
        // create an additional hand with the 
        // full-arg constructor, this requires an arrauy list
        // so  create an arraylist of cards to pass into the
        // constructor
        ArrayList<Card> th = new ArrayList();
        for(int i = 0; i < 10; i++)
            th.add(deck.deal());
            
        Hand p4 = new Hand(th);
        
        // deal cards to empty hands
        for(int i = 0; i < 10; i++){
            p1.addCard(deck.deal());
            p2.addCard(deck.deal());
            p3.addCard(deck.deal());
        }//end for (load hands 1-3_
        
        // display the hands
        System.out.println("Player 1:");
        System.out.println(p1.evaluate());
        
        System.out.println("Player 2:");
        System.out.println(p2.evaluate());
        
        System.out.println("Player 3:");
        System.out.println(p3.evaluate());
        
        System.out.println("Player 4:");
        System.out.println(p4.evaluate());
        
        System.out.print("Number of cards remaining in deck: ");
        System.out.println(deck.evaluate());
        
        // all done
        System.out.println("end of program");
    }
}



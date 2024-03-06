import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class TestDriver{
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        Card c1 = new Card(Suit.valueOf("CLUBS"), Face.valueOf("K"));
        Card c2 = new Card(Suit.valueOf("HEARTS"), Face.valueOf("TEN"));
        Card c3 = new Card(Suit.valueOf("DIAMONDS"), Face.valueOf("A"));
        Card c4 = new Card(Suit.valueOf("SPADES"), Face.valueOf("TWO"));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        // test deck constructor
        Deck deck = new Deck();
        System.out.println(deck);
        
        // test shuffle method of deck
        deck.shuffle();
        System.out.println(deck);
        
        // test deal and evaluate method of deck
        System.out.println("size of deck: " + deck.evaluate());
        System.out.println(deck.deal());
        
        System.out.println(deck);
        System.out.println("size of deck: " + deck.evaluate());
        
        
        // test hand
        ArrayList<Card> tempHand = new ArrayList();
        
        for(int i = 0; i < 6; i++)
            tempHand.add(deck.deal());
            
            //tested with a hand of 7 cards, throws an illegal arguent exceptoi
            // is working
            
        Hand hand = new Hand(tempHand);
        System.out.println(hand);
        
        ArrayList<Card> th2 = new ArrayList();
        
        Hand h2 = new Hand();
        for(int i = 0; i < 6; i++)
            h2.addCard(deck.deal());            
        System.out.println(h2);
        
        // now with too many cards
        // tested and confirmed
        // for(int i = 0; i < 7; i++)
            // h2.addCard(deck.deal());            
        // System.out.println(h2);
        
        // test Hand evaluate
        System.out.println(h2.evaluate());
        
        // test colummn pairs
        Hand pairs = new Hand();
        pairs.addCard(new Card(Suit.CLUBS, Face.FOUR));
        pairs.addCard(new Card(Suit.CLUBS, Face.A));
        pairs.addCard(new Card(Suit.CLUBS, Face.TEN));
        pairs.addCard(new Card(Suit.CLUBS, Face.TWO));
        pairs.addCard(new Card(Suit.CLUBS, Face.Q));
        pairs.addCard(new Card(Suit.CLUBS, Face.TEN));
        
        System.out.println(pairs);
        System.out.println(pairs.evaluate());
        System.out.println("Cards remaining: " + deck.evaluate());

        
        


        System.out.println("end of program");
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/

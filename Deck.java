
/** 
 * ACS-1904 Assignment 2
 * @Sveinson 
 * 
 * Deck class: a deck of playing cards
 *              a standard deck has 52 cards
 *              size of deck is set from a constant 
 *              defined in the abstract class set of cards
*/

public class Deck extends SetOfCards{
    
    // constructor
    public Deck(){
       maxCards = SIZEOFDECK;
       // load deck of card
       createCards();
       
    }
    
    // implementation of abstract methods
    /*****************************************
    * Description: the number of cards left in the deck
    * 
    * @return       String: st, string representation of the 
    *                           current size of the deck
    *                           i.e. how many cards are left
    * ****************************************/
    public String evaluate(){
        String st = "";
        st += cards.size();
        return st;
    }// end evaluate
    
    // getters
    
    // setters
    
    // other
    
    /*****************************************
    * Description: create 13 cards of each suit, used in the constructor
    * 
    * ****************************************/
    private void createCards(){
        Suit[] suits = Suit.values();
        Face[] faces = Face.values();
        
        for(int i = 0; i < suits.length; i++)
            for(int j = 0; j < faces.length; j++)
                this.addCard(new Card(suits[i], faces[j]));
    }// end create cards
        

    /*****************************************
    * Description: deal one card off the top of the deck (or off the bottom
    *               if you're Yosemite Sam). Reduces the deck size by one
    * 
    * @return       Card    the top card of the deck
    * ****************************************/
    public Card deal(){
        return cards.remove(0);
    }// end deal
}


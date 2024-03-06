
/** 
 * ACS-1904 Assignment 2
 * @Sveinson 
 * 
 * Card class: one card, as in a playing card, has a face and 
 * value i.e. 2, 3, Ace, King, etc..
*/

public class Card{
    // instance variables/fields
    Suit suit;
    Face face;
    
    // constructors
    public Card(Suit s, Face f){
        suit = s;
        face = f;
    }// end constructor
    
    // getters
    /*****************************************
    * Description: get the suit of the card
    * 
    * @return       Suit suit: the suit of the card
    * ****************************************/
    public Suit getSuit(){
        return suit;
    }// end get suit
    
    /*****************************************
    * Description: get the face value of the card
    * 
    * @return       Face face: the face value of the card
    * ****************************************/
    public Face getFace(){
        return face;
    } // end get face
    
    // setters
    /*****************************************
    * Description: assign a new value to the suit field of the card
    * 
    * @param        Suit s: the new suit of the card
    * ****************************************/
    public void setSuit(Suit s){
        suit = s;
    }// end set suit
    
    /*****************************************
    * Description: assign a new face valvue to the card
    * 
    * @param        Face f: the new face value of the card
    * ****************************************/
    public void setFace(Face f){
        face = f;
    }// end setFace
    
    // other methods
    @Override
    public String toString(){
        String st;
        
        st = face.getDisplay() + suit.getDisplay();
        return st;
    }// end toString

}



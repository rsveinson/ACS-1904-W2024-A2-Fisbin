
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.util.Collections;
/** 
 * ACS-1904 Assignment 2
 * @Sveinson 
 * 
 * Hand class: one hand of cards, max size taken from a constant
 *              defined in set of cards
 *              the hand can be set by the constructor or by adding
 *              cards one at a time
 */

public class Hand extends SetOfCards{
    // use the cards arrauy list from SetOfCards
    // int maxCards from SetOfCards

    // constructors
    public Hand(){
        super();            // creates the arraylist that will hold the 6 cards
        maxCards = SIZEOFHAND;
    }// end no-arg constructor

    /*****************************************
     * Description: create a Hand object with 6 cards already present
     *              since the array list of cards is aparameter we might as well
     *              throw an illegal argument exception if it is too big (or too small)
     * 
     * @param        ArrayList<Card> an arraylist of cards containg no more than 
     *                               6 cards.                               
     * ****************************************/
    public Hand(ArrayList<Card> c){
        if(c.size() > SIZEOFHAND)
            throw new IllegalArgumentException("too many cards");

        maxCards = SIZEOFHAND;
        setCards(c);
    }// end initialized constructor

    // abstract method implementation
    /*****************************************
     * Description: evaluates the point value of the hand
     * 
     * @return       String: the hand and the point value
     * ****************************************/
    public String evaluate(){
        StringBuilder st = new StringBuilder();
        int value = 0;
        ArrayList<Card> tempCards = new ArrayList<>();
        ArrayList<Card> combination = new ArrayList<>();

        // add the representation of the hand to the output
        st.append(this.toString());

        // copy the array list into a destructable clone
        for(Card c : cards){
            tempCards.add(c);
        }

        // test the copy
        // System.out.println("cards:      " + cards);
        //System.out.println("temp cards: " + tempCards);

        // scan for combinations on the temp card list
        int upper = tempCards.size();
        while(tempCards.size() > 1){
            // get the first card
            combination.add(tempCards.remove(0));

            for(int j = 0; j < tempCards.size(); j++){
                if(combination.get(0).getFace() == tempCards.get(j).getFace()){
                    // add the currenr card to the combination list
                    // remove the current card from the hand list
                    combination.add(tempCards.remove(j));

                    // decrement j so the next iteration will be at current j
                    j--;
                }// end found a match
            }// end j
            //System.out.println("combination list: " + combination);
            //System.out.println("temp cards: " + tempCards);

            // calculate the score for this combination
            switch(combination.size()){
                case 4:    value += combination.get(0).getFace().getPoints() * 4 * 10;
                    break;
                case 3: value += combination.get(0).getFace().getPoints() * 3 * 7;
                    break;
                case 2: value += combination.get(0).getFace().getPoints() * 2 * 4;
                    break;
                default: value += 0;
            }

            // clear the combination list
            combination.clear();
        }// end for i

        
        st.append("Score: " + value + "\n");
        return st.toString();
    }// end evaluate

    // getters

    // setters

    //other
    /*****************************************
     * Description: override toString to return a string of 
     *               a 2 row by 3 column hand of cards
     * 
     * @return       String a 2x3 representation of a hand of cards 
     * ****************************************/
    @Override
    public String toString(){
        int counter = 1;
        StringBuilder st = new StringBuilder();   

        for(Card c : cards){
            st.append(c  + "\t");
            if(counter++ == 5){
                st.append("\n");
                counter = 1;
            }// end  cards printed

        }// end for
        st.append("\n");
        return st.toString();
    }// end toString

}

/*****************************************
 * Description: brief description of the methods purpose
 * 
 * @param        each parameter of the method should be listed with an @param
 * @param        parametername description of parameter
 * 
 * @return       any return value will be noted here
 * ****************************************/

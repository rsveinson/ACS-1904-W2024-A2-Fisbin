
/**
 * Enumeration class Face, one constant for each of the faces in a suit of
 *                  cards, ACE, 2, 3, ... up to KING
 *
 * @author SVeinson
 * @version Assignent 2
 */
public enum Face
{
    A("A", 1), TWO("2", -2), THREE("3", 3), FOUR("4", 4), FIVE("5", 5), 
    SIX("6", 6), SEVEN("7", 7), EIGHT("8", 8), NINE("9", 9), TEN("10", 10), 
    J("J", 10), Q("Q", 10), K("K", 12);
            
            
    private String display;
    private int points;
    
    // constructor
    private Face(String f, int p){
        display = f;
        points = p;
    }
    
    public String getDisplay(){
        return display;
    }
    
    public int getPoints(){
        return points;
    }
    
}


/**
 * Enumeration class Planets - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum EnumTeplate
{
    MERCURY("Mercury", 0, false),   VENUS("Venus", 0, false),
            EARTH("Earth", 1, false), MARS("Mars", 2, false),
            JUPITER("Jupiter", 67, true), SATURN("Saturn", 62, true),
            URANUS("Uranus", 27, true), NEPTUNE("Neptune", 14, true);
            
    private String friendlyName;    // this is for the extra challenge
    private int moons;
    private boolean jovian;
    
    // constructor
    private EnumTeplate(String fn, int m, boolean j){
        friendlyName = fn;
        moons = m;
        jovian = j;
    }
    
    public String getFriendlyName(){
        return friendlyName;
    }
    
    public int getMoons(){
        return moons;
    }
    
    public boolean isJovian(){
        return jovian;
    }
    
 // extra challenge toSting() method
/*    
    @Override
    public String toString(){
        return friendlyName;
    }
 */
}

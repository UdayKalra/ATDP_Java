
/**
 * Creates a playing card.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    String val;
    String suit;

    /**
     * Creates the card.
     * @param x Value
     * @param y Suit
     */
    public Card(String x, String y)
    {
    
    if (x.equals("A")){
        val = "Ace";
    }
    else if(x.equals("J")){
        val="Jack";
    }
    else if(x.equals("Q")){
        val="Queen";
    }
    else if(x.equals("K")){
        val="Jack";
    }
    else if(x.equals("2")||x.equals("3")||x.equals("4")||x.equals("5")||x.equals("6")||x.equals("7")||x.equals("8")||x.equals("9")||x.equals("10")){
        val = x;;
    }else{
        val = "unknown";
    }
    
    if(y.equals("D")){
    suit="Diamonds";
    }
    else if(y.equals("H")){
    suit="Hearts";
    }
    else if(y.equals("S")){
    suit = "Spades";
    }
    else if(y.equals("C")){
    suit="Clubs";    
    }
    else{
    suit = "unknown";
        }
    }
    /**
     * Returns card description.
     */
    public String getDescription(){
    return val+" of "+suit;
    
    }
}


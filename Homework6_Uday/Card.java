
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
    
    if (x=="A"){
        val = "Ace";
    }
    else if(x=="J"){
        val="Jack";
    }
    else if(x=="Q"){
        val="Queen";
    }
    else if(x=="K"){
        val="Jack";
    }
    else if(x=="2"||x=="3"||x=="4"||x=="5"||x=="6"||x=="7"||x=="8"||x=="9"||x=="10"){
        x=val;
    }else{
        val = "unknown";
    }
    
    if(y=="D"){
    suit="Diamonds";
    }
    else if(y=="H"){
    suit="Hearts";
    }
    else if(y=="S"){
    suit = "Spades";
    }
    else if(y=="C"){
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



/**
 * .
 * 
 * @author Uday Kalra
 * @version 1.0
 */
public class Letter
{
    public String w;
    public String x;
    public String y;
    public String body ="";
    public String text;
/**
 * Creates a letter with a sender and recipient.
 * @param from the sender.
 * @param to the recipient
 */
public Letter(String from, String to){
    x = from;
    y = to;

}  
/**
 * Adds a new line to the letter.
 * @param line the new line of text.
 */
public void addLine(String line){
    w = line;
  
     body = body.concat(line).concat("\n");
    
}
public String getText(){
 text = "Dear "+y+","+"\n"+body+"Sincerely" + "\n"+ "\n"+x;
 return text;
}
}

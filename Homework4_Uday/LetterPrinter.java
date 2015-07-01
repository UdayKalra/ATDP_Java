
/**
 * Prints a "Dear John" letter
 * 
 * @author Uday Kalra
 * @version 1.0
 */
public class LetterPrinter
{
    // instance variables - replace the example below with your own
   public static void main(String[] args){
       Letter john = new Letter("Mary", "John");
       john.addLine("I am sorry we must part.");
       john.addLine("I wish you all the best");
       System.out.println(john.getText());
    }
}

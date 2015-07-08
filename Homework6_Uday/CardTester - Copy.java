import java.util.Scanner;
/**
 * Tests card class.
 * 
 * @author Uday
 * @version 1.0
 */
public class CardTester
{
    String str1 = "";
    public static void main(String[] args){
        try{
            String x = "";
            String y = "";
            
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter your x-value: ");
            x = scan.next();
            System.out.print("Please enter your y-value: ");
            y = scan.next();
            
            Card card1 = new Card(x,y);
            System.out.print(card1.getDescription());
    }catch(Exception ex){
    System.out.print("Invalid Argument! GoodBye!");
    }}
   
    
}

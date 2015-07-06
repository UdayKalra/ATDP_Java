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
            String x = "A";
            String y = "S";
            System.out.print("Hi");
            Scanner scan = new Scanner(System.in);
            Card card1 = new Card(x,y);
            x = scan.next();
            y = scan.next();
            System.out.print(card1.getDescription());
    }catch(Exception ex){
    System.out.print("Invalid Argument! GoodBye!");
    }}
   
    
}
